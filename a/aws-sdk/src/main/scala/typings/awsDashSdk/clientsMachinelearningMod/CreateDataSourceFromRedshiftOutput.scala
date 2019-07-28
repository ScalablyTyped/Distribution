package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDataSourceFromRedshiftOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of the DataSourceID in the request. 
    */
  var DataSourceId: js.UndefOr[EntityId] = js.undefined
}

object CreateDataSourceFromRedshiftOutput {
  @scala.inline
  def apply(DataSourceId: EntityId = null): CreateDataSourceFromRedshiftOutput = {
    val __obj = js.Dynamic.literal()
    if (DataSourceId != null) __obj.updateDynamic("DataSourceId")(DataSourceId)
    __obj.asInstanceOf[CreateDataSourceFromRedshiftOutput]
  }
}

