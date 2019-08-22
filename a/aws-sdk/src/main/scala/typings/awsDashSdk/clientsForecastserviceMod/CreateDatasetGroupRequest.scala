package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetGroupRequest extends js.Object {
  /**
    * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
    */
  var DatasetArns: js.UndefOr[ArnList] = js.undefined
  /**
    * A name for the dataset group.
    */
  var DatasetGroupName: Name
  /**
    * The domain associated with the dataset group. The Domain and DatasetType that you choose determine the fields that must be present in the training data that you import to the dataset. For example, if you choose the RETAIL domain and TARGET_TIME_SERIES as the DatasetType, Amazon Forecast requires item_id, timestamp, and demand fields to be present in your data. For more information, see howitworks-datasets-groups.
    */
  var Domain: typings.awsDashSdk.clientsForecastserviceMod.Domain
}

object CreateDatasetGroupRequest {
  @scala.inline
  def apply(DatasetGroupName: Name, Domain: Domain, DatasetArns: ArnList = null): CreateDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetGroupName = DatasetGroupName, Domain = Domain.asInstanceOf[js.Any])
    if (DatasetArns != null) __obj.updateDynamic("DatasetArns")(DatasetArns)
    __obj.asInstanceOf[CreateDatasetGroupRequest]
  }
}

