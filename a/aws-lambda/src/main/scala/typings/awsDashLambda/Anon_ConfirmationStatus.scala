package typings.awsDashLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashLambda.awsDashLambdaMod.LexSlotDetails
import typings.awsDashLambda.awsDashLambdaStrings.Confirmed_
import typings.awsDashLambda.awsDashLambdaStrings.Denied
import typings.awsDashLambda.awsDashLambdaStrings.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfirmationStatus extends js.Object {
  var confirmationStatus: None | Confirmed_ | Denied
  var name: String
  var slotDetails: LexSlotDetails
  var slots: StringDictionary[String | Null]
}

object Anon_ConfirmationStatus {
  @scala.inline
  def apply(
    confirmationStatus: None | Confirmed_ | Denied,
    name: String,
    slotDetails: LexSlotDetails,
    slots: StringDictionary[String | Null]
  ): Anon_ConfirmationStatus = {
    val __obj = js.Dynamic.literal(confirmationStatus = confirmationStatus.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slotDetails = slotDetails.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ConfirmationStatus]
  }
}

