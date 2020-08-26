package typings.amapJsApiMap3d.AMap.Object3D.Prism

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var color: String | (js.Array[js.Array[Double] | Double | String]) = js.native
  var color2: js.UndefOr[String | (js.Array[js.Array[Double] | Double | String])] = js.native
  var height: js.UndefOr[Double] = js.native
  var path: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel] = js.native
}

object Options {
  @scala.inline
  def apply(
    color: String | (js.Array[js.Array[Double] | Double | String]),
    path: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel]
  ): Options = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setColorVarargs(value: (js.Array[Double] | Double | String)*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: String | (js.Array[js.Array[Double] | Double | String])): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: ((js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[(js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]) | LngLat | Pixel]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor2Varargs(value: (js.Array[Double] | Double | String)*): Self = this.set("color2", js.Array(value :_*))
    @scala.inline
    def setColor2(value: String | (js.Array[js.Array[Double] | Double | String])): Self = this.set("color2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor2: Self = this.set("color2", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
  }
  
}

