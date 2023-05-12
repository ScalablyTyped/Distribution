package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdatePhoneNumberRequest extends StObject {
  
  /**
    * Lists the phone numbers in the update request.
    */
  var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
}
object BatchUpdatePhoneNumberRequest {
  
  inline def apply(UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList): BatchUpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(UpdatePhoneNumberRequestItems = UpdatePhoneNumberRequestItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdatePhoneNumberRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdatePhoneNumberRequest] (val x: Self) extends AnyVal {
    
    inline def setUpdatePhoneNumberRequestItems(value: UpdatePhoneNumberRequestItemList): Self = StObject.set(x, "UpdatePhoneNumberRequestItems", value.asInstanceOf[js.Any])
    
    inline def setUpdatePhoneNumberRequestItemsVarargs(value: UpdatePhoneNumberRequestItem*): Self = StObject.set(x, "UpdatePhoneNumberRequestItems", js.Array(value*))
  }
}
