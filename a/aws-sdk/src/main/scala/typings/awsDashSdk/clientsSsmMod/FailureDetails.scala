package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailureDetails extends js.Object {
  /**
    * Detailed information about the Automation step failure.
    */
  var Details: js.UndefOr[AutomationParameterMap] = js.undefined
  /**
    * The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.
    */
  var FailureStage: js.UndefOr[String] = js.undefined
  /**
    * The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.
    */
  var FailureType: js.UndefOr[String] = js.undefined
}

object FailureDetails {
  @scala.inline
  def apply(Details: AutomationParameterMap = null, FailureStage: String = null, FailureType: String = null): FailureDetails = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details)
    if (FailureStage != null) __obj.updateDynamic("FailureStage")(FailureStage)
    if (FailureType != null) __obj.updateDynamic("FailureType")(FailureType)
    __obj.asInstanceOf[FailureDetails]
  }
}

