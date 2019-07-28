package typings.activexDashLibreoffice.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an interface for components to observer certain aspects of an {@link XPropertyControl} .
  * @since OOo 2.2
  */
trait XPropertyControlObserver extends js.Object {
  /**
    * notifies the observer that a certain {@link XPropertyControl} 's UI representation gained the focus.
    * @param Control denotes the control whose UI representation gained the focus
    */
  def focusGained(Control: XPropertyControl): Unit
  /**
    * notifies the observer that a certain {@link XPropertyControl} 's value changed.
    * @param Control denotes the control whose value changed.
    * @see XPropertyControl.Value
    */
  def valueChanged(Control: XPropertyControl): Unit
}

object XPropertyControlObserver {
  @scala.inline
  def apply(focusGained: XPropertyControl => Unit, valueChanged: XPropertyControl => Unit): XPropertyControlObserver = {
    val __obj = js.Dynamic.literal(focusGained = js.Any.fromFunction1(focusGained), valueChanged = js.Any.fromFunction1(valueChanged))
  
    __obj.asInstanceOf[XPropertyControlObserver]
  }
}

