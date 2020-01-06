package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableVersionResponse extends js.Object {
  /**
    * The requested table version.
    */
  var TableVersion: js.UndefOr[typings.awsDashSdk.clientsGlueMod.TableVersion] = js.native
}

object GetTableVersionResponse {
  @scala.inline
  def apply(TableVersion: TableVersion = null): GetTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (TableVersion != null) __obj.updateDynamic("TableVersion")(TableVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableVersionResponse]
  }
}

