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
    acquire: () => scala.Unit,
    addItemListener: XItemListener => scala.Unit,
    enableTriState: scala.Boolean => scala.Unit,
    getState: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeItemListener: XItemListener => scala.Unit,
    setLabel: java.lang.String => scala.Unit,
    setState: scala.Double => scala.Unit
  ): XCheckBox = {
    val __obj = js.Dynamic.literal(State = State, acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), enableTriState = js.Any.fromFunction1(enableTriState), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener), setLabel = js.Any.fromFunction1(setLabel), setState = js.Any.fromFunction1(setState))
  
    __obj.asInstanceOf[XCheckBox]
  }
}

