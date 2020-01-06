package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourceOutput extends js.Object {
  /**
    * The ID assigned to the DataSource during creation. This value should be identical to the value of the DataSourceID in the request.
    */
  var DataSourceId: js.UndefOr[EntityId] = js.native
}

object UpdateDataSourceOutput {
  @scala.inline
  def apply(DataSourceId: EntityId = null): UpdateDataSourceOutput = {
    val __obj = js.Dynamic.literal()
    if (DataSourceId != null) __obj.updateDynamic("DataSourceId")(DataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceOutput]
  }
}

