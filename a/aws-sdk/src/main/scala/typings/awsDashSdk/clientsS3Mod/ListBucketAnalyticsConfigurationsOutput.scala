package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketAnalyticsConfigurationsOutput extends js.Object {
  /**
    * The list of analytics configurations for a bucket.
    */
  var AnalyticsConfigurationList: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AnalyticsConfigurationList] = js.native
  /**
    * The marker that is used as a starting point for this analytics configuration list response. This value is present if it was sent in the request.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  /**
    * Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IsTruncated] = js.native
  /**
    *  NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
}

object ListBucketAnalyticsConfigurationsOutput {
  @scala.inline
  def apply(
    AnalyticsConfigurationList: AnalyticsConfigurationList = null,
    ContinuationToken: Token = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    NextContinuationToken: NextToken = null
  ): ListBucketAnalyticsConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    if (AnalyticsConfigurationList != null) __obj.updateDynamic("AnalyticsConfigurationList")(AnalyticsConfigurationList.asInstanceOf[js.Any])
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (NextContinuationToken != null) __obj.updateDynamic("NextContinuationToken")(NextContinuationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
  }
}

