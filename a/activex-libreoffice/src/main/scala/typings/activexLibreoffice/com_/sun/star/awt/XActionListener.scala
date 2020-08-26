package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive action events. */
@js.native
trait XActionListener extends XEventListener {
  /** is invoked when an action is performed. */
  def actionPerformed(rEvent: ActionEvent): Unit = js.native
}

object XActionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    actionPerformed: ActionEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XActionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), actionPerformed = js.Any.fromFunction1(actionPerformed), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XActionListener]
  }
  @scala.inline
  implicit class XActionListenerOps[Self <: XActionListener] (val x: Self) extends AnyVal {
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
    def setActionPerformed(value: ActionEvent => Unit): Self = this.set("actionPerformed", js.Any.fromFunction1(value))
  }
  
}

