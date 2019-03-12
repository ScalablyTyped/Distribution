package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tile
  extends stdLib.Object {
  /**
    * The bounds of the tile as an array of four numbers that be readily converted to an [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var bounds: js.Array[scala.Double]
  /**
    * The column identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var col: scala.Double
  /**
    * The coordinates of the top-left corner of the tile as an array of two numbers. The coordinates are in un-normalized map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var coords: js.Array[scala.Double]
  /**
    * The tile string identifier in the format `level/row/col/world`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var id: java.lang.String
  /**
    * The level identifier of the [LOD](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html) to which the tile belongs
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var level: scala.Double
  /**
    * The number of map units per pixel in the tile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var resolution: scala.Double
  /**
    * The row identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var row: scala.Double
  /**
    * The map scale at the tile's level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var scale: scala.Double
  /**
    * When the projection allows world wrapping (e.g. Web Mercator), identifies the instance of the world this tile's `level`/`row`/`col`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var world: scala.Double
}

object Tile {
  @scala.inline
  def apply(
    bounds: js.Array[scala.Double],
    col: scala.Double,
    constructor: js.Function,
    coords: js.Array[scala.Double],
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    id: java.lang.String,
    level: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    resolution: scala.Double,
    row: scala.Double,
    scale: scala.Double,
    world: scala.Double
  ): Tile = {
    val __obj = js.Dynamic.literal(bounds = bounds, col = col, constructor = constructor, coords = coords, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, level = level, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resolution = resolution, row = row, scale = scale, world = world)
  
    __obj.asInstanceOf[Tile]
  }
}

