package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dataset extends js.Object {
  /**
    * Date on which the dataset was created.
    */
  var CreationDate: js.UndefOr[_Date] = js.undefined
  /**
    * Total size in bytes of the records in this dataset.
    */
  var DataStorage: js.UndefOr[Long] = js.undefined
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: js.UndefOr[DatasetName] = js.undefined
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: js.UndefOr[IdentityId] = js.undefined
  /**
    * The device that made the last change to this dataset.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  /**
    * Date when the dataset was last modified.
    */
  var LastModifiedDate: js.UndefOr[_Date] = js.undefined
  /**
    * Number of records in this dataset.
    */
  var NumRecords: js.UndefOr[Long] = js.undefined
}

object Dataset {
  @scala.inline
  def apply(
    CreationDate: _Date = null,
    DataStorage: js.UndefOr[Long] = js.undefined,
    DatasetName: DatasetName = null,
    IdentityId: IdentityId = null,
    LastModifiedBy: String = null,
    LastModifiedDate: _Date = null,
    NumRecords: js.UndefOr[Long] = js.undefined
  ): Dataset = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (!js.isUndefined(DataStorage)) __obj.updateDynamic("DataStorage")(DataStorage)
    if (DatasetName != null) __obj.updateDynamic("DatasetName")(DatasetName)
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (!js.isUndefined(NumRecords)) __obj.updateDynamic("NumRecords")(NumRecords)
    __obj.asInstanceOf[Dataset]
  }
}

