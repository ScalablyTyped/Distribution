package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecycleTransitionReason extends StObject {
  
  var Message: js.UndefOr[ErrorMessage] = js.undefined
}
object LifecycleTransitionReason {
  
  inline def apply(): LifecycleTransitionReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleTransitionReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifecycleTransitionReason] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
