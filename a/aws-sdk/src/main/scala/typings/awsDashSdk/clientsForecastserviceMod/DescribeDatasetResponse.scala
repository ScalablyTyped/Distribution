package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetResponse extends js.Object {
  /**
    * When the dataset was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The frequency of data collection. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "M" indicates every month and "30min" indicates every 30 minutes.
    */
  var DataFrequency: js.UndefOr[Frequency] = js.undefined
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
    * The dataset domain.
    */
  var Domain: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Domain] = js.undefined
  /**
    * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.EncryptionConfig] = js.undefined
  /**
    * When the dataset is created, LastModificationTime is the same as CreationTime. After a CreateDatasetImportJob operation is called, LastModificationTime is when the import job finished or failed. While data is being imported to the dataset, LastModificationTime is the current query time.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * An array of SchemaAttribute objects that specify the dataset fields. Each SchemaAttribute specifies the name and data type of a field.
    */
  var Schema: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Schema] = js.undefined
  /**
    * The status of the dataset. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     UPDATE_PENDING, UPDATE_IN_PROGRESS, UPDATE_FAILED    The UPDATE states apply while data is imported to the dataset from a call to the CreateDatasetImportJob operation. During this time, the status reflects the status of the dataset import job. For example, when the import job status is CREATE_IN_PROGRESS, the status of the dataset is UPDATE_IN_PROGRESS.  The Status of the dataset must be ACTIVE before you can import training data. 
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Status] = js.undefined
}

object DescribeDatasetResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DataFrequency: Frequency = null,
    DatasetArn: Arn = null,
    DatasetName: Name = null,
    DatasetType: DatasetType = null,
    Domain: Domain = null,
    EncryptionConfig: EncryptionConfig = null,
    LastModificationTime: Timestamp = null,
    Schema: Schema = null,
    Status: Status = null
  ): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DataFrequency != null) __obj.updateDynamic("DataFrequency")(DataFrequency)
    if (DatasetArn != null) __obj.updateDynamic("DatasetArn")(DatasetArn)
    if (DatasetName != null) __obj.updateDynamic("DatasetName")(DatasetName)
    if (DatasetType != null) __obj.updateDynamic("DatasetType")(DatasetType.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig)
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime)
    if (Schema != null) __obj.updateDynamic("Schema")(Schema)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
}

