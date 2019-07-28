package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExpressionsRequest extends js.Object {
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName
  /**
    * Limits the DescribeExpressions response to the specified expressions. If not specified, all expressions are shown.
    */
  var ExpressionNames: js.UndefOr[StandardNameList] = js.undefined
}

object DescribeExpressionsRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    Deployed: js.UndefOr[Boolean] = js.undefined,
    ExpressionNames: StandardNameList = null
  ): DescribeExpressionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed)
    if (ExpressionNames != null) __obj.updateDynamic("ExpressionNames")(ExpressionNames)
    __obj.asInstanceOf[DescribeExpressionsRequest]
  }
}

