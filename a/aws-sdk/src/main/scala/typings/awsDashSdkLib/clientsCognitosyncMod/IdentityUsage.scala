package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityUsage extends js.Object {
  /**
    * Total data storage for this identity.
    */
  var DataStorage: js.UndefOr[Long] = js.undefined
  /**
    * Number of datasets for the identity.
    */
  var DatasetCount: js.UndefOr[Integer] = js.undefined
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: js.UndefOr[IdentityId] = js.undefined
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
  /**
    * Date on which the identity was last modified.
    */
  var LastModifiedDate: js.UndefOr[_Date] = js.undefined
}

object IdentityUsage {
  @scala.inline
  def apply(
    DataStorage: js.UndefOr[Long] = js.undefined,
    DatasetCount: js.UndefOr[Integer] = js.undefined,
    IdentityId: IdentityId = null,
    IdentityPoolId: IdentityPoolId = null,
    LastModifiedDate: _Date = null
  ): IdentityUsage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DataStorage)) __obj.updateDynamic("DataStorage")(DataStorage)
    if (!js.isUndefined(DatasetCount)) __obj.updateDynamic("DatasetCount")(DatasetCount)
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    __obj.asInstanceOf[IdentityUsage]
  }
}

