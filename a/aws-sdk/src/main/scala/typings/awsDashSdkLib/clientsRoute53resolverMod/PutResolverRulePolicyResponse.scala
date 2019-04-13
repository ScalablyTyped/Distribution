package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutResolverRulePolicyResponse extends js.Object {
  /**
    * Whether the PutResolverRulePolicy request was successful.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.undefined
}

object PutResolverRulePolicyResponse {
  @scala.inline
  def apply(ReturnValue: js.UndefOr[Boolean] = js.undefined): PutResolverRulePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReturnValue)) __obj.updateDynamic("ReturnValue")(ReturnValue)
    __obj.asInstanceOf[PutResolverRulePolicyResponse]
  }
}

