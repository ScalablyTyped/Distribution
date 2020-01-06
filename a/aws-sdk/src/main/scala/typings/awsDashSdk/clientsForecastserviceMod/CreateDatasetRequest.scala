package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetRequest extends js.Object {
  /**
    * The frequency of data collection. This parameter is required for RELATED_TIME_SERIES datasets. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "D" indicates every day and "15min" indicates every 15 minutes.
    */
  var DataFrequency: js.UndefOr[Frequency] = js.native
  /**
    * A name for the dataset.
    */
  var DatasetName: Name = js.native
  /**
    * The dataset type. Valid values depend on the chosen Domain.
    */
  var DatasetType: typings.awsDashSdk.clientsForecastserviceMod.DatasetType = js.native
  /**
    * The domain associated with the dataset. When you add a dataset to a dataset group, this value and the value specified for the Domain parameter of the CreateDatasetGroup operation must match. The Domain and DatasetType that you choose determine the fields that must be present in the training data that you import to the dataset. For example, if you choose the RETAIL domain and TARGET_TIME_SERIES as the DatasetType, Amazon Forecast requires item_id, timestamp, and demand fields to be present in your data. For more information, see howitworks-datasets-groups.
    */
  var Domain: typings.awsDashSdk.clientsForecastserviceMod.Domain = js.native
  /**
    * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.EncryptionConfig] = js.native
  /**
    * The schema for the dataset. The schema attributes and their order must match the fields in your data. The dataset Domain and DatasetType that you choose determine the minimum required fields in your training data. For information about the required fields for a specific dataset domain and type, see howitworks-domains-ds-types.
    */
  var Schema: typings.awsDashSdk.clientsForecastserviceMod.Schema = js.native
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
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], DatasetType = DatasetType.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], Schema = Schema.asInstanceOf[js.Any])
    if (DataFrequency != null) __obj.updateDynamic("DataFrequency")(DataFrequency.asInstanceOf[js.Any])
    if (EncryptionConfig != null) __obj.updateDynamic("EncryptionConfig")(EncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
}

