package typings
package angularDashUiDashTreeLib.AngularUITreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPosition extends js.Object {
  var dirAx: scala.Double
  var dirX: scala.Double
  var dirY: scala.Double
  var distAxX: scala.Double
  var distAxY: scala.Double
  var distX: scala.Double
  var distY: scala.Double
  var lastDirX: scala.Double
  var lastDirY: scala.Double
  var lastX: scala.Double
  var lastY: scala.Double
  var moving: scala.Boolean
  var nowX: scala.Double
  var nowY: scala.Double
  var offsetX: scala.Double
  var offsetY: scala.Double
  var startX: scala.Double
  var startY: scala.Double
}

object IPosition {
  @scala.inline
  def apply(
    dirAx: scala.Double,
    dirX: scala.Double,
    dirY: scala.Double,
    distAxX: scala.Double,
    distAxY: scala.Double,
    distX: scala.Double,
    distY: scala.Double,
    lastDirX: scala.Double,
    lastDirY: scala.Double,
    lastX: scala.Double,
    lastY: scala.Double,
    moving: scala.Boolean,
    nowX: scala.Double,
    nowY: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double,
    startX: scala.Double,
    startY: scala.Double
  ): IPosition = {
    val __obj = js.Dynamic.literal(dirAx = dirAx, dirX = dirX, dirY = dirY, distAxX = distAxX, distAxY = distAxY, distX = distX, distY = distY, lastDirX = lastDirX, lastDirY = lastDirY, lastX = lastX, lastY = lastY, moving = moving, nowX = nowX, nowY = nowY, offsetX = offsetX, offsetY = offsetY, startX = startX, startY = startY)
  
    __obj.asInstanceOf[IPosition]
  }
}

