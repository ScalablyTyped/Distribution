package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetRequest extends js.Object {
  /**
    * The frequency of data collection. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "D" indicates every day and "15min" indicates every 15 minutes.
    */
  var DataFrequency: js.UndefOr[Frequency] = js.undefined
  /**
    * A name for the dataset.
    */
  var DatasetName: Name
  /**
    * The dataset type. Valid values depend on the chosen Domain.
    */
  var DatasetType: typings.awsDashSdk.clientsForecastserviceMod.DatasetType
  /**
    * The domain associated with the dataset. The Domain and DatasetType that you choose determine the fields that must be present in the training data that you import to the dataset. For example, if you choose the RETAIL domain and TARGET_TIME_SERIES as the DatasetType, Amazon Forecast requires item_id, timestamp, and demand fields to be present in your data. For more information, see howitworks-datasets-groups.
    */
  var Domain: typings.awsDashSdk.clientsForecastserviceMod.Domain
  /**
    * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.EncryptionConfig] = js.undefined
  /**
    * The schema for the dataset. The schema attributes and their order must match the fields in your data. The dataset Domain and DatasetType that you choose determine the minimum required fields in your training data. For information about the required fields for a specific dataset domain and type, see howitworks-domains-ds-types.
    */
  var Schema: typings.awsDashSdk.clientsForecastserviceMod.Schema
}

object CreateDatasetRequest {
  @scala.inline
  def apply(
    DatasetName: Name,
    DatasetType: DatasetType,
    Domain: Domain,
    Schema: Schema,
    DataFrequency: Frequency = null,
    EncryptionConfig: EncryptionConfig = null
  ): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName, DatasetType = DatasetType.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], Schema = Schema)
    if (DataFrequency != null) __obj.updateDynamic("DataFrequency")(DataFrequency)
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig)
    __obj.asInstanceOf[CreateDatasetRequest]
  }
}

