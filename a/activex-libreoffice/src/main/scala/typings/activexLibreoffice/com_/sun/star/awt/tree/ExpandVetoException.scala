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
trait ExpandVetoException extends Exception {
  /** The event that the exception was created for. */
  var Event: TreeExpansionEvent
}

object ExpandVetoException {
  @scala.inline
  def apply(Context: XInterface, Event: TreeExpansionEvent, Message: String): ExpandVetoException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandVetoException]
  }
}

