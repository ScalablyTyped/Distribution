package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the state of a check box and makes it possible to register for events. */
trait XCheckBox
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  var State: scala.Double
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): scala.Unit
  /** enables or disables the tri state mode. */
  def enableTriState(b: scala.Boolean): scala.Unit
  /**
    * returns the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  def getState(): scala.Double
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): scala.Unit
  /** sets the label of the check box. */
  def setLabel(Label: java.lang.String): scala.Unit
  /**
    * sets the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  def setState(n: scala.Double): scala.Unit
}

object XCheckBox {
  @scala.inline
  def apply(
    State: scala.Double,
    acquire: js.Function0[scala.Unit],
    addItemListener: js.Function1[XItemListener, scala.Unit],
    enableTriState: js.Function1[scala.Boolean, scala.Unit],
    getState: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeItemListener: js.Function1[XItemListener, scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setState: js.Function1[scala.Double, scala.Unit]
  ): XCheckBox = {
    val __obj = js.Dynamic.literal(State = State, acquire = acquire, addItemListener = addItemListener, enableTriState = enableTriState, getState = getState, queryInterface = queryInterface, release = release, removeItemListener = removeItemListener, setLabel = setLabel, setState = setState)
  
    __obj.asInstanceOf[XCheckBox]
  }
}

