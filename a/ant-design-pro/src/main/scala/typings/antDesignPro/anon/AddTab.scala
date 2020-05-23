package typings.antDesignPro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTab extends js.Object {
  def addTab(id: js.Any): Unit
  def removeTab(id: js.Any): Unit
}

object AddTab {
  @scala.inline
  def apply(addTab: js.Any => Unit, removeTab: js.Any => Unit): AddTab = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction1(addTab), removeTab = js.Any.fromFunction1(removeTab))
    __obj.asInstanceOf[AddTab]
  }
}

