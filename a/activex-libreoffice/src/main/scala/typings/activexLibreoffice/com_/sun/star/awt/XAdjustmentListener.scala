package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive adjustment events. */
@js.native
trait XAdjustmentListener extends XEventListener {
  
  /** is invoked when the adjustment has changed. */
  def adjustmentValueChanged(rEvent: AdjustmentEvent): Unit = js.native
}
object XAdjustmentListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    adjustmentValueChanged: AdjustmentEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAdjustmentListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), adjustmentValueChanged = js.Any.fromFunction1(adjustmentValueChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAdjustmentListener]
  }
  
  @scala.inline
  implicit class XAdjustmentListenerOps[Self <: XAdjustmentListener] (val x: Self) extends AnyVal {
    
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
    def setAdjustmentValueChanged(value: AdjustmentEvent => Unit): Self = this.set("adjustmentValueChanged", js.Any.fromFunction1(value))
  }
}
