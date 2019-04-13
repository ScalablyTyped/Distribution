package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceByConfigRule extends js.Object {
  /**
    * Indicates whether the AWS Config rule is compliant.
    */
  var Compliance: js.UndefOr[Compliance] = js.undefined
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
}

object ComplianceByConfigRule {
  @scala.inline
  def apply(Compliance: Compliance = null, ConfigRuleName: StringWithCharLimit64 = null): ComplianceByConfigRule = {
    val __obj = js.Dynamic.literal()
    if (Compliance != null) __obj.updateDynamic("Compliance")(Compliance)
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName)
    __obj.asInstanceOf[ComplianceByConfigRule]
  }
}

