package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value of a spin field and makes it possible to register for spin events. */
@js.native
trait XSpinField extends XInterface {
  
  /** registers a listener for spin events. */
  def addSpinListener(l: XSpinListener): Unit = js.native
  
  /** decreases the value by one step. */
  def down(): Unit = js.native
  
  /** enables/disables automatic repeat mode. */
  def enableRepeat(bRepeat: Boolean): Unit = js.native
  
  /** sets the value to the previously set lower value. */
  def first(): Unit = js.native
  
  /** sets the value to the previously set upper value. */
  def last(): Unit = js.native
  
  /** unregisters a listener for spin events. */
  def removeSpinListener(l: XSpinListener): Unit = js.native
  
  /** increases the value by one step. */
  def up(): Unit = js.native
}
object XSpinField {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addSpinListener: XSpinListener => Unit,
    down: () => Unit,
    enableRepeat: Boolean => Unit,
    first: () => Unit,
    last: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSpinListener: XSpinListener => Unit,
    up: () => Unit
  ): XSpinField = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSpinListener = js.Any.fromFunction1(addSpinListener), down = js.Any.fromFunction0(down), enableRepeat = js.Any.fromFunction1(enableRepeat), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSpinListener = js.Any.fromFunction1(removeSpinListener), up = js.Any.fromFunction0(up))
    __obj.asInstanceOf[XSpinField]
  }
  
  @scala.inline
  implicit class XSpinFieldOps[Self <: XSpinField] (val x: Self) extends AnyVal {
    
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
    def setAddSpinListener(value: XSpinListener => Unit): Self = this.set("addSpinListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDown(value: () => Unit): Self = this.set("down", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableRepeat(value: Boolean => Unit): Self = this.set("enableRepeat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirst(value: () => Unit): Self = this.set("first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLast(value: () => Unit): Self = this.set("last", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveSpinListener(value: XSpinListener => Unit): Self = this.set("removeSpinListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUp(value: () => Unit): Self = this.set("up", js.Any.fromFunction0(value))
  }
}
