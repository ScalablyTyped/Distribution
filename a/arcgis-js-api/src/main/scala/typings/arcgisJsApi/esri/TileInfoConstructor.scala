package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileInfoConstructor
  extends StObject
     with /**
  * Contains information about the tiling scheme for [TileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html), [ElevationLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html), [ImageryTileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), [VectorTileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html), and [WebTileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html)
  */
Instantiable0[TileInfo]
     with Instantiable1[/* properties */ TileInfoProperties, TileInfo] {
  
  /**
    * A convenience method used to create a new TileInfo instance with preset properties like [LODs](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#lods).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    */
  def create(): TileInfo = js.native
  def create(options: TileInfoCreateOptions): TileInfo = js.native
  
  def fromJSON(json: Any): TileInfo = js.native
}
