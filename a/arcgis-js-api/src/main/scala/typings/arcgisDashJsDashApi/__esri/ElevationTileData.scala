package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationTileData extends Object {
  /**
    * The height of the tile in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var height: Double
  /**
    * The maximum allowed error of the Z-value for each value in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var maxZError: Double
  /**
    * Indicating the pixel values where no elevation data is present.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var noDataValue: Double
  /**
    * The elevation values of each pixel in the tile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var values: js.Array[Double]
  /**
    * The width of the tile in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var width: Double
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
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), height = height, maxZError = maxZError, noDataValue = noDataValue, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), values = values, width = width)
  
    __obj.asInstanceOf[ElevationTileData]
  }
}

