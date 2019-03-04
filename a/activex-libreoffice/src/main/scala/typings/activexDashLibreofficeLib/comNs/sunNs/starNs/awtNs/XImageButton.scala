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
    acquire: js.Function0[scala.Unit],
    addActionListener: js.Function1[XActionListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeActionListener: js.Function1[XActionListener, scala.Unit],
    setActionCommand: js.Function1[java.lang.String, scala.Unit]
  ): XImageButton = {
    val __obj = js.Dynamic.literal(acquire = acquire, addActionListener = addActionListener, queryInterface = queryInterface, release = release, removeActionListener = removeActionListener, setActionCommand = setActionCommand)
  
    __obj.asInstanceOf[XImageButton]
  }
}

