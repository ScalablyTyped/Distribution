package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.Confirmed_
import typings.awsLambda.awsLambdaStrings.Denied
import typings.awsLambda.awsLambdaStrings.None
import typings.awsLambda.lexMod.LexSlotDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfirmationStatus extends js.Object {
  var confirmationStatus: None | Confirmed_ | Denied
  var name: String
  var slotDetails: LexSlotDetails
  var slots: StringDictionary[String | Null]
}

object AnonConfirmationStatus {
  @scala.inline
  def apply(
    confirmationStatus: None | Confirmed_ | Denied,
    name: String,
    slotDetails: LexSlotDetails,
    slots: StringDictionary[String | Null]
  ): AnonConfirmationStatus = {
    val __obj = js.Dynamic.literal(confirmationStatus = confirmationStatus.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slotDetails = slotDetails.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirmationStatus]
  }
}

