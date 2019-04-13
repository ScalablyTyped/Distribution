package typings
package awsDashSdkLib.clientsMarketplacecommerceanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateDataSetResult extends js.Object {
  /**
    * A unique identifier representing a specific request to the GenerateDataSet operation. This identifier can be used to correlate a request with notifications from the SNS topic.
    */
  var dataSetRequestId: js.UndefOr[DataSetRequestId] = js.undefined
}

object GenerateDataSetResult {
  @scala.inline
  def apply(dataSetRequestId: DataSetRequestId = null): GenerateDataSetResult = {
    val __obj = js.Dynamic.literal()
    if (dataSetRequestId != null) __obj.updateDynamic("dataSetRequestId")(dataSetRequestId)
    __obj.asInstanceOf[GenerateDataSetResult]
  }
}

