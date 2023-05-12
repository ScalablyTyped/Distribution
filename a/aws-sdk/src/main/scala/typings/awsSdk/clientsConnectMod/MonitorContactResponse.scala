package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorContactResponse extends StObject {
  
  /**
    * The ARN of the contact.
    */
  var ContactArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the contact.
    */
  var ContactId: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactId] = js.undefined
}
object MonitorContactResponse {
  
  inline def apply(): MonitorContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorContactResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitorContactResponse] (val x: Self) extends AnyVal {
    
    inline def setContactArn(value: ARN): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setContactArnUndefined: Self = StObject.set(x, "ContactArn", js.undefined)
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
  }
}
