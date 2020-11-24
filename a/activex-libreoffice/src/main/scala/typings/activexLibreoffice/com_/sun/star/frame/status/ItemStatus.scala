package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a state of a property.
  * @since OOo 2.0
  */
@js.native
trait ItemStatus extends js.Object {
  
  /**
    * numerical value which describes the current state of an item.
    * @see ItemState
    */
  var State: Double = js.native
  
  /** optional data which can be used by an implementation to send additional information. The content is dependent on the specific implementation. */
  var aStateData: js.Any = js.native
}
object ItemStatus {
  
  @scala.inline
  def apply(State: Double, aStateData: js.Any): ItemStatus = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], aStateData = aStateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemStatus]
  }
  
  @scala.inline
  implicit class ItemStatusOps[Self <: ItemStatus] (val x: Self) extends AnyVal {
    
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
    def setState(value: Double): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAStateData(value: js.Any): Self = this.set("aStateData", value.asInstanceOf[js.Any])
  }
}
