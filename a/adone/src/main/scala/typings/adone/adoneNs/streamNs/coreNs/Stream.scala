package typings.adone.adoneNs.streamNs.coreNs

import typings.adone.Anon_EndBoolean
import typings.adone.Anon_EndSourceOptions
import typings.adone.Anon_Passthrough
import typings.adone.Anon_PassthroughBoolean
import typings.adone.adoneNs.streamNs.coreNs.INs.ConstructorOptions
import typings.adone.adoneNs.streamNs.coreNs.INs.FlushFunction
import typings.adone.adoneNs.streamNs.coreNs.INs.Source
import typings.adone.adoneNs.streamNs.coreNs.INs.TransformFunction
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a chain of transform streams
  */
@JSGlobal("adone.stream.core.Stream")
@js.native
class Stream[S, T] ()
  extends PromiseLike[js.Array[T]] {
  def this(source: Source[S, T]) = this()
  def this(source: Source[S, T], options: ConstructorOptions[S, T]) = this()
  /**
    * Creates a promise that will be fulfilled with an array of all the emitted values or the first occurred error.
    *
    * This method resumes the stream.
    */
  def `catch`[T1](): js.Promise[js.Array[T] | T1] = js.native
  def `catch`[T1](onReject: js.Function1[/* reason */ js.Any, T1 | js.Thenable[T1]]): js.Promise[js.Array[T] | T1] = js.native
  /**
    * Destroys the stream
    */
  def destroy(): this.type = js.native
  /**
    * Adds a new transform that calls the given callback when the underlying stream ends.
    *
    * This method resumes the stream.
    */
  def done(callback: js.Function0[Unit]): this.type = js.native
  def done(callback: js.Function0[Unit], options: Anon_PassthroughBoolean): this.type = js.native
  /**
    * Ends the stream
    */
  def end(): this.type = js.native
  /**
    * Adds a new filter transform into the chain
    */
  def filter(callback: js.Function1[/* value */ T, Boolean | js.Promise[Boolean]]): this.type = js.native
   // ??
  /**
    * Flattens all the read array values
    */
  def flatten(): Stream[S, T] = js.native
  /**
    * Adds a new transform that calls the given callback for each value from the stream.
    *
    * This method resumes the stream.
    */
  def forEach(callback: js.Function1[/* value */ T, Unit]): this.type = js.native
  def forEach(callback: js.Function1[/* value */ T, Unit], options: Anon_Passthrough): this.type = js.native
  /**
    * Whether the stream is ended
    */
  def isEnded(): Boolean = js.native
  /**
    * Whether the stream is paused
    */
  def isPaused(): Boolean = js.native
  /**
    * Adds a new map transform into the chain.
    *
    * Note: synchronous functions create a synchronous transform.
    * If your function returns a promise use an asynchronous function if you don't want to pass a promise through the stream
    */
  def map[R](callback: js.Function1[/* value */ T, R | js.Promise[R]]): Stream[S, R] = js.native
  /**
    * Adds a new conditional map transform into the chain
    */
  def mapIf[R](
    condition: js.Function1[/* value */ T, Boolean | js.Promise[Boolean]],
    callback: js.Function1[/* value */ T, R]
  ): Stream[S, T | R] = js.native
  /**
    * Pauses the stream
    */
  def pause(): this.type = js.native
  /**
    * Pipes this stream to another
    */
  def pipe[T](stream: T): T = js.native
  def pipe[T](stream: T, options: Anon_EndBoolean): T = js.native
  /**
    * Pushes the given value into the stream
    */
  def push(value: T): Boolean = js.native
  /**
    * Resumes the stream
    */
  def resume(): this.type = js.native
  def stash(filter: js.Function1[/* value */ T, Boolean]): this.type = js.native
  /**
    * Adds a new transform that filters the values using the given given function with ability to restore the filtered values
    */
  def stash(name: String, filter: js.Function1[/* value */ T, Boolean]): this.type = js.native
  /**
    * Adds a new transform stream into the chain
    */
  def through[R](transform: TransformFunction[T, R]): Stream[S, R] = js.native
  def through[R](transform: TransformFunction[T, R], flush: FlushFunction[R]): Stream[S, R] = js.native
  /**
    * Adds a new asynchronous transform stream into the chain
    */
  def throughAsync[R](transform: TransformFunction[T, R]): Stream[S, R] = js.native
  def throughAsync[R](transform: TransformFunction[T, R], flush: FlushFunction[R]): Stream[S, R] = js.native
  /**
    * Adds a new synchronous transform stream into the chain
    */
  def throughSync[R](transform: TransformFunction[T, R]): Stream[S, R] = js.native
  def throughSync[R](transform: TransformFunction[T, R], flush: FlushFunction[R]): Stream[S, R] = js.native
  /**
    * Adds a new transform that gather all the read values into an array and calls the given callback
    * when the underlying stream ends.
    *
    * This method resumes the stream.
    */
  def toArray(callback: js.Function1[/* result */ js.Array[T], Unit]): this.type = js.native
  def toArray(callback: js.Function1[/* result */ js.Array[T], Unit], options: Anon_PassthroughBoolean): this.type = js.native
  /**
    * Adds a new transform that filters the values by their uniqueness
    *
    * @param prop callback that calculates value's hash which is used in uniqueness checks
    */
  def unique(): this.type = js.native
  def unique(prop: js.Function1[/* value */ T, _]): this.type = js.native
  /**
    * Adds a new transform that restores the previous stashed values
    */
  def unstash(): Stream[S, T] = js.native
  def unstash(name: String): Stream[S, T] = js.native
  /**
    * Writes the given value into the stream
    */
  def write(value: S): Boolean = js.native
}

/* static members */
@JSGlobal("adone.stream.core.Stream")
@js.native
object Stream extends js.Object {
   // ??
  /**
    * Merges the given stream into a core stream
    */
  def merge[S, T](streams: js.Array[(Stream[_, _]) | Transform | Readable | Duplex]): Stream[S, T] = js.native
  def merge[S, T](
    streams: js.Array[(Stream[_, _]) | Transform | Readable | Duplex],
    options: Anon_EndSourceOptions[S, T]
  ): Stream[S, T] = js.native
}

