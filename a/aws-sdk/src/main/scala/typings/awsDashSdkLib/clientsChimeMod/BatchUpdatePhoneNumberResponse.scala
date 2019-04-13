package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdatePhoneNumberResponse extends js.Object {
  /**
    * If the action fails for one or more of the phone numbers in the request, a list of the phone numbers is returned, along with error codes and error messages.
    */
  var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
}

object BatchUpdatePhoneNumberResponse {
  @scala.inline
  def apply(PhoneNumberErrors: PhoneNumberErrorList = null): BatchUpdatePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    if (PhoneNumberErrors != null) __obj.updateDynamic("PhoneNumberErrors")(PhoneNumberErrors)
    __obj.asInstanceOf[BatchUpdatePhoneNumberResponse]
  }
}

