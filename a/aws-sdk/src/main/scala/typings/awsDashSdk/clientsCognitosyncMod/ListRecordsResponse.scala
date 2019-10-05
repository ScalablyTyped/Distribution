package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRecordsResponse extends js.Object {
  /**
    * Total number of records.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  /**
    * A boolean value specifying whether to delete the dataset locally.
    */
  var DatasetDeletedAfterRequestedSyncCount: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the dataset exists.
    */
  var DatasetExists: js.UndefOr[Boolean] = js.undefined
  /**
    * Server sync count for this dataset.
    */
  var DatasetSyncCount: js.UndefOr[Long] = js.undefined
  /**
    * The user/device that made the last change to this record.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  /**
    * Names of merged datasets.
    */
  var MergedDatasetNames: js.UndefOr[MergedDatasetNameList] = js.undefined
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A list of all records.
    */
  var Records: js.UndefOr[RecordList] = js.undefined
  /**
    * A token containing a session ID, identity ID, and expiration.
    */
  var SyncSessionToken: js.UndefOr[String] = js.undefined
}

object ListRecordsResponse {
  @scala.inline
  def apply(
    Count: Int | Double = null,
    DatasetDeletedAfterRequestedSyncCount: js.UndefOr[scala.Boolean] = js.undefined,
    DatasetExists: js.UndefOr[scala.Boolean] = js.undefined,
    DatasetSyncCount: Int | Double = null,
    LastModifiedBy: String = null,
    MergedDatasetNames: MergedDatasetNameList = null,
    NextToken: String = null,
    Records: RecordList = null,
    SyncSessionToken: String = null
  ): ListRecordsResponse = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (!js.isUndefined(DatasetDeletedAfterRequestedSyncCount)) __obj.updateDynamic("DatasetDeletedAfterRequestedSyncCount")(DatasetDeletedAfterRequestedSyncCount)
    if (!js.isUndefined(DatasetExists)) __obj.updateDynamic("DatasetExists")(DatasetExists)
    if (DatasetSyncCount != null) __obj.updateDynamic("DatasetSyncCount")(DatasetSyncCount.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (MergedDatasetNames != null) __obj.updateDynamic("MergedDatasetNames")(MergedDatasetNames)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Records != null) __obj.updateDynamic("Records")(Records)
    if (SyncSessionToken != null) __obj.updateDynamic("SyncSessionToken")(SyncSessionToken)
    __obj.asInstanceOf[ListRecordsResponse]
  }
}

