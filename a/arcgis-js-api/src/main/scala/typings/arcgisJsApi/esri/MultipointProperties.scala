package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipointProperties extends GeometryProperties {
  /**
    * An array of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points)
    */
  var points: js.UndefOr[js.Array[js.Array[Double]]] = js.native
}

object MultipointProperties {
  @scala.inline
  def apply(): MultipointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipointProperties]
  }
  @scala.inline
  implicit class MultipointPropertiesOps[Self <: MultipointProperties] (val x: Self) extends AnyVal {
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
    def setPointsVarargs(value: js.Array[Double]*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[js.Array[Double]]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
  }
  
}

