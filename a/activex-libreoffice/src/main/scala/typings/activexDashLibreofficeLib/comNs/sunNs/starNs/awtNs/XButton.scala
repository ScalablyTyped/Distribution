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
    acquire: js.Function0[scala.Unit],
    addActionListener: js.Function1[XActionListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeActionListener: js.Function1[XActionListener, scala.Unit],
    setActionCommand: js.Function1[java.lang.String, scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit]
  ): XButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addActionListener")(addActionListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeActionListener")(removeActionListener)
    __obj.updateDynamic("setActionCommand")(setActionCommand)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.asInstanceOf[XButton]
  }
}

