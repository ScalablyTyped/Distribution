package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdatePhoneNumberRequest extends StObject {
  
  /**
    * The request containing the phone number IDs and product types or calling names to update.
    */
  var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList = js.native
}
object BatchUpdatePhoneNumberRequest {
  
  @scala.inline
  def apply(UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList): BatchUpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(UpdatePhoneNumberRequestItems = UpdatePhoneNumberRequestItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdatePhoneNumberRequest]
  }
  
  @scala.inline
  implicit class BatchUpdatePhoneNumberRequestMutableBuilder[Self <: BatchUpdatePhoneNumberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdatePhoneNumberRequestItems(value: UpdatePhoneNumberRequestItemList): Self = StObject.set(x, "UpdatePhoneNumberRequestItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatePhoneNumberRequestItemsVarargs(value: UpdatePhoneNumberRequestItem*): Self = StObject.set(x, "UpdatePhoneNumberRequestItems", js.Array(value :_*))
  }
}
