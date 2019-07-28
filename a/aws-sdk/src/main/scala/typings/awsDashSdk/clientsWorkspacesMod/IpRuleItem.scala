package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpRuleItem extends js.Object {
  /**
    * The IP address range, in CIDR notation.
    */
  var ipRule: js.UndefOr[IpRule] = js.undefined
  /**
    * The description.
    */
  var ruleDesc: js.UndefOr[IpRuleDesc] = js.undefined
}

object IpRuleItem {
  @scala.inline
  def apply(ipRule: IpRule = null, ruleDesc: IpRuleDesc = null): IpRuleItem = {
    val __obj = js.Dynamic.literal()
    if (ipRule != null) __obj.updateDynamic("ipRule")(ipRule)
    if (ruleDesc != null) __obj.updateDynamic("ruleDesc")(ruleDesc)
    __obj.asInstanceOf[IpRuleItem]
  }
}

