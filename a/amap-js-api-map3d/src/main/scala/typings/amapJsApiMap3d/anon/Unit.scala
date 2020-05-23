package typings.amapJsApiMap3d.anon

import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unit extends js.Object {
  var path: js.Array[Pixel | (js.Tuple2[Double, Double])]
  var unit: px
}

object Unit {
  @scala.inline
  def apply(path: js.Array[Pixel | (js.Tuple2[Double, Double])], unit: px): Unit = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unit]
  }
}

