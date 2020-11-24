package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`base-tile`
import typings.arcgisJsApi.arcgisJsApiStrings.`bing-maps`
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseTileLayer
  extends Layer
     with ScaleRangeLayer
     with RefreshableLayer
     with BlendLayer {
  
  /**
    * Adds a promise to the layer's [loadable](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#loadable) chain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#addResolvingPromise)
    */
  def addResolvingPromise(promiseToLoad: js.Promise[_]): js.Promise[_] = js.native
  
  /**
    * This method fetches a tile for the given level, row and column present in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#fetchTile)
    */
  def fetchTile(level: Double, row: Double, col: Double): js.Promise[HTMLImageElement | HTMLCanvasElement] = js.native
  def fetchTile(level: Double, row: Double, col: Double, options: BaseTileLayerFetchTileOptions): js.Promise[HTMLImageElement | HTMLCanvasElement] = js.native
  
  /**
    * Returns the bounds of the tile as an array of four numbers that be readily converted to an [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#getTileBounds)
    */
  def getTileBounds(level: Double, row: Double, column: Double): js.Array[Double] = js.native
  def getTileBounds(level: Double, row: Double, column: Double, out: js.Array[Double]): js.Array[Double] = js.native
  
  /**
    * This method returns a URL to an image for a given level, row and column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#getTileUrl)
    */
  def getTileUrl(level: Double, row: Double, col: Double): String = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
  
  /**
    * For [BaseTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html) the type is `base-tile`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html#type)
    */
  @JSName("type")
  val type_BaseTileLayer: `base-tile` | `bing-maps` = js.native
}
