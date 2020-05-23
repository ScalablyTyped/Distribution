package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an event sent by an {@link XUndoManager} implementation when the Undo/Redo stacks of the manager are modified.
  * @see XUndoManager
  * @see XUndoManagerListener
  * @see XUndoAction
  * @since OOo 3.4
  */
trait UndoManagerEvent
  extends typings.activexLibreoffice.com_.sun.star.lang.EventObject {
  /**
    * the title of the undo action which is described by the event
    * @see XUndoAction.Title
    */
  var UndoActionTitle: String
  /**
    * denotes the number of Undo contexts which are open, and not yet closed, at the time the event is fired.
    * @see XUndoManager.enterUndoContext
    */
  var UndoContextDepth: Double
}

object UndoManagerEvent {
  @scala.inline
  def apply(Source: XInterface, UndoActionTitle: String, UndoContextDepth: Double): UndoManagerEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], UndoActionTitle = UndoActionTitle.asInstanceOf[js.Any], UndoContextDepth = UndoContextDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoManagerEvent]
  }
}

