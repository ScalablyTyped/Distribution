package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableVersionResponse extends js.Object {
  /**
    * The requested table version.
    */
  var TableVersion: js.UndefOr[TableVersion] = js.undefined
}

object GetTableVersionResponse {
  @scala.inline
  def apply(TableVersion: TableVersion = null): GetTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (TableVersion != null) __obj.updateDynamic("TableVersion")(TableVersion)
    __obj.asInstanceOf[GetTableVersionResponse]
  }
}

