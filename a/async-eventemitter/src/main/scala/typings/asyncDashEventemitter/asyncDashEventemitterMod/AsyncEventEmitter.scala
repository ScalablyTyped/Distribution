package typings.asyncDashEventemitter.asyncDashEventemitterMod

import typings.node.eventsMod.EventEmitter
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An EventEmitter that supports serial execution of asynchronous event listeners.
  * It also supports event listeners without callbacks (synchronous), as well as
  * interrupting the call-chain (similar to the DOM's e.stopPropagation()).
  */
@js.native
trait AsyncEventEmitter[T /* <: EventMap */] extends EventEmitter {
  // https://github.com/andywer/typed-emitter/blob/master/index.d.ts
  def addListener[E /* <: String */](
    event: E with String,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
  ): this.type = js.native
  /**
    * Adds a listener after the target listener in the listeners array for the specified event.
    * @param event EventMap key (event name)
    * @param target Listener to insert before
    * @param listener EventMap value (event function)
    * @see https://www.npmjs.com/package/async-eventemitter#important-differences-between-asynceventemitter-the-native-eventemitter
    */
  def after[E /* <: String */](
    event: E with String,
    target: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
  ): this.type = js.native
  /**
    * Adds a listener at the specified index in the listeners array for the specified event.
    * @param event EventMap key (event name)
    * @param index Index to insert at
    * @param listener EventMap value (event function)
    * @see https://www.npmjs.com/package/async-eventemitter#important-differences-between-asynceventemitter-the-native-eventemitter
    */
  def at[E /* <: String */](
    event: E with String,
    index: Double,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
  ): this.type = js.native
  /**
    * Adds a listener before the target listener in the listeners array for the specified event.
    * @param event EventMap key (event name)
    * @param target Listener to insert before
    * @param listener EventMap value (event function)
    * @see https://www.npmjs.com/package/async-eventemitter#important-differences-between-asynceventemitter-the-native-eventemitter
    */
  def before[E /* <: String */](
    event: E with String,
    target: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
  ): this.type = js.native
  /**
    * Executes all listeners for the event in order with the supplied data argument.
    * The optional callback is called when all of the listeners are done.
    * @param event EventMap key (event name)
    * @param args EventMap parameters
    * @see https://www.npmjs.com/package/async-eventemitter#important-differences-between-asynceventemitter-the-native-eventemitter
    */
  def emit[E /* <: String */](
    event: E with String,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Parameters<T[E]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
    ]
  ): Boolean = js.native
  /**
    * Adds a listener to the beginning of the listeners array for the specified event.
    * @param event EventMap key (event name)
    * @param listener EventMap value (event function)
    * @see https://www.npmjs.com/package/async-eventemitter#important-differences-between-asynceventemitter-the-native-eventemitter
    */
  def first[E /* <: String */](
    event: E with String,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
  ): this.type = js.native
  def on[E /* <: String */](
    event: E with String,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
  ): this.type = js.native
  def once[E /* <: String */](
    event: E with String,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
  ): this.type = js.native
  def prependListener[E /* <: String */](
    event: E with String,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
  ): this.type = js.native
  def prependOnceListener[E /* <: String */](
    event: E with String,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
  ): this.type = js.native
  def removeListener[E /* <: String */](
    event: E with String,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
  ): this.type = js.native
}

