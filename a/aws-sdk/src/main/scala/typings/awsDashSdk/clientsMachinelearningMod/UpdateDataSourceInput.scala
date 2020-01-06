package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourceInput extends js.Object {
  /**
    * The ID assigned to the DataSource during creation.
    */
  var DataSourceId: EntityId = js.native
  /**
    * A new user-supplied name or description of the DataSource that will replace the current description. 
    */
  var DataSourceName: EntityName = js.native
}

object UpdateDataSourceInput {
  @scala.inline
  def apply(DataSourceId: EntityId, DataSourceName: EntityName): UpdateDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateDataSourceInput]
  }
}

