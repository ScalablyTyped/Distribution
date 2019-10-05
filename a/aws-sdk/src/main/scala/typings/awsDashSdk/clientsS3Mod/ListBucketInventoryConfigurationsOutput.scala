package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBucketInventoryConfigurationsOutput extends js.Object {
  /**
    * If sent in the request, the marker that is used as a starting point for this inventory configuration list response.
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
  /**
    * The list of inventory configurations for a bucket.
    */
  var InventoryConfigurationList: js.UndefOr[typings.awsDashSdk.clientsS3Mod.InventoryConfigurationList] = js.undefined
  /**
    * Indicates whether the returned list of inventory configurations is truncated in this response. A value of true indicates that the list is truncated.
    */
  var IsTruncated: js.UndefOr[typings.awsDashSdk.clientsS3Mod.IsTruncated] = js.undefined
  /**
    * The marker used to continue this inventory configuration listing. Use the NextContinuationToken from this response to continue the listing in a subsequent request. The continuation token is an opaque value that Amazon S3 understands.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
}

object ListBucketInventoryConfigurationsOutput {
  @scala.inline
  def apply(
    ContinuationToken: Token = null,
    InventoryConfigurationList: InventoryConfigurationList = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    NextContinuationToken: NextToken = null
  ): ListBucketInventoryConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken)
    if (InventoryConfigurationList != null) __obj.updateDynamic("InventoryConfigurationList")(InventoryConfigurationList)
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (NextContinuationToken != null) __obj.updateDynamic("NextContinuationToken")(NextContinuationToken)
    __obj.asInstanceOf[ListBucketInventoryConfigurationsOutput]
  }
}

