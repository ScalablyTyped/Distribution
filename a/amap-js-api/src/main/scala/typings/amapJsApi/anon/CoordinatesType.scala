package typings.amapJsApi.anon

import typings.amapJsApi.amapJsApiStrings.LineString
import typings.amapJsApi.amapJsApiStrings.MultiPoint
import typings.amapJsApi.amapJsApiStrings.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordinatesType
  extends typings.amapJsApi.AMap.GeoJSON.Geometry {
  var coordinates: js.Array[js.Tuple2[Double, Double]] = js.native
  var `type`: MultiPoint | LineString | Polygon = js.native
}

object CoordinatesType {
  @scala.inline
  def apply(coordinates: js.Array[js.Tuple2[Double, Double]], `type`: MultiPoint | LineString | Polygon): CoordinatesType = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatesType]
  }
  @scala.inline
  implicit class CoordinatesTypeOps[Self <: CoordinatesType] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: (js.Tuple2[Double, Double])*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[js.Tuple2[Double, Double]]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MultiPoint | LineString | Polygon): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

