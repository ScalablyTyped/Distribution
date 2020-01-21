package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourceResponse extends js.Object {
  /**
    * The updated DataSource object.
    */
  var dataSource: js.UndefOr[DataSource] = js.native
}

object UpdateDataSourceResponse {
  @scala.inline
  def apply(dataSource: DataSource = null): UpdateDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceResponse]
  }
}

