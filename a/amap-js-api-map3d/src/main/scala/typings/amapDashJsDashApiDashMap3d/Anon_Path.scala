package typings.amapDashJsDashApiDashMap3d

import typings.amapDashJsDashApi.AMap.Pixel
import typings.amapDashJsDashApiDashMap3d.amapDashJsDashApiDashMap3dStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: js.Array[Pixel | (js.Tuple2[Double, Double])]
  var unit: px
}

object Anon_Path {
  @scala.inline
  def apply(path: js.Array[Pixel | (js.Tuple2[Double, Double])], unit: px): Anon_Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Path]
  }
}

