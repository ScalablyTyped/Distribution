package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to register for action events of an image button and sets the action command. */
trait XImageButton
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): scala.Unit
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): scala.Unit
  /** sets the action command string. */
  def setActionCommand(Command: java.lang.String): scala.Unit
}

object XImageButton {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addActionListener: XActionListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeActionListener: XActionListener => scala.Unit,
    setActionCommand: java.lang.String => scala.Unit
  ): XImageButton = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setActionCommand = js.Any.fromFunction1(setActionCommand))
  
    __obj.asInstanceOf[XImageButton]
  }
}

