package typings.activexLibreoffice.com_.sun.star.inspection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies an interface for components to observer certain aspects of an {@link XPropertyControl} .
  * @since OOo 2.2
  */
@js.native
trait XPropertyControlObserver extends js.Object {
  
  /**
    * notifies the observer that a certain {@link XPropertyControl} 's UI representation gained the focus.
    * @param Control denotes the control whose UI representation gained the focus
    */
  def focusGained(Control: XPropertyControl): Unit = js.native
  
  /**
    * notifies the observer that a certain {@link XPropertyControl} 's value changed.
    * @param Control denotes the control whose value changed.
    * @see XPropertyControl.Value
    */
  def valueChanged(Control: XPropertyControl): Unit = js.native
}
object XPropertyControlObserver {
  
  @scala.inline
  def apply(focusGained: XPropertyControl => Unit, valueChanged: XPropertyControl => Unit): XPropertyControlObserver = {
    val __obj = js.Dynamic.literal(focusGained = js.Any.fromFunction1(focusGained), valueChanged = js.Any.fromFunction1(valueChanged))
    __obj.asInstanceOf[XPropertyControlObserver]
  }
  
  @scala.inline
  implicit class XPropertyControlObserverOps[Self <: XPropertyControlObserver] (val x: Self) extends AnyVal {
    
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
    def setFocusGained(value: XPropertyControl => Unit): Self = this.set("focusGained", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueChanged(value: XPropertyControl => Unit): Self = this.set("valueChanged", js.Any.fromFunction1(value))
  }
}
