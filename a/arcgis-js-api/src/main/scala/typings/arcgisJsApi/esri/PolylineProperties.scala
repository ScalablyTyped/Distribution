package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolylineProperties extends GeometryProperties {
  /**
    * An array of paths, or line segments, that make up the polyline. Each path is a two-dimensional array of numbers representing the coordinates of each vertex in the path in the spatial reference of the view. Each vertex is represented as an array of two, three, or four numbers. The table below shows the various structures of a vertex array.
    *
    * Case | Vertex array
    * --- | ---
    * [without z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasZ) and [without m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasM) | [x, y]
    * [without z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasZ) and [with m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasM) | [x, y, m]
    * [with z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasZ) and [without m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasM) | [x, y, z]
    * [with z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasZ) and [with m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasM) | [x, y, z, m]
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#paths)
    */
  var paths: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.native
}

object PolylineProperties {
  @scala.inline
  def apply(): PolylineProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineProperties]
  }
  @scala.inline
  implicit class PolylinePropertiesOps[Self <: PolylineProperties] (val x: Self) extends AnyVal {
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
    def setPathsVarargs(value: js.Array[js.Array[Double]]*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[js.Array[js.Array[Double]]]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
  }
  
}

