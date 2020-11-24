package typings.agGrid.gridOptionsMod

import typings.agGrid.gridCellMod.GridCellDef
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateToNextCellParams extends js.Object {
  
  var event: KeyboardEvent = js.native
  
  var key: Double = js.native
  
  var nextCellDef: GridCellDef = js.native
  
  var previousCellDef: GridCellDef = js.native
}
object NavigateToNextCellParams {
  
  @scala.inline
  def apply(event: KeyboardEvent, key: Double, nextCellDef: GridCellDef, previousCellDef: GridCellDef): NavigateToNextCellParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], nextCellDef = nextCellDef.asInstanceOf[js.Any], previousCellDef = previousCellDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToNextCellParams]
  }
  
  @scala.inline
  implicit class NavigateToNextCellParamsOps[Self <: NavigateToNextCellParams] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: KeyboardEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextCellDef(value: GridCellDef): Self = this.set("nextCellDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousCellDef(value: GridCellDef): Self = this.set("previousCellDef", value.asInstanceOf[js.Any])
  }
}
