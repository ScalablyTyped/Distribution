package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the state of a check box and makes it possible to register for events. */
trait XCheckBox extends XInterface {
  /**
    * returns the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  var State: Double
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit
  /** enables or disables the tri state mode. */
  def enableTriState(b: Boolean): Unit
  /**
    * returns the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  def getState(): Double
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit
  /** sets the label of the check box. */
  def setLabel(Label: String): Unit
  /**
    * sets the state of the check box.
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    */
  def setState(n: Double): Unit
}

object XCheckBox {
  @scala.inline
  def apply(
    State: Double,
    acquire: () => Unit,
    addItemListener: XItemListener => Unit,
    enableTriState: Boolean => Unit,
    getState: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeItemListener: XItemListener => Unit,
    setLabel: String => Unit,
    setState: Double => Unit
  ): XCheckBox = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), enableTriState = js.Any.fromFunction1(enableTriState), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener), setLabel = js.Any.fromFunction1(setLabel), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[XCheckBox]
  }
}

