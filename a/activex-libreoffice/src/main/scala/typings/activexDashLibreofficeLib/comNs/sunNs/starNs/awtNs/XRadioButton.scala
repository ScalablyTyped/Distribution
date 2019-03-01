package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the state of a radio button and makes it possible to register item event listeners. */
trait XRadioButton
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  var State: scala.Boolean
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): scala.Unit
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  def getState(): scala.Boolean
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): scala.Unit
  /** sets the label of the radio button. */
  def setLabel(Label: java.lang.String): scala.Unit
  /** sets the state of the radio button. */
  def setState(b: scala.Boolean): scala.Unit
}

object XRadioButton {
  @scala.inline
  def apply(
    State: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    addItemListener: js.Function1[XItemListener, scala.Unit],
    getState: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeItemListener: js.Function1[XItemListener, scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setState: js.Function1[scala.Boolean, scala.Unit]
  ): XRadioButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("State")(State)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addItemListener")(addItemListener)
    __obj.updateDynamic("getState")(getState)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeItemListener")(removeItemListener)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.updateDynamic("setState")(setState)
    __obj.asInstanceOf[XRadioButton]
  }
}

