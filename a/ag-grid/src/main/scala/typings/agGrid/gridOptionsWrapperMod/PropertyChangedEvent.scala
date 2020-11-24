package typings.agGrid.gridOptionsWrapperMod

import typings.agGrid.eventsMod.AgEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyChangedEvent extends AgEvent {
  
  var currentValue: js.Any = js.native
  
  var previousValue: js.Any = js.native
}
object PropertyChangedEvent {
  
  @scala.inline
  def apply(currentValue: js.Any, previousValue: js.Any, `type`: String): PropertyChangedEvent = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangedEvent]
  }
  
  @scala.inline
  implicit class PropertyChangedEventOps[Self <: PropertyChangedEvent] (val x: Self) extends AnyVal {
    
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
    def setCurrentValue(value: js.Any): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousValue(value: js.Any): Self = this.set("previousValue", value.asInstanceOf[js.Any])
  }
}
