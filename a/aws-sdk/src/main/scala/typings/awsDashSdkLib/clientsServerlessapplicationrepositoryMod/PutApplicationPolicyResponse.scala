package typings
package awsDashSdkLib.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutApplicationPolicyResponse extends js.Object {
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: js.UndefOr[__listOfApplicationPolicyStatement] = js.undefined
}

object PutApplicationPolicyResponse {
  @scala.inline
  def apply(Statements: __listOfApplicationPolicyStatement = null): PutApplicationPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Statements != null) __obj.updateDynamic("Statements")(Statements)
    __obj.asInstanceOf[PutApplicationPolicyResponse]
  }
}

