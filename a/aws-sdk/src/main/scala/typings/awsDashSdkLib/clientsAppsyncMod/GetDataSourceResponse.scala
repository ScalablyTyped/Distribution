package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataSourceResponse extends js.Object {
  /**
    * The DataSource object.
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
}

object GetDataSourceResponse {
  @scala.inline
  def apply(dataSource: DataSource = null): GetDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    __obj.asInstanceOf[GetDataSourceResponse]
  }
}

