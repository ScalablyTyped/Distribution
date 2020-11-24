package typings.angularUiTree.AngularUITree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPosition extends js.Object {
  
  var dirAx: Double = js.native
  
  var dirX: Double = js.native
  
  var dirY: Double = js.native
  
  var distAxX: Double = js.native
  
  var distAxY: Double = js.native
  
  var distX: Double = js.native
  
  var distY: Double = js.native
  
  var lastDirX: Double = js.native
  
  var lastDirY: Double = js.native
  
  var lastX: Double = js.native
  
  var lastY: Double = js.native
  
  var moving: Boolean = js.native
  
  var nowX: Double = js.native
  
  var nowY: Double = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var startX: Double = js.native
  
  var startY: Double = js.native
}
object IPosition {
  
  @scala.inline
  def apply(
    dirAx: Double,
    dirX: Double,
    dirY: Double,
    distAxX: Double,
    distAxY: Double,
    distX: Double,
    distY: Double,
    lastDirX: Double,
    lastDirY: Double,
    lastX: Double,
    lastY: Double,
    moving: Boolean,
    nowX: Double,
    nowY: Double,
    offsetX: Double,
    offsetY: Double,
    startX: Double,
    startY: Double
  ): IPosition = {
    val __obj = js.Dynamic.literal(dirAx = dirAx.asInstanceOf[js.Any], dirX = dirX.asInstanceOf[js.Any], dirY = dirY.asInstanceOf[js.Any], distAxX = distAxX.asInstanceOf[js.Any], distAxY = distAxY.asInstanceOf[js.Any], distX = distX.asInstanceOf[js.Any], distY = distY.asInstanceOf[js.Any], lastDirX = lastDirX.asInstanceOf[js.Any], lastDirY = lastDirY.asInstanceOf[js.Any], lastX = lastX.asInstanceOf[js.Any], lastY = lastY.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any], nowX = nowX.asInstanceOf[js.Any], nowY = nowY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPosition]
  }
  
  @scala.inline
  implicit class IPositionOps[Self <: IPosition] (val x: Self) extends AnyVal {
    
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
    def setDirAx(value: Double): Self = this.set("dirAx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirX(value: Double): Self = this.set("dirX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirY(value: Double): Self = this.set("dirY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistAxX(value: Double): Self = this.set("distAxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistAxY(value: Double): Self = this.set("distAxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistX(value: Double): Self = this.set("distX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistY(value: Double): Self = this.set("distY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDirX(value: Double): Self = this.set("lastDirX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDirY(value: Double): Self = this.set("lastDirY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastX(value: Double): Self = this.set("lastX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastY(value: Double): Self = this.set("lastY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoving(value: Boolean): Self = this.set("moving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNowX(value: Double): Self = this.set("nowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNowY(value: Double): Self = this.set("nowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
  }
}
