package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdatePhoneNumberRequest extends js.Object {
  /**
    * The request containing the phone number IDs and product types to update.
    */
  var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
}

object BatchUpdatePhoneNumberRequest {
  @scala.inline
  def apply(UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList): BatchUpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(UpdatePhoneNumberRequestItems = UpdatePhoneNumberRequestItems)
  
    __obj.asInstanceOf[BatchUpdatePhoneNumberRequest]
  }
}

