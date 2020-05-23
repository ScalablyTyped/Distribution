package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to set the label of a button and to register for action events. */
trait XButton extends XInterface {
  /** registers an event handler for button action events. */
  def addActionListener(l: XActionListener): Unit
  /** unregisters an event handler for button action events. */
  def removeActionListener(l: XActionListener): Unit
  /**
    * sets a command string for pushing the button.
    * @param Command value can be used to detect which button is pressed.
    */
  def setActionCommand(Command: String): Unit
  /** sets the label of the button. */
  def setLabel(Label: String): Unit
}

object XButton {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    setActionCommand: String => Unit,
    setLabel: String => Unit
  ): XButton = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setActionCommand = js.Any.fromFunction1(setActionCommand), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[XButton]
  }
}

