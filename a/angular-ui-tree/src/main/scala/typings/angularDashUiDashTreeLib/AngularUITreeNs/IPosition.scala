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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dirAx")(dirAx)
    __obj.updateDynamic("dirX")(dirX)
    __obj.updateDynamic("dirY")(dirY)
    __obj.updateDynamic("distAxX")(distAxX)
    __obj.updateDynamic("distAxY")(distAxY)
    __obj.updateDynamic("distX")(distX)
    __obj.updateDynamic("distY")(distY)
    __obj.updateDynamic("lastDirX")(lastDirX)
    __obj.updateDynamic("lastDirY")(lastDirY)
    __obj.updateDynamic("lastX")(lastX)
    __obj.updateDynamic("lastY")(lastY)
    __obj.updateDynamic("moving")(moving)
    __obj.updateDynamic("nowX")(nowX)
    __obj.updateDynamic("nowY")(nowY)
    __obj.updateDynamic("offsetX")(offsetX)
    __obj.updateDynamic("offsetY")(offsetY)
    __obj.updateDynamic("startX")(startX)
    __obj.updateDynamic("startY")(startY)
    __obj.asInstanceOf[IPosition]
  }
}

