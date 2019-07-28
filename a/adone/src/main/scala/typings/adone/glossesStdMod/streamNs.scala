package typings.adone.glossesStdMod

import typings.node.AsyncIterable
import typings.node.Iterable
import typings.node.NodeJSNs.ErrnoException
import typings.node.NodeJSNs.ReadWriteStream
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.TransformOptions
import typings.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "stream")
@js.native
object streamNs extends js.Object {
  // Note: Duplex extends both Readable and Writable.
  @js.native
  class Duplex ()
    extends typings.node.streamMod.Duplex {
    def this(opts: DuplexOptions) = this()
  }
  
  @js.native
  class PassThrough ()
    extends typings.node.streamMod.PassThrough
  
  @js.native
  class Readable ()
    extends typings.node.streamMod.Readable {
    def this(opts: ReadableOptions) = this()
  }
  
  @js.native
  class Stream ()
    extends typings.node.streamMod.Stream
  
  @js.native
  class Transform ()
    extends typings.node.streamMod.Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @js.native
  class Writable ()
    extends typings.node.streamMod.Writable {
    def this(opts: WritableOptions) = this()
  }
  
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
  /* static members */
  @js.native
  object Readable extends js.Object {
    def from(iterable: AsyncIterable[_]): typings.node.streamMod.Readable = js.native
    def from(iterable: AsyncIterable[_], options: ReadableOptions): typings.node.streamMod.Readable = js.native
    /**
      * A utility method for creating Readable Streams out of iterators.
      */
    def from(iterable: Iterable[_]): typings.node.streamMod.Readable = js.native
    def from(iterable: Iterable[_], options: ReadableOptions): typings.node.streamMod.Readable = js.native
  }
  
  @JSName("finished")
  @js.native
  object finishedNs extends js.Object {
    def __promisify__(stream: ReadWriteStream): js.Promise[Unit] = js.native
    def __promisify__(stream: ReadableStream): js.Promise[Unit] = js.native
    def __promisify__(stream: WritableStream): js.Promise[Unit] = js.native
  }
  
  @JSName("pipeline")
  @js.native
  object pipelineNs extends js.Object {
    def __promisify__(
      stream1: ReadableStream,
      stream2: ReadWriteStream,
      stream3: ReadWriteStream,
      stream4: ReadWriteStream,
      stream5: WritableStream
    ): js.Promise[Unit] = js.native
    def __promisify__(
      stream1: ReadableStream,
      stream2: ReadWriteStream,
      stream3: ReadWriteStream,
      stream4: WritableStream
    ): js.Promise[Unit] = js.native
    def __promisify__(stream1: ReadableStream, stream2: ReadWriteStream, stream3: WritableStream): js.Promise[Unit] = js.native
    def __promisify__(stream1: ReadableStream, stream2: ReadWriteStream, streams: (ReadWriteStream | WritableStream)*): js.Promise[Unit] = js.native
    def __promisify__(stream1: ReadableStream, stream2: WritableStream): js.Promise[Unit] = js.native
    def __promisify__(stream1: ReadableStream, stream2: WritableStream, streams: (ReadWriteStream | WritableStream)*): js.Promise[Unit] = js.native
    def __promisify__(streams: js.Array[ReadableStream | WritableStream | ReadWriteStream]): js.Promise[Unit] = js.native
  }
  
}

