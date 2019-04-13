package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDataSourceResponse extends js.Object {
  /**
    * The updated DataSource object.
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
}

object UpdateDataSourceResponse {
  @scala.inline
  def apply(dataSource: DataSource = null): UpdateDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    __obj.asInstanceOf[UpdateDataSourceResponse]
  }
}

