package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows notification when the selected range is changed.
  * @see com.sun.star.sheet.XRangeSelection
  */
@js.native
trait XRangeSelectionChangeListener extends XEventListener {
  
  /** is called when the selected range is changed while range selection is active. */
  def descriptorChanged(aEvent: RangeSelectionEvent): Unit = js.native
}
object XRangeSelectionChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    descriptorChanged: RangeSelectionEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRangeSelectionChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), descriptorChanged = js.Any.fromFunction1(descriptorChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRangeSelectionChangeListener]
  }
  
  @scala.inline
  implicit class XRangeSelectionChangeListenerOps[Self <: XRangeSelectionChangeListener] (val x: Self) extends AnyVal {
    
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
    def setDescriptorChanged(value: RangeSelectionEvent => Unit): Self = this.set("descriptorChanged", js.Any.fromFunction1(value))
  }
}
