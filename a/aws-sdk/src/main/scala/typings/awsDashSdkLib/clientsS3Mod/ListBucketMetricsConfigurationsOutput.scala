package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBucketMetricsConfigurationsOutput extends js.Object {
  /**
    * The marker that is used as a starting point for this metrics configuration list response. This value is present if it was sent in the request.
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
  /**
    * Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
  /**
    * The list of metrics configurations for a bucket.
    */
  var MetricsConfigurationList: js.UndefOr[MetricsConfigurationList] = js.undefined
  /**
    * The marker used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
}

object ListBucketMetricsConfigurationsOutput {
  @scala.inline
  def apply(
    ContinuationToken: Token = null,
    IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
    MetricsConfigurationList: MetricsConfigurationList = null,
    NextContinuationToken: NextToken = null
  ): ListBucketMetricsConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken)
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (MetricsConfigurationList != null) __obj.updateDynamic("MetricsConfigurationList")(MetricsConfigurationList)
    if (NextContinuationToken != null) __obj.updateDynamic("NextContinuationToken")(NextContinuationToken)
    __obj.asInstanceOf[ListBucketMetricsConfigurationsOutput]
  }
}

