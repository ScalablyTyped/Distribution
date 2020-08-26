package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link XGridColumnModel} to get notifications about column model changes.
  * @since OOo 3.3
  */
@js.native
trait XGridColumnListener extends XEventListener {
  /** Invoked after a column was modified. */
  def columnChanged(event: GridColumnEvent): Unit = js.native
}

object XGridColumnListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    columnChanged: GridColumnEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGridColumnListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), columnChanged = js.Any.fromFunction1(columnChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGridColumnListener]
  }
  @scala.inline
  implicit class XGridColumnListenerOps[Self <: XGridColumnListener] (val x: Self) extends AnyVal {
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
    def setColumnChanged(value: GridColumnEvent => Unit): Self = this.set("columnChanged", js.Any.fromFunction1(value))
  }
  
}

