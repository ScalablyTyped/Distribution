package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDataSourceOutput extends js.Object {
  /**
    * The ID assigned to the DataSource during creation. This value should be identical to the value of the DataSourceID in the request.
    */
  var DataSourceId: js.UndefOr[EntityId] = js.undefined
}

object UpdateDataSourceOutput {
  @scala.inline
  def apply(DataSourceId: EntityId = null): UpdateDataSourceOutput = {
    val __obj = js.Dynamic.literal()
    if (DataSourceId != null) __obj.updateDynamic("DataSourceId")(DataSourceId)
    __obj.asInstanceOf[UpdateDataSourceOutput]
  }
}

