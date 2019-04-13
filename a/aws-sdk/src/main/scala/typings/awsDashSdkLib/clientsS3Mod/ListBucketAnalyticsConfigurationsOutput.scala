package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBucketAnalyticsConfigurationsOutput extends js.Object {
  /**
    * The list of analytics configurations for a bucket.
    */
  var AnalyticsConfigurationList: js.UndefOr[AnalyticsConfigurationList] = js.undefined
  /**
    * The ContinuationToken that represents where this request began.
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
  /**
    * Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
  /**
    * NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
}

object ListBucketAnalyticsConfigurationsOutput {
  @scala.inline
  def apply(
    AnalyticsConfigurationList: AnalyticsConfigurationList = null,
    ContinuationToken: Token = null,
    IsTruncated: js.UndefOr[IsTruncated] = js.undefined,
    NextContinuationToken: NextToken = null
  ): ListBucketAnalyticsConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    if (AnalyticsConfigurationList != null) __obj.updateDynamic("AnalyticsConfigurationList")(AnalyticsConfigurationList)
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken)
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (NextContinuationToken != null) __obj.updateDynamic("NextContinuationToken")(NextContinuationToken)
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
  }
}

