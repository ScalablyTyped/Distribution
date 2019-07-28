package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpsSummaryResult extends js.Object {
  /**
    * The list of aggregated and filtered OpsItems.
    */
  var Entities: js.UndefOr[OpsEntityList] = js.undefined
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object GetOpsSummaryResult {
  @scala.inline
  def apply(Entities: OpsEntityList = null, NextToken: NextToken = null): GetOpsSummaryResult = {
    val __obj = js.Dynamic.literal()
    if (Entities != null) __obj.updateDynamic("Entities")(Entities)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetOpsSummaryResult]
  }
}

