package typings.adone

import org.scalablytyped.runtime.Instantiable0
import typings.node.NodeJSNs.ErrnoException
import typings.node.NodeJSNs.ReadWriteStream
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofstream extends js.Object {
  // Note: Duplex extends both Readable and Writable.
  var Duplex: Instantiable0[typings.adone.glossesStdMod.streamNs.Duplex] = js.native
  var PassThrough: Instantiable0[typings.adone.glossesStdMod.streamNs.PassThrough] = js.native
  var Readable: TypeofClassReadable = js.native
  var Stream: Instantiable0[typings.adone.glossesStdMod.streamNs.Stream] = js.native
  var Transform: Instantiable0[typings.adone.glossesStdMod.streamNs.Transform] = js.native
  var Writable: Instantiable0[typings.adone.glossesStdMod.streamNs.Writable] = js.native
  val finishedNs: Typeoffinished = js.native
  val pipelineNs: Typeofpipeline = js.native
  def finished(stream: ReadWriteStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def finished(stream: ReadableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def finished(stream: WritableStream, callback: js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]): js.Function0[Unit] = js.native
  def pipeline(
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = js.native
  def pipeline(
    stream1: ReadableStream,
    stream2: WritableStream,
    streams: (ReadWriteStream | WritableStream | (js.Function1[/* err */ ErrnoException | Null, Unit]))*
  ): WritableStream = js.native
  def pipeline(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): WritableStream = js.native
  def pipeline(
    streams: js.Array[ReadableStream | WritableStream | ReadWriteStream],
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): WritableStream = js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: T): T = js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: T, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): T = js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: T): T = js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  def pipeline[T /* <: WritableStream */](stream1: ReadableStream, stream2: ReadWriteStream, stream3: ReadWriteStream, stream4: T): T = js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T
  ): T = js.native
  def pipeline[T /* <: WritableStream */](
    stream1: ReadableStream,
    stream2: ReadWriteStream,
    stream3: ReadWriteStream,
    stream4: ReadWriteStream,
    stream5: T,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): T = js.native
}

