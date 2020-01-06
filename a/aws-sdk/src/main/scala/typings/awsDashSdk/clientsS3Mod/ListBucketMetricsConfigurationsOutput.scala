package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketMetricsConfigurationsOutput extends js.Object {
  /**
    * The marker that is used as a starting point for this metrics configuration list response. This value is present if it was sent in the request.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  /**
    * Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IsTruncated] = js.native
  /**
    * The list of metrics configurations for a bucket.
    */
  var MetricsConfigurationList: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MetricsConfigurationList] = js.native
  /**
    * The marker used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
}

object ListBucketMetricsConfigurationsOutput {
  @scala.inline
  def apply(
    ContinuationToken: Token = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    MetricsConfigurationList: MetricsConfigurationList = null,
    NextContinuationToken: NextToken = null
  ): ListBucketMetricsConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (MetricsConfigurationList != null) __obj.updateDynamic("MetricsConfigurationList")(MetricsConfigurationList.asInstanceOf[js.Any])
    if (NextContinuationToken != null) __obj.updateDynamic("NextContinuationToken")(NextContinuationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketMetricsConfigurationsOutput]
  }
}

