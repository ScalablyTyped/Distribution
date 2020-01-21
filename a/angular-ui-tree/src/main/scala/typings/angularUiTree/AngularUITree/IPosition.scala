package typings.angularUiTree.AngularUITree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPosition extends js.Object {
  var dirAx: Double
  var dirX: Double
  var dirY: Double
  var distAxX: Double
  var distAxY: Double
  var distX: Double
  var distY: Double
  var lastDirX: Double
  var lastDirY: Double
  var lastX: Double
  var lastY: Double
  var moving: Boolean
  var nowX: Double
  var nowY: Double
  var offsetX: Double
  var offsetY: Double
  var startX: Double
  var startY: Double
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
}

