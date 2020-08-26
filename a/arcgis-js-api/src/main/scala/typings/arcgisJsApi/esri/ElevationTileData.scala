package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationTileData extends Object {
  /**
    * The height of the tile in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var height: Double = js.native
  /**
    * The maximum allowed error of the Z-value for each value in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var maxZError: Double = js.native
  /**
    * Indicating the pixel values where no elevation data is present.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var noDataValue: Double = js.native
  /**
    * The elevation values of each pixel in the tile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var values: js.Array[Double] = js.native
  /**
    * The width of the tile in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var width: Double = js.native
}

object ElevationTileData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    height: Double,
    maxZError: Double,
    noDataValue: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    values: js.Array[Double],
    width: Double
  ): ElevationTileData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), height = height.asInstanceOf[js.Any], maxZError = maxZError.asInstanceOf[js.Any], noDataValue = noDataValue.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), values = values.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationTileData]
  }
  @scala.inline
  implicit class ElevationTileDataOps[Self <: ElevationTileData] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxZError(value: Double): Self = this.set("maxZError", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoDataValue(value: Double): Self = this.set("noDataValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

