package typings.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkable extends js.Object {
  def isChecked(): Boolean
  def setChecked(checked: Boolean): Unit
  def toggle(): Unit
}

object Checkable {
  @scala.inline
  def apply(isChecked: () => Boolean, setChecked: Boolean => Unit, toggle: () => Unit): Checkable = {
    val __obj = js.Dynamic.literal(isChecked = js.Any.fromFunction0(isChecked), setChecked = js.Any.fromFunction1(setChecked), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[Checkable]
  }
}

