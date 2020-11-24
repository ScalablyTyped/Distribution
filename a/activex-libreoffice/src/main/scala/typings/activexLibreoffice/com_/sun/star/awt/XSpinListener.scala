package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive spin events. */
@js.native
trait XSpinListener extends XEventListener {
  
  /** is invoked when the spin field is spun down. */
  def down(rEvent: SpinEvent): Unit = js.native
  
  /** is invoked when the spin field is set to the lower value. */
  def first(rEvent: SpinEvent): Unit = js.native
  
  /** is invoked when the spin field is set to the upper value. */
  def last(rEvent: SpinEvent): Unit = js.native
  
  /** is invoked when the spin field is spun up. */
  def up(rEvent: SpinEvent): Unit = js.native
}
object XSpinListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    down: SpinEvent => Unit,
    first: SpinEvent => Unit,
    last: SpinEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    up: SpinEvent => Unit
  ): XSpinListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), down = js.Any.fromFunction1(down), first = js.Any.fromFunction1(first), last = js.Any.fromFunction1(last), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), up = js.Any.fromFunction1(up))
    __obj.asInstanceOf[XSpinListener]
  }
  
  @scala.inline
  implicit class XSpinListenerOps[Self <: XSpinListener] (val x: Self) extends AnyVal {
    
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
    def setDown(value: SpinEvent => Unit): Self = this.set("down", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirst(value: SpinEvent => Unit): Self = this.set("first", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLast(value: SpinEvent => Unit): Self = this.set("last", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUp(value: SpinEvent => Unit): Self = this.set("up", js.Any.fromFunction1(value))
  }
}
