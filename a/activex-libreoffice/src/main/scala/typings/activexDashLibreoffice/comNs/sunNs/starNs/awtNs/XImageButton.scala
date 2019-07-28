package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to register for action events of an image button and sets the action command. */
trait XImageButton extends XInterface {
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): Unit
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): Unit
  /** sets the action command string. */
  def setActionCommand(Command: String): Unit
}

object XImageButton {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    setActionCommand: String => Unit
  ): XImageButton = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setActionCommand = js.Any.fromFunction1(setActionCommand))
  
    __obj.asInstanceOf[XImageButton]
  }
}

