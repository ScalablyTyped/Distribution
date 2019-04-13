package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableComponents extends js.Object {
  var body: js.UndefOr[antdLib.Anon_Cell] = js.undefined
  var header: js.UndefOr[antdLib.Anon_Cell] = js.undefined
  var table: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object TableComponents {
  @scala.inline
  def apply(
    body: antdLib.Anon_Cell = null,
    header: antdLib.Anon_Cell = null,
    table: reactLib.reactMod.ReactType[_] = null
  ): TableComponents = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (header != null) __obj.updateDynamic("header")(header)
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponents]
  }
}

