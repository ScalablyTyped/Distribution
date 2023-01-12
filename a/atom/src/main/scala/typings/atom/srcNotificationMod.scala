package typings.atom

import typings.atom.anon.ClassName
import typings.atom.atomStrings.error
import typings.atom.atomStrings.fatal
import typings.atom.atomStrings.info
import typings.atom.atomStrings.success
import typings.atom.atomStrings.warning
import typings.atom.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNotificationMod {
  
  @JSImport("atom/src/notification", "Notification")
  @js.native
  open class Notification protected () extends StObject {
    def this(`type`: error | fatal | info | success | warning, message: String) = this()
    def this(`type`: fatal | error, message: String, options: ErrorNotificationOptions) = this()
    def this(`type`: warning | info | success, message: String, options: NotificationOptions) = this()
    
    /**
      *  Dismisses the notification, removing it from the UI. Calling this
      *  programmatically will call all callbacks added via onDidDismiss.
      */
    def dismiss(): Unit = js.native
    
    /** Returns the Notification's message. */
    def getMessage(): String = js.native
    
    // Methods
    /** Returns the Notification's type. */
    def getType(): String = js.native
    
    // Event Subscription
    /** Invoke the given callback when the notification is dismissed. */
    def onDidDismiss(callback: js.Function1[/* notification */ this.type, Unit]): Disposable = js.native
    
    /** Invoke the given callback when the notification is displayed. */
    def onDidDisplay(callback: js.Function1[/* notification */ this.type, Unit]): Disposable = js.native
  }
  
  trait ErrorNotificationOptions
    extends StObject
       with NotificationOptions {
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ErrorNotificationOptions {
    
    inline def apply(): ErrorNotificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorNotificationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorNotificationOptions] (val x: Self) extends AnyVal {
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait NotificationOptions extends StObject {
    
    var buttons: js.UndefOr[js.Array[ClassName]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var detail: js.UndefOr[String] = js.undefined
    
    var dismissable: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
  }
  object NotificationOptions {
    
    inline def apply(): NotificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationOptions] (val x: Self) extends AnyVal {
      
      inline def setButtons(value: js.Array[ClassName]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: ClassName*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      inline def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
}
