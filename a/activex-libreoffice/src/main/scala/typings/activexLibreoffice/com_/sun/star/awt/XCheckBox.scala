package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the state of a check box and makes it possible to register for events. */
trait XCheckBox
  extends StObject
     with XInterface {
  
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
  
  inline def apply(
    State: Double,
    acquire: () => Unit,
    addItemListener: XItemListener => Unit,
    enableTriState: Boolean => Unit,
    getState: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeItemListener: XItemListener => Unit,
    setLabel: String => Unit,
    setState: Double => Unit
  ): XCheckBox = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), enableTriState = js.Any.fromFunction1(enableTriState), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener), setLabel = js.Any.fromFunction1(setLabel), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[XCheckBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XCheckBox] (val x: Self) extends AnyVal {
    
    inline def setAddItemListener(value: XItemListener => Unit): Self = StObject.set(x, "addItemListener", js.Any.fromFunction1(value))
    
    inline def setEnableTriState(value: Boolean => Unit): Self = StObject.set(x, "enableTriState", js.Any.fromFunction1(value))
    
    inline def setGetState(value: () => Double): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setRemoveItemListener(value: XItemListener => Unit): Self = StObject.set(x, "removeItemListener", js.Any.fromFunction1(value))
    
    inline def setSetLabel(value: String => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
    
    inline def setSetState(value: Double => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    
    inline def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
