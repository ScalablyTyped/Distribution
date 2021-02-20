package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageryTileMixin extends StObject {
  
  /**
    * Defines a band combination using 0-based band indexes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#bandIds)
    */
  var bandIds: js.Array[Double] = js.native
  
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * This method fetches a tile for the given level, row and column present in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#fetchTile)
    */
  def fetchTile(level: Double, row: Double, col: Double): js.Promise[_] = js.native
  def fetchTile(level: Double, row: Double, col: Double, options: js.Any): js.Promise[_] = js.native
  
  /**
    * Identify pixel values at a given location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#identify)
    */
  def identify(point: Point): js.Promise[_] = js.native
  def identify(point: Point, options: RasterIdentifyOptions): js.Promise[_] = js.native
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#renderer)
    */
  var renderer: ClassBreaksRenderer | UniqueValueRenderer | RasterStretchRenderer | RasterShadedReliefRenderer | RasterColormapRenderer = js.native
  
  /**
    * The URL of the REST endpoint of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ImageryTileMixin.html#url)
    */
  var url: String = js.native
}
