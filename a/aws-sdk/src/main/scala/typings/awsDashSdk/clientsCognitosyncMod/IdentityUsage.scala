package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityUsage extends js.Object {
  /**
    * Total data storage for this identity.
    */
  var DataStorage: js.UndefOr[Long] = js.native
  /**
    * Number of datasets for the identity.
    */
  var DatasetCount: js.UndefOr[Integer] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.IdentityId] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.IdentityPoolId] = js.native
  /**
    * Date on which the identity was last modified.
    */
  var LastModifiedDate: js.UndefOr[_Date] = js.native
}

object IdentityUsage {
  @scala.inline
  def apply(
    DataStorage: Int | Double = null,
    DatasetCount: Int | Double = null,
    IdentityId: IdentityId = null,
    IdentityPoolId: IdentityPoolId = null,
    LastModifiedDate: _Date = null
  ): IdentityUsage = {
    val __obj = js.Dynamic.literal()
    if (DataStorage != null) __obj.updateDynamic("DataStorage")(DataStorage.asInstanceOf[js.Any])
    if (DatasetCount != null) __obj.updateDynamic("DatasetCount")(DatasetCount.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityUsage]
  }
}

