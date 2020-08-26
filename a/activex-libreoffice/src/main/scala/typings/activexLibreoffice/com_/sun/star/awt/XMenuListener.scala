package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive menu events on a window. */
@js.native
trait XMenuListener extends XEventListener {
  /** is invoked when a menu is activated. */
  def itemActivated(aEvent: MenuEvent): Unit = js.native
  /** is invoked when a menu is deactivated. */
  def itemDeactivated(aEvent: MenuEvent): Unit = js.native
  /** is invoked when a menu item is highlighted. */
  def itemHighlighted(aEvent: MenuEvent): Unit = js.native
  /** is invoked when a menu item is selected. */
  def itemSelected(aEvent: MenuEvent): Unit = js.native
}

object XMenuListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    itemActivated: MenuEvent => Unit,
    itemDeactivated: MenuEvent => Unit,
    itemHighlighted: MenuEvent => Unit,
    itemSelected: MenuEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMenuListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), itemActivated = js.Any.fromFunction1(itemActivated), itemDeactivated = js.Any.fromFunction1(itemDeactivated), itemHighlighted = js.Any.fromFunction1(itemHighlighted), itemSelected = js.Any.fromFunction1(itemSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMenuListener]
  }
  @scala.inline
  implicit class XMenuListenerOps[Self <: XMenuListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemActivated(value: MenuEvent => Unit): Self = this.set("itemActivated", js.Any.fromFunction1(value))
    @scala.inline
    def setItemDeactivated(value: MenuEvent => Unit): Self = this.set("itemDeactivated", js.Any.fromFunction1(value))
    @scala.inline
    def setItemHighlighted(value: MenuEvent => Unit): Self = this.set("itemHighlighted", js.Any.fromFunction1(value))
    @scala.inline
    def setItemSelected(value: MenuEvent => Unit): Self = this.set("itemSelected", js.Any.fromFunction1(value))
  }
  
}

