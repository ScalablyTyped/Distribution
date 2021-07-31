package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorNotificationOptions
  extends StObject
     with NotificationOptions {
  
  var stack: js.UndefOr[String] = js.undefined
}
object ErrorNotificationOptions {
  
  @scala.inline
  def apply(): ErrorNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorNotificationOptions]
  }
  
  @scala.inline
  implicit class ErrorNotificationOptionsMutableBuilder[Self <: ErrorNotificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
