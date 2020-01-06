package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSourceResponse extends js.Object {
  /**
    * The DataSource object.
    */
  var dataSource: js.UndefOr[DataSource] = js.native
}

object CreateDataSourceResponse {
  @scala.inline
  def apply(dataSource: DataSource = null): CreateDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceResponse]
  }
}

