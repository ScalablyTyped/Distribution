package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListComplianceItemsResult extends js.Object {
  /**
    * A list of compliance information for the specified resource ID. 
    */
  var ComplianceItems: js.UndefOr[ComplianceItemList] = js.undefined
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListComplianceItemsResult {
  @scala.inline
  def apply(ComplianceItems: ComplianceItemList = null, NextToken: NextToken = null): ListComplianceItemsResult = {
    val __obj = js.Dynamic.literal()
    if (ComplianceItems != null) __obj.updateDynamic("ComplianceItems")(ComplianceItems)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListComplianceItemsResult]
  }
}

