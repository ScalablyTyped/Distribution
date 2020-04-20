package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayerViewGL2DTile extends Object {
  /**
    * The bounds of the tile as an array of four numbers that be readily converted to an [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Tile)
    */
  var bounds: js.Array[Double]
  /**
    * The column identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Tile)
    */
  var col: Double
  /**
    * The coordinates of the top-left corner of the tile as an array of two numbers. The coordinates are in un-normalized map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Tile)
    */
  var coords: js.Array[Double]
  /**
    * The tile string identifier in the format `level/row/col/world`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Tile)
    */
  var id: String
  /**
    * The level identifier of the [LOD](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html) to which the tile belongs
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Tile)
    */
  var level: Double
  /**
    * The number of map units per pixel in the tile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Tile)
    */
  var resolution: Double
  /**
    * The row identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Tile)
    */
  var row: Double
  /**
    * The map scale at the tile's level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Tile)
    */
  var scale: Double
  /**
    * When the projection allows world wrapping (e.g. Web Mercator), identifies the instance of the world this tile's `level`/`row`/`col`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Tile)
    */
  var world: Double
}

object BaseLayerViewGL2DTile {
  @scala.inline
  def apply(
    bounds: js.Array[Double],
    col: Double,
    constructor: js.Function,
    coords: js.Array[Double],
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    level: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    resolution: Double,
    row: Double,
    scale: Double,
    world: Double
  ): BaseLayerViewGL2DTile = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resolution = resolution.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayerViewGL2DTile]
  }
}

