package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetResponse extends js.Object {
  /**
    * A collection of data for an identity pool. An identity pool can have multiple datasets. A dataset is per identity and can be general or associated with a particular entity in an application (like a saved game). Datasets are automatically created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
    */
  var Dataset: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.Dataset] = js.native
}

object DeleteDatasetResponse {
  @scala.inline
  def apply(Dataset: Dataset = null): DeleteDatasetResponse = {
    val __obj = js.Dynamic.literal()
    if (Dataset != null) __obj.updateDynamic("Dataset")(Dataset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetResponse]
  }
}

