package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdatePhoneNumberRequest extends js.Object {
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
}

