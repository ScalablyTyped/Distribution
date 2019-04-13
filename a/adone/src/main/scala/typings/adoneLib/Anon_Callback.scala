package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  // Note: Duplex extends both Readable and Writable.
  var Duplex: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.streamNs.Duplex] = js.native
  var PassThrough: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.streamNs.PassThrough] = js.native
  var Readable: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.streamNs.Readable] = js.native
  var Stream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.streamNs.Stream] = js.native
  var Transform: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.streamNs.Transform] = js.native
  var Writable: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.streamNs.Writable] = js.native
  val finishedNs: Anon_Promisify = js.native
  val pipelineNs: Anon_PromisifyStream1 = js.native
  def finished(
    stream: nodeLib.NodeJSNs.ReadWriteStream,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def finished(
    stream: nodeLib.NodeJSNs.ReadableStream,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def finished(
    stream: nodeLib.NodeJSNs.WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def pipeline(
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    streams: (nodeLib.NodeJSNs.ReadWriteStream | nodeLib.NodeJSNs.WritableStream | (js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]))*
  ): nodeLib.NodeJSNs.WritableStream = js.native
  def pipeline(
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.WritableStream,
    streams: (nodeLib.NodeJSNs.ReadWriteStream | nodeLib.NodeJSNs.WritableStream | (js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]))*
  ): nodeLib.NodeJSNs.WritableStream = js.native
  def pipeline(
    streams: js.Array[
      nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.WritableStream | nodeLib.NodeJSNs.ReadWriteStream
    ]
  ): nodeLib.NodeJSNs.WritableStream = js.native
  def pipeline(
    streams: js.Array[
      nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.WritableStream | nodeLib.NodeJSNs.ReadWriteStream
    ],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): nodeLib.NodeJSNs.WritableStream = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](stream1: nodeLib.NodeJSNs.ReadableStream, stream2: T): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: T,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](stream1: nodeLib.NodeJSNs.ReadableStream, stream2: nodeLib.NodeJSNs.ReadWriteStream, stream3: T): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: T,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: nodeLib.NodeJSNs.ReadWriteStream,
    stream4: T
  ): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: nodeLib.NodeJSNs.ReadWriteStream,
    stream4: T,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: nodeLib.NodeJSNs.ReadWriteStream,
    stream4: nodeLib.NodeJSNs.ReadWriteStream,
    stream5: T
  ): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: nodeLib.NodeJSNs.ReadWriteStream,
    stream4: nodeLib.NodeJSNs.ReadWriteStream,
    stream5: T,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): T = js.native
}

