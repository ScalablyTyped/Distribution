package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDataSourceResponse extends js.Object {
  /**
    * The DataSource object.
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
}

object CreateDataSourceResponse {
  @scala.inline
  def apply(dataSource: DataSource = null): CreateDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    __obj.asInstanceOf[CreateDataSourceResponse]
  }
}

