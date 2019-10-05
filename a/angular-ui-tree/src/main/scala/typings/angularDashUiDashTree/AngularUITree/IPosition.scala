package typings.angularDashUiDashTree.AngularUITree

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
    val __obj = js.Dynamic.literal(dirAx = dirAx, dirX = dirX, dirY = dirY, distAxX = distAxX, distAxY = distAxY, distX = distX, distY = distY, lastDirX = lastDirX, lastDirY = lastDirY, lastX = lastX, lastY = lastY, moving = moving, nowX = nowX, nowY = nowY, offsetX = offsetX, offsetY = offsetY, startX = startX, startY = startY)
  
    __obj.asInstanceOf[IPosition]
  }
}

