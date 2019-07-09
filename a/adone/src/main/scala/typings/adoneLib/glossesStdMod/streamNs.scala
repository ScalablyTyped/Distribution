package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "stream")
@js.native
object streamNs extends js.Object {
  // Note: Duplex extends both Readable and Writable.
  @js.native
  class Duplex ()
    extends nodeLib.streamMod.Duplex {
    def this(opts: nodeLib.streamMod.DuplexOptions) = this()
  }
  
  @js.native
  class PassThrough ()
    extends nodeLib.streamMod.PassThrough
  
  @js.native
  class Readable ()
    extends nodeLib.streamMod.Readable {
    def this(opts: nodeLib.streamMod.ReadableOptions) = this()
  }
  
  @js.native
  class Stream ()
    extends nodeLib.streamMod.Stream
  
  @js.native
  class Transform ()
    extends nodeLib.streamMod.Transform {
    def this(opts: nodeLib.streamMod.TransformOptions) = this()
  }
  
  @js.native
  class Writable ()
    extends nodeLib.streamMod.Writable {
    def this(opts: nodeLib.streamMod.WritableOptions) = this()
  }
  
  def finished(
    stream: nodeLib.NodeJSNs.ReadWriteStream,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException | scala.Null], scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def finished(
    stream: nodeLib.NodeJSNs.ReadableStream,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException | scala.Null], scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def finished(
    stream: nodeLib.NodeJSNs.WritableStream,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException | scala.Null], scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def pipeline(
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    streams: (nodeLib.NodeJSNs.ReadWriteStream | nodeLib.NodeJSNs.WritableStream | (js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]))*
  ): nodeLib.NodeJSNs.WritableStream = js.native
  def pipeline(
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.WritableStream,
    streams: (nodeLib.NodeJSNs.ReadWriteStream | nodeLib.NodeJSNs.WritableStream | (js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]))*
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
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): nodeLib.NodeJSNs.WritableStream = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](stream1: nodeLib.NodeJSNs.ReadableStream, stream2: T): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: T,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](stream1: nodeLib.NodeJSNs.ReadableStream, stream2: nodeLib.NodeJSNs.ReadWriteStream, stream3: T): T = js.native
  def pipeline[T /* <: nodeLib.NodeJSNs.WritableStream */](
    stream1: nodeLib.NodeJSNs.ReadableStream,
    stream2: nodeLib.NodeJSNs.ReadWriteStream,
    stream3: T,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
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
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
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
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): T = js.native
  /* static members */
  @js.native
  object Readable extends js.Object {
    def from(iterable: nodeLib.AsyncIterable[_]): nodeLib.streamMod.Readable = js.native
    def from(iterable: nodeLib.AsyncIterable[_], options: nodeLib.streamMod.ReadableOptions): nodeLib.streamMod.Readable = js.native
    /**
      * A utility method for creating Readable Streams out of iterators.
      */
    def from(iterable: nodeLib.Iterable[_]): nodeLib.streamMod.Readable = js.native
    def from(iterable: nodeLib.Iterable[_], options: nodeLib.streamMod.ReadableOptions): nodeLib.streamMod.Readable = js.native
  }
  
  @JSName("finished")
  @js.native
  object finishedNs extends js.Object {
    def __promisify__(stream: nodeLib.NodeJSNs.ReadWriteStream): js.Promise[scala.Unit] = js.native
    def __promisify__(stream: nodeLib.NodeJSNs.ReadableStream): js.Promise[scala.Unit] = js.native
    def __promisify__(stream: nodeLib.NodeJSNs.WritableStream): js.Promise[scala.Unit] = js.native
  }
  
  @JSName("pipeline")
  @js.native
  object pipelineNs extends js.Object {
    def __promisify__(
      stream1: nodeLib.NodeJSNs.ReadableStream,
      stream2: nodeLib.NodeJSNs.ReadWriteStream,
      stream3: nodeLib.NodeJSNs.ReadWriteStream,
      stream4: nodeLib.NodeJSNs.ReadWriteStream,
      stream5: nodeLib.NodeJSNs.WritableStream
    ): js.Promise[scala.Unit] = js.native
    def __promisify__(
      stream1: nodeLib.NodeJSNs.ReadableStream,
      stream2: nodeLib.NodeJSNs.ReadWriteStream,
      stream3: nodeLib.NodeJSNs.ReadWriteStream,
      stream4: nodeLib.NodeJSNs.WritableStream
    ): js.Promise[scala.Unit] = js.native
    def __promisify__(
      stream1: nodeLib.NodeJSNs.ReadableStream,
      stream2: nodeLib.NodeJSNs.ReadWriteStream,
      stream3: nodeLib.NodeJSNs.WritableStream
    ): js.Promise[scala.Unit] = js.native
    def __promisify__(
      stream1: nodeLib.NodeJSNs.ReadableStream,
      stream2: nodeLib.NodeJSNs.ReadWriteStream,
      streams: (nodeLib.NodeJSNs.ReadWriteStream | nodeLib.NodeJSNs.WritableStream)*
    ): js.Promise[scala.Unit] = js.native
    def __promisify__(stream1: nodeLib.NodeJSNs.ReadableStream, stream2: nodeLib.NodeJSNs.WritableStream): js.Promise[scala.Unit] = js.native
    def __promisify__(
      stream1: nodeLib.NodeJSNs.ReadableStream,
      stream2: nodeLib.NodeJSNs.WritableStream,
      streams: (nodeLib.NodeJSNs.ReadWriteStream | nodeLib.NodeJSNs.WritableStream)*
    ): js.Promise[scala.Unit] = js.native
    def __promisify__(
      streams: js.Array[
          nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.WritableStream | nodeLib.NodeJSNs.ReadWriteStream
        ]
    ): js.Promise[scala.Unit] = js.native
  }
  
}

