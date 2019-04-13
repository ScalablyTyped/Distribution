package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableResponse extends js.Object {
  /**
    * The Table object that defines the specified table.
    */
  var Table: js.UndefOr[Table] = js.undefined
}

object GetTableResponse {
  @scala.inline
  def apply(Table: Table = null): GetTableResponse = {
    val __obj = js.Dynamic.literal()
    if (Table != null) __obj.updateDynamic("Table")(Table)
    __obj.asInstanceOf[GetTableResponse]
  }
}

