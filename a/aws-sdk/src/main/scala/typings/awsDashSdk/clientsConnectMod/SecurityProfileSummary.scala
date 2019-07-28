package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityProfileSummary extends js.Object {
  /**
    * The ARN of the security profile.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  /**
    * The identifier of the security profile.
    */
  var Id: js.UndefOr[SecurityProfileId] = js.undefined
  /**
    * The name of the security profile.
    */
  var Name: js.UndefOr[SecurityProfileName] = js.undefined
}

object SecurityProfileSummary {
  @scala.inline
  def apply(Arn: ARN = null, Id: SecurityProfileId = null, Name: SecurityProfileName = null): SecurityProfileSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[SecurityProfileSummary]
  }
}

