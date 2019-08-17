package typings.amapDashJsDashApiDashMap3d.AMapNs.MapNs

import typings.amapDashJsDashApiDashMap3d.AMapNs.Object3D
import typings.amapDashJsDashApiDashMap3d.AMapNs.Vector3
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
    val __obj = js.Dynamic.literal(distance = distance, index = index, point = point)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Object3DResult]
  }
}

