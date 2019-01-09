package typings
package adoneLib.adoneNs.streamNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a chain of transform streams
  */
@JSGlobal("adone.stream.core.Stream")
@js.native
class Stream[S, T] ()
  extends stdLib.PromiseLike[js.Array[T]] {
  def this(source: adoneLib.adoneNs.streamNs.coreNs.INs.Source[S, T]) = this()
  def this(source: adoneLib.adoneNs.streamNs.coreNs.INs.Source[S, T], options: adoneLib.adoneNs.streamNs.coreNs.INs.ConstructorOptions[S, T]) = this()
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
  def done(callback: js.Function0[scala.Unit]): this.type = js.native
  def done(callback: js.Function0[scala.Unit], options: adoneLib.Anon_PassthroughBoolean): this.type = js.native
  /**
    * Ends the stream
    */
  def end(): this.type = js.native
  /**
    * Adds a new filter transform into the chain
    */
  def filter(callback: js.Function1[/* value */ T, scala.Boolean | js.Promise[scala.Boolean]]): this.type = js.native
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
  def forEach(callback: js.Function1[/* value */ T, scala.Unit]): this.type = js.native
  def forEach(callback: js.Function1[/* value */ T, scala.Unit], options: adoneLib.Anon_Passthrough): this.type = js.native
  /**
    * Whether the stream is ended
    */
  def isEnded(): scala.Boolean = js.native
  /**
    * Whether the stream is paused
    */
  def isPaused(): scala.Boolean = js.native
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
    condition: js.Function1[/* value */ T, scala.Boolean | js.Promise[scala.Boolean]],
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
  def pipe[T](stream: T, options: adoneLib.Anon_EndBoolean): T = js.native
  /**
    * Pushes the given value into the stream
    */
  def push(value: T): scala.Boolean = js.native
  /**
    * Resumes the stream
    */
  def resume(): this.type = js.native
  def stash(filter: js.Function1[/* value */ T, scala.Boolean]): this.type = js.native
  /**
    * Adds a new transform that filters the values using the given given function with ability to restore the filtered values
    */
  def stash(name: java.lang.String, filter: js.Function1[/* value */ T, scala.Boolean]): this.type = js.native
  /**
    * Adds a new transform stream into the chain
    */
  def through[R](transform: adoneLib.adoneNs.streamNs.coreNs.INs.TransformFunction[T, R]): Stream[S, R] = js.native
  def through[R](
    transform: adoneLib.adoneNs.streamNs.coreNs.INs.TransformFunction[T, R],
    flush: adoneLib.adoneNs.streamNs.coreNs.INs.FlushFunction[R]
  ): Stream[S, R] = js.native
  /**
    * Adds a new asynchronous transform stream into the chain
    */
  def throughAsync[R](transform: adoneLib.adoneNs.streamNs.coreNs.INs.TransformFunction[T, R]): Stream[S, R] = js.native
  def throughAsync[R](
    transform: adoneLib.adoneNs.streamNs.coreNs.INs.TransformFunction[T, R],
    flush: adoneLib.adoneNs.streamNs.coreNs.INs.FlushFunction[R]
  ): Stream[S, R] = js.native
  /**
    * Adds a new synchronous transform stream into the chain
    */
  def throughSync[R](transform: adoneLib.adoneNs.streamNs.coreNs.INs.TransformFunction[T, R]): Stream[S, R] = js.native
  def throughSync[R](
    transform: adoneLib.adoneNs.streamNs.coreNs.INs.TransformFunction[T, R],
    flush: adoneLib.adoneNs.streamNs.coreNs.INs.FlushFunction[R]
  ): Stream[S, R] = js.native
  /**
    * Adds a new transform that gather all the read values into an array and calls the given callback
    * when the underlying stream ends.
    *
    * This method resumes the stream.
    */
  def toArray(callback: js.Function1[/* result */ js.Array[T], scala.Unit]): this.type = js.native
  def toArray(
    callback: js.Function1[/* result */ js.Array[T], scala.Unit],
    options: adoneLib.Anon_PassthroughBoolean
  ): this.type = js.native
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
  def unstash(name: java.lang.String): Stream[S, T] = js.native
  /**
    * Writes the given value into the stream
    */
  def write(value: S): scala.Boolean = js.native
}

/**
  * Represents a chain of transform streams
  */
@JSGlobal("adone.stream.core.Stream")
@js.native
object Stream extends js.Object {
   // ??
  /**
    * Merges the given stream into a core stream
    */
  def merge[S, T](
    streams: js.Array[
      (adoneLib.adoneNs.streamNs.coreNs.Stream[_, _]) | nodeLib.streamMod.Transform | nodeLib.streamMod.Readable | nodeLib.streamMod.Duplex
    ]
  ): adoneLib.adoneNs.streamNs.coreNs.Stream[S, T] = js.native
  def merge[S, T](
    streams: js.Array[
      (adoneLib.adoneNs.streamNs.coreNs.Stream[_, _]) | nodeLib.streamMod.Transform | nodeLib.streamMod.Readable | nodeLib.streamMod.Duplex
    ],
    options: adoneLib.Anon_EndSourceOptions[S, T]
  ): adoneLib.adoneNs.streamNs.coreNs.Stream[S, T] = js.native
}

