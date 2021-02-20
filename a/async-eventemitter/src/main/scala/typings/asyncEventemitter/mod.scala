package typings.asyncEventemitter

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * An EventEmitter that supports serial execution of asynchronous event listeners.
    * It also supports event listeners without callbacks (synchronous), as well as
    * interrupting the call-chain (similar to the DOM's e.stopPropagation()).
    */
  @JSImport("async-eventemitter", JSImport.Namespace)
  @js.native
  class ^[T /* <: EventMap */] () extends AsyncEventEmitter[T]
  
  /**
    * An EventEmitter that supports serial execution of asynchronous event listeners.
    * It also supports event listeners without callbacks (synchronous), as well as
    * interrupting the call-chain (similar to the DOM's e.stopPropagation()).
    */
  @js.native
  trait AsyncEventEmitter[T /* <: EventMap */] extends EventEmitter {
    
    // https://github.com/andywer/typed-emitter/blob/master/index.d.ts
    def addListener[E /* <: /* keyof T */ String */](
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
    def after[E /* <: /* keyof T */ String */](
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
    def at[E /* <: /* keyof T */ String */](
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
    def before[E /* <: /* keyof T */ String */](
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
    def emit[E /* <: /* keyof T */ String */](
      event: E with String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T[E]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
        ]
    ): Boolean = js.native
    
    /**
      * Adds a listener to the beginning of the listeners array for the specified event.
      * @param event EventMap key (event name)
      * @param listener EventMap value (event function)
      * @see https://www.npmjs.com/package/async-eventemitter#important-differences-between-asynceventemitter-the-native-eventemitter
      */
    def first[E /* <: /* keyof T */ String */](
      event: E with String,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
    ): this.type = js.native
    
    def on[E /* <: /* keyof T */ String */](
      event: E with String,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
    ): this.type = js.native
    
    def once[E /* <: /* keyof T */ String */](
      event: E with String,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
    ): this.type = js.native
    
    def prependListener[E /* <: /* keyof T */ String */](
      event: E with String,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
    ): this.type = js.native
    
    def prependOnceListener[E /* <: /* keyof T */ String */](
      event: E with String,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
    ): this.type = js.native
    
    def removeListener[E /* <: /* keyof T */ String */](
      event: E with String,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: T[E] */ js.Any
    ): this.type = js.native
  }
  
  type AsyncListener[T, R] = js.Function2[/* data */ T, /* callback */ js.Function1[js.UndefOr[R], Unit], js.Promise[R] | Unit]
  
  type EventMap = StringDictionary[AsyncListener[js.Any, js.Any]]
}
