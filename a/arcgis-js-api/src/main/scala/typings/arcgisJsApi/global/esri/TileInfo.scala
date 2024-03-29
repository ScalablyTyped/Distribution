package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TileInfoCreateOptions
import typings.arcgisJsApi.esri.TileInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TileInfo")
@js.native
/**
		 * Contains information about the tiling scheme for [TileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html), [ElevationLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html), [ImageryTileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), [VectorTileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html), and [WebTileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html)
		 */
open class TileInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.TileInfo {
  def this(properties: TileInfoProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object TileInfo {
  
  @JSGlobal("__esri.TileInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * A convenience method used to create a new TileInfo instance with preset properties like [LODs](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#lods).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
  		 */
  inline def create(): typings.arcgisJsApi.esri.TileInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.arcgisJsApi.esri.TileInfo]
  inline def create(options: TileInfoCreateOptions): typings.arcgisJsApi.esri.TileInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.TileInfo]
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.TileInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.TileInfo]
}
