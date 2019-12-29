package typings.antDashDesignDashPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddTab extends js.Object {
  def addTab(id: js.Any): Unit
  def removeTab(id: js.Any): Unit
}

object Anon_AddTab {
  @scala.inline
  def apply(addTab: js.Any => Unit, removeTab: js.Any => Unit): Anon_AddTab = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction1(addTab), removeTab = js.Any.fromFunction1(removeTab))
  
    __obj.asInstanceOf[Anon_AddTab]
  }
}

