package typings.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddTab extends js.Object {
  def addTab(id: js.Any): Unit
  def removeTab(id: js.Any): Unit
}

object AnonAddTab {
  @scala.inline
  def apply(addTab: js.Any => Unit, removeTab: js.Any => Unit): AnonAddTab = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction1(addTab), removeTab = js.Any.fromFunction1(removeTab))
    __obj.asInstanceOf[AnonAddTab]
  }
}

