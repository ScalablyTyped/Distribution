package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdatePhoneNumberRequest extends StObject {
  
  /**
    * The request containing the phone number IDs and product types or calling names to update.
    */
  var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
}
object BatchUpdatePhoneNumberRequest {
  
  inline def apply(UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList): BatchUpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(UpdatePhoneNumberRequestItems = UpdatePhoneNumberRequestItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdatePhoneNumberRequest]
  }
  
  extension [Self <: BatchUpdatePhoneNumberRequest](x: Self) {
    
    inline def setUpdatePhoneNumberRequestItems(value: UpdatePhoneNumberRequestItemList): Self = StObject.set(x, "UpdatePhoneNumberRequestItems", value.asInstanceOf[js.Any])
    
    inline def setUpdatePhoneNumberRequestItemsVarargs(value: UpdatePhoneNumberRequestItem*): Self = StObject.set(x, "UpdatePhoneNumberRequestItems", js.Array(value :_*))
  }
}
