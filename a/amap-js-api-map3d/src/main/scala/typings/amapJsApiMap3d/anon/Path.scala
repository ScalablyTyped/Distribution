package typings.amapJsApiMap3d.anon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.meter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends js.Object {
  var path: js.Array[LngLat | (js.Tuple2[Double, Double])] = js.native
  var unit: js.UndefOr[meter] = js.native
}

object Path {
  @scala.inline
  def apply(path: js.Array[LngLat | (js.Tuple2[Double, Double])]): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
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
    def setPathVarargs(value: (LngLat | (js.Tuple2[Double, Double]))*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[LngLat | (js.Tuple2[Double, Double])]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit(value: meter): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

