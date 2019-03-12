package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to set the label of a button and to register for action events. */
trait XButton
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** registers an event handler for button action events. */
  def addActionListener(l: XActionListener): scala.Unit
  /** unregisters an event handler for button action events. */
  def removeActionListener(l: XActionListener): scala.Unit
  /**
    * sets a command string for pushing the button.
    * @param Command value can be used to detect which button is pressed.
    */
  def setActionCommand(Command: java.lang.String): scala.Unit
  /** sets the label of the button. */
  def setLabel(Label: java.lang.String): scala.Unit
}

object XButton {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addActionListener: XActionListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeActionListener: XActionListener => scala.Unit,
    setActionCommand: java.lang.String => scala.Unit,
    setLabel: java.lang.String => scala.Unit
  ): XButton = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setActionCommand = js.Any.fromFunction1(setActionCommand), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[XButton]
  }
}

