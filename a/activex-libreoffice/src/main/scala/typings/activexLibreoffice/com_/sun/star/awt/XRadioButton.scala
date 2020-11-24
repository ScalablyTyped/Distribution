package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the state of a radio button and makes it possible to register item event listeners. */
@js.native
trait XRadioButton extends XInterface {
  
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  var State: Boolean = js.native
  
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): Unit = js.native
  
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  def getState(): Boolean = js.native
  
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): Unit = js.native
  
  /** sets the label of the radio button. */
  def setLabel(Label: String): Unit = js.native
  
  /** sets the state of the radio button. */
  def setState(b: Boolean): Unit = js.native
}
object XRadioButton {
  
  @scala.inline
  def apply(
    State: Boolean,
    acquire: () => Unit,
    addItemListener: XItemListener => Unit,
    getState: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeItemListener: XItemListener => Unit,
    setLabel: String => Unit,
    setState: Boolean => Unit
  ): XRadioButton = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addItemListener = js.Any.fromFunction1(addItemListener), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeItemListener = js.Any.fromFunction1(removeItemListener), setLabel = js.Any.fromFunction1(setLabel), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[XRadioButton]
  }
  
  @scala.inline
  implicit class XRadioButtonOps[Self <: XRadioButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setState(value: Boolean): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddItemListener(value: XItemListener => Unit): Self = this.set("addItemListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => Boolean): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveItemListener(value: XItemListener => Unit): Self = this.set("removeItemListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabel(value: String => Unit): Self = this.set("setLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetState(value: Boolean => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
  }
}
