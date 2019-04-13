package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsuccessfulInstanceCreditSpecificationItemError extends js.Object {
  /**
    * The error code.
    */
  var Code: js.UndefOr[UnsuccessfulInstanceCreditSpecificationErrorCode] = js.undefined
  /**
    * The applicable error message.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object UnsuccessfulInstanceCreditSpecificationItemError {
  @scala.inline
  def apply(Code: UnsuccessfulInstanceCreditSpecificationErrorCode = null, Message: String = null): UnsuccessfulInstanceCreditSpecificationItemError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[UnsuccessfulInstanceCreditSpecificationItemError]
  }
}

