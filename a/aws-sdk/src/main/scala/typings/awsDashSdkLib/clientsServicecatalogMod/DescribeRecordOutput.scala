package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRecordOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Information about the product.
    */
  var RecordDetail: js.UndefOr[RecordDetail] = js.undefined
  /**
    * Information about the product created as the result of a request. For example, the output for a CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
    */
  var RecordOutputs: js.UndefOr[RecordOutputs] = js.undefined
}

object DescribeRecordOutput {
  @scala.inline
  def apply(
    NextPageToken: PageToken = null,
    RecordDetail: RecordDetail = null,
    RecordOutputs: RecordOutputs = null
  ): DescribeRecordOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (RecordDetail != null) __obj.updateDynamic("RecordDetail")(RecordDetail)
    if (RecordOutputs != null) __obj.updateDynamic("RecordOutputs")(RecordOutputs)
    __obj.asInstanceOf[DescribeRecordOutput]
  }
}

