package typings.angularNotify

import typings.angularNotify.anon.Classes
import typings.angularNotify.anon.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object cgNotify {
    
    trait INotify extends StObject {
      
      /**
        * Close this open notifications.
        */
      def close(): Unit
      
      /**
        * The message to show.
        */
      var message: String
    }
    object INotify {
      
      inline def apply(close: () => Unit, message: String): INotify = {
        val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[INotify]
      }
      
      extension [Self <: INotify](x: Self) {
        
        inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait INotifyService extends StObject {
      
      /**
        * The notify function can either be passed a string or an object.
        * This function will return an object with a close() method and a message property.
        * @param message
        */
      def apply(message: String): INotify = js.native
      /**
        * When passing an object, the object parameters can be:
        * @param option
        */
      def apply(option: Classes): INotify = js.native
      
      /**
        * Closes all currently open notifications.
        */
      def closeAll(): Unit = js.native
      
      /**
        * Call config to set the default configuration options for angular-notify.
        * The following options may be specified in the given object:
        * @param option
        */
      def config(option: Container): Unit = js.native
    }
  }
}
