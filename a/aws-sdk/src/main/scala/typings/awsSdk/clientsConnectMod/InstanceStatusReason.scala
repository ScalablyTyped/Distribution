package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceStatusReason extends StObject {
  
  /**
    * The message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object InstanceStatusReason {
  
  inline def apply(): InstanceStatusReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatusReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceStatusReason] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
