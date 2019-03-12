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
    acquire: () => scala.Unit,
    addItemListener: XItemListener => scala.Unit,
    getState: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeItemListener: XItemListener => scala.Unit,
    setLabel: java.lang.String => scala.Unit,
    setState: scala.Boolean => scala.Unit
  ): XRadioButton = {
    val __obj = js.Dynamic.literal(State = State, acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener), setLabel = js.Any.fromFunction1(setLabel), setState = js.Any.fromFunction1(setState))
  
    __obj.asInstanceOf[XRadioButton]
  }
}

