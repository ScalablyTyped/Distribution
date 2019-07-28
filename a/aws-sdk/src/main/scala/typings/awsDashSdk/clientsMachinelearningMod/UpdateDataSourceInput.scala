package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDataSourceInput extends js.Object {
  /**
    * The ID assigned to the DataSource during creation.
    */
  var DataSourceId: EntityId
  /**
    * A new user-supplied name or description of the DataSource that will replace the current description. 
    */
  var DataSourceName: EntityName
}

object UpdateDataSourceInput {
  @scala.inline
  def apply(DataSourceId: EntityId, DataSourceName: EntityName): UpdateDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId, DataSourceName = DataSourceName)
  
    __obj.asInstanceOf[UpdateDataSourceInput]
  }
}

