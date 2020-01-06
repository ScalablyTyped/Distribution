package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExpressionsRequest extends js.Object {
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName = js.native
  /**
    * Limits the DescribeExpressions response to the specified expressions. If not specified, all expressions are shown.
    */
  var ExpressionNames: js.UndefOr[StandardNameList] = js.native
}

object DescribeExpressionsRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    Deployed: js.UndefOr[scala.Boolean] = js.undefined,
    ExpressionNames: StandardNameList = null
  ): DescribeExpressionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed.asInstanceOf[js.Any])
    if (ExpressionNames != null) __obj.updateDynamic("ExpressionNames")(ExpressionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExpressionsRequest]
  }
}

