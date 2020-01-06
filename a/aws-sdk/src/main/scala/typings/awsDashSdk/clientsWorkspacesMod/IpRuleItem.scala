package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpRuleItem extends js.Object {
  /**
    * The IP address range, in CIDR notation.
    */
  var ipRule: js.UndefOr[IpRule] = js.native
  /**
    * The description.
    */
  var ruleDesc: js.UndefOr[IpRuleDesc] = js.native
}

object IpRuleItem {
  @scala.inline
  def apply(ipRule: IpRule = null, ruleDesc: IpRuleDesc = null): IpRuleItem = {
    val __obj = js.Dynamic.literal()
    if (ipRule != null) __obj.updateDynamic("ipRule")(ipRule.asInstanceOf[js.Any])
    if (ruleDesc != null) __obj.updateDynamic("ruleDesc")(ruleDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpRuleItem]
  }
}

