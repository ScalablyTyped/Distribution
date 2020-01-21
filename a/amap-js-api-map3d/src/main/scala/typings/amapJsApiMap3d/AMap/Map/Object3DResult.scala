package typings.amapJsApiMap3d.AMap.Map

import typings.amapJsApiMap3d.AMap.Object3D
import typings.amapJsApiMap3d.AMap.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object3DResult extends js.Object {
  var distance: Double
  var index: Double
  var `object`: Object3D
  var point: Vector3
}

object Object3DResult {
  @scala.inline
  def apply(distance: Double, index: Double, `object`: Object3D, point: Vector3): Object3DResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object3DResult]
  }
}

