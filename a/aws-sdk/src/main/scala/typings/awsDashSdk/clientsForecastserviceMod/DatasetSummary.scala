package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetSummary extends js.Object {
  /**
    * When the dataset was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the dataset.
    */
  var DatasetName: js.UndefOr[Name] = js.undefined
  /**
    * The dataset type.
    */
  var DatasetType: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.DatasetType] = js.undefined
  /**
    * The domain associated with the dataset.
    */
  var Domain: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Domain] = js.undefined
  /**
    * When the dataset is created, LastModificationTime is the same as CreationTime. After a CreateDatasetImportJob operation is called, LastModificationTime is when the import job finished or failed. While data is being imported to the dataset, LastModificationTime is the current query time.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
}

object DatasetSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DatasetArn: Arn = null,
    DatasetName: Name = null,
    DatasetType: DatasetType = null,
    Domain: Domain = null,
    LastModificationTime: Timestamp = null
  ): DatasetSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DatasetArn != null) __obj.updateDynamic("DatasetArn")(DatasetArn)
    if (DatasetName != null) __obj.updateDynamic("DatasetName")(DatasetName)
    if (DatasetType != null) __obj.updateDynamic("DatasetType")(DatasetType.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime)
    __obj.asInstanceOf[DatasetSummary]
  }
}

