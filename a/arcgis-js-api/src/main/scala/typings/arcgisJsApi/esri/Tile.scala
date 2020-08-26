package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tile extends Object {
  /**
    * The bounds of the tile as an array of four numbers that be readily converted to an [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var bounds: js.Array[Double] = js.native
  /**
    * The column identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var col: Double = js.native
  /**
    * The coordinates of the top-left corner of the tile as an array of two numbers. The coordinates are in un-normalized map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var coords: js.Array[Double] = js.native
  /**
    * The tile string identifier in the format `level/row/col/world`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var id: String = js.native
  /**
    * The level identifier of the [LOD](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html) to which the tile belongs
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var level: Double = js.native
  /**
    * The number of map units per pixel in the tile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var resolution: Double = js.native
  /**
    * The row identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var row: Double = js.native
  /**
    * The map scale at the tile's level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var scale: Double = js.native
  /**
    * When the projection allows world wrapping (e.g. Web Mercator), identifies the instance of the world this tile's `level`/`row`/`col`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile)
    */
  var world: Double = js.native
}

object Tile {
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
  ): Tile = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resolution = resolution.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tile]
  }
  @scala.inline
  implicit class TileOps[Self <: Tile] (val x: Self) extends AnyVal {
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
    def setBoundsVarargs(value: Double*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: js.Array[Double]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoordsVarargs(value: Double*): Self = this.set("coords", js.Array(value :_*))
    @scala.inline
    def setCoords(value: js.Array[Double]): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorld(value: Double): Self = this.set("world", value.asInstanceOf[js.Any])
  }
  
}

