package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfirmationStatus extends js.Object {
  var confirmationStatus: awsDashLambdaLib.awsDashLambdaLibStrings.None | awsDashLambdaLib.awsDashLambdaLibStrings.Confirmed | awsDashLambdaLib.awsDashLambdaLibStrings.Denied
  var name: java.lang.String
  var slotDetails: awsDashLambdaLib.awsDashLambdaMod.LexSlotDetails
  var slots: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]
}

object Anon_ConfirmationStatus {
  @scala.inline
  def apply(
    confirmationStatus: awsDashLambdaLib.awsDashLambdaLibStrings.None | awsDashLambdaLib.awsDashLambdaLibStrings.Confirmed | awsDashLambdaLib.awsDashLambdaLibStrings.Denied,
    name: java.lang.String,
    slotDetails: awsDashLambdaLib.awsDashLambdaMod.LexSlotDetails,
    slots: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]
  ): Anon_ConfirmationStatus = {
    val __obj = js.Dynamic.literal(confirmationStatus = confirmationStatus.asInstanceOf[js.Any], name = name, slotDetails = slotDetails, slots = slots)
  
    __obj.asInstanceOf[Anon_ConfirmationStatus]
  }
}

