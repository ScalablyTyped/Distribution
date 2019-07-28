package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationPolicyResponse extends js.Object {
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: js.UndefOr[__listOfApplicationPolicyStatement] = js.undefined
}

object GetApplicationPolicyResponse {
  @scala.inline
  def apply(Statements: __listOfApplicationPolicyStatement = null): GetApplicationPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Statements != null) __obj.updateDynamic("Statements")(Statements)
    __obj.asInstanceOf[GetApplicationPolicyResponse]
  }
}

