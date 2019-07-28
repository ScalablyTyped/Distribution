package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRulesPackagesResponse extends js.Object {
  /**
    * Rules package details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
  /**
    * Information about the rules package.
    */
  var rulesPackages: RulesPackageList
}

object DescribeRulesPackagesResponse {
  @scala.inline
  def apply(failedItems: FailedItems, rulesPackages: RulesPackageList): DescribeRulesPackagesResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems, rulesPackages = rulesPackages)
  
    __obj.asInstanceOf[DescribeRulesPackagesResponse]
  }
}

