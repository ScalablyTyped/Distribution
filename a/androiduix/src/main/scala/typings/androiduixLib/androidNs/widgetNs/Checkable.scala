package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkable extends js.Object {
  def isChecked(): scala.Boolean
  def setChecked(checked: scala.Boolean): scala.Unit
  def toggle(): scala.Unit
}

object Checkable {
  @scala.inline
  def apply(
    isChecked: js.Function0[scala.Boolean],
    setChecked: js.Function1[scala.Boolean, scala.Unit],
    toggle: js.Function0[scala.Unit]
  ): Checkable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isChecked")(isChecked)
    __obj.updateDynamic("setChecked")(setChecked)
    __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[Checkable]
  }
}

