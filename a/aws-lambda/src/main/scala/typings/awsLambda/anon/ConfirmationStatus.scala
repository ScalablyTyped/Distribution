package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.Confirmed_
import typings.awsLambda.awsLambdaStrings.Denied
import typings.awsLambda.awsLambdaStrings.None
import typings.awsLambda.lexMod.LexSlotDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmationStatus extends js.Object {
  var confirmationStatus: None | Confirmed_ | Denied = js.native
  var name: String = js.native
  var slotDetails: LexSlotDetails = js.native
  var slots: StringDictionary[String | Null] = js.native
}

object ConfirmationStatus {
  @scala.inline
  def apply(
    confirmationStatus: None | Confirmed_ | Denied,
    name: String,
    slotDetails: LexSlotDetails,
    slots: StringDictionary[String | Null]
  ): ConfirmationStatus = {
    val __obj = js.Dynamic.literal(confirmationStatus = confirmationStatus.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slotDetails = slotDetails.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmationStatus]
  }
  @scala.inline
  implicit class ConfirmationStatusOps[Self <: ConfirmationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfirmationStatus(value: None | Confirmed_ | Denied): Self = this.set("confirmationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlotDetails(value: LexSlotDetails): Self = this.set("slotDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlots(value: StringDictionary[String | Null]): Self = this.set("slots", value.asInstanceOf[js.Any])
  }
  
}

