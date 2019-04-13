package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cell extends js.Object {
  var cell: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var row: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var wrapper: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object Anon_Cell {
  @scala.inline
  def apply(
    cell: reactLib.reactMod.ReactType[_] = null,
    row: reactLib.reactMod.ReactType[_] = null,
    wrapper: reactLib.reactMod.ReactType[_] = null
  ): Anon_Cell = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cell]
  }
}

