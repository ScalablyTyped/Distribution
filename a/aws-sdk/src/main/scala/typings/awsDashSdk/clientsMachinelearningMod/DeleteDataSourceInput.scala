package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDataSourceInput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the DataSource.
    */
  var DataSourceId: EntityId
}

object DeleteDataSourceInput {
  @scala.inline
  def apply(DataSourceId: EntityId): DeleteDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId)
  
    __obj.asInstanceOf[DeleteDataSourceInput]
  }
}

