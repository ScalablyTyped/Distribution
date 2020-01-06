package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewPolicy extends js.Object {
  /**
    * Name of the parameter from the Review policy.
    */
  var Parameters: js.UndefOr[PolicyParameterList] = js.native
  /**
    *  Name of a Review Policy: SimplePlurality/2011-09-01 or ScoreMyKnownAnswers/2011-09-01 
    */
  var PolicyName: String = js.native
}

object ReviewPolicy {
  @scala.inline
  def apply(PolicyName: String, Parameters: PolicyParameterList = null): ReviewPolicy = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewPolicy]
  }
}

