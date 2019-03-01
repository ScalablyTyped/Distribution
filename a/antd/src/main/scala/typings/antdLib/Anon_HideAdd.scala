package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HideAdd extends js.Object {
  var hideAdd: scala.Boolean
  var tabPosition: antdLib.libTabsMod.TabsPosition
}

object Anon_HideAdd {
  @scala.inline
  def apply(hideAdd: scala.Boolean, tabPosition: antdLib.libTabsMod.TabsPosition): Anon_HideAdd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hideAdd")(hideAdd)
    __obj.updateDynamic("tabPosition")(tabPosition)
    __obj.asInstanceOf[Anon_HideAdd]
  }
}

