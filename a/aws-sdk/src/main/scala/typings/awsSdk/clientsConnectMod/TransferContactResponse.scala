package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferContactResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact.
    */
  var ContactArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the contact in this instance of Amazon Connect. 
    */
  var ContactId: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactId] = js.undefined
}
object TransferContactResponse {
  
  inline def apply(): TransferContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferContactResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferContactResponse] (val x: Self) extends AnyVal {
    
    inline def setContactArn(value: ARN): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
    
    inline def setContactArnUndefined: Self = StObject.set(x, "ContactArn", js.undefined)
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
  }
}
