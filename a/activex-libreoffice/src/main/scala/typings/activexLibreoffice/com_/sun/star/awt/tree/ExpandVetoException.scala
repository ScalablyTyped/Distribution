package typings.activexLibreoffice.com_.sun.star.awt.tree

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception used to stop an expand/collapse from happening.
  * @see XTreeExpansionListener
  * @see XTreeControl
  */
@js.native
trait ExpandVetoException extends Exception {
  /** The event that the exception was created for. */
  var Event: TreeExpansionEvent = js.native
}

object ExpandVetoException {
  @scala.inline
  def apply(Context: XInterface, Event: TreeExpansionEvent, Message: String): ExpandVetoException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandVetoException]
  }
  @scala.inline
  implicit class ExpandVetoExceptionOps[Self <: ExpandVetoException] (val x: Self) extends AnyVal {
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
    def setEvent(value: TreeExpansionEvent): Self = this.set("Event", value.asInstanceOf[js.Any])
  }
  
}

