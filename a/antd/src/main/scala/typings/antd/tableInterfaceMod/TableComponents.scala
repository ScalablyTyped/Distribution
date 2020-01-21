package typings.antd.tableInterfaceMod

import typings.antd.AnonCell
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableComponents extends js.Object {
  var body: js.UndefOr[AnonCell] = js.undefined
  var header: js.UndefOr[AnonCell] = js.undefined
  var table: js.UndefOr[ReactType[_]] = js.undefined
}

object TableComponents {
  @scala.inline
  def apply(body: AnonCell = null, header: AnonCell = null, table: ReactType[_] = null): TableComponents = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponents]
  }
}

