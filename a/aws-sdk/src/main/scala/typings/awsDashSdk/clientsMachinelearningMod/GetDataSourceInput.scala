package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataSourceInput extends js.Object {
  /**
    * The ID assigned to the DataSource at creation.
    */
  var DataSourceId: EntityId
  /**
    * Specifies whether the GetDataSource operation should return DataSourceSchema. If true, DataSourceSchema is returned. If false, DataSourceSchema is not returned.
    */
  var Verbose: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.Verbose] = js.undefined
}

object GetDataSourceInput {
  @scala.inline
  def apply(DataSourceId: EntityId, Verbose: js.UndefOr[Boolean] = js.undefined): GetDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId)
    if (!js.isUndefined(Verbose)) __obj.updateDynamic("Verbose")(Verbose)
    __obj.asInstanceOf[GetDataSourceInput]
  }
}

