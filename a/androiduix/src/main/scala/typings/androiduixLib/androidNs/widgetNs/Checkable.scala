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
  def apply(isChecked: () => scala.Boolean, setChecked: scala.Boolean => scala.Unit, toggle: () => scala.Unit): Checkable = {
    val __obj = js.Dynamic.literal(isChecked = js.Any.fromFunction0(isChecked), setChecked = js.Any.fromFunction1(setChecked), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[Checkable]
  }
}

