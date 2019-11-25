package typings.antd.libTableInterfaceMod

import typings.antd.Anon_Cell
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableComponents extends js.Object {
  var body: js.UndefOr[Anon_Cell] = js.undefined
  var header: js.UndefOr[Anon_Cell] = js.undefined
  var table: js.UndefOr[ReactType[_]] = js.undefined
}

object TableComponents {
  @scala.inline
  def apply(body: Anon_Cell = null, header: Anon_Cell = null, table: ReactType[_] = null): TableComponents = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponents]
  }
}

