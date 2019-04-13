package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRecordsRequest extends js.Object {
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: awsDashSdkLib.clientsCognitosyncMod.DatasetName
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: awsDashSdkLib.clientsCognitosyncMod.IdentityId
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: awsDashSdkLib.clientsCognitosyncMod.IdentityPoolId
  /**
    * The last server sync count for this record.
    */
  var LastSyncCount: js.UndefOr[Long] = js.undefined
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[IntegerString] = js.undefined
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A token containing a session ID, identity ID, and expiration.
    */
  var SyncSessionToken: js.UndefOr[SyncSessionToken] = js.undefined
}

object ListRecordsRequest {
  @scala.inline
  def apply(
    DatasetName: DatasetName,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId,
    LastSyncCount: js.UndefOr[Long] = js.undefined,
    MaxResults: js.UndefOr[IntegerString] = js.undefined,
    NextToken: String = null,
    SyncSessionToken: SyncSessionToken = null
  ): ListRecordsRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName, IdentityId = IdentityId, IdentityPoolId = IdentityPoolId)
    if (!js.isUndefined(LastSyncCount)) __obj.updateDynamic("LastSyncCount")(LastSyncCount)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SyncSessionToken != null) __obj.updateDynamic("SyncSessionToken")(SyncSessionToken)
    __obj.asInstanceOf[ListRecordsRequest]
  }
}

