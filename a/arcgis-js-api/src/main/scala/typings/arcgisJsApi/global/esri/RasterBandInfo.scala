package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RasterBandInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RasterBandInfo")
@js.native
/**
		 * referenced by [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#serviceRasterInfo) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#rasterInfo).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterBandInfo.html)
		 */
open class RasterBandInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.RasterBandInfo {
  def this(properties: RasterBandInfoProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RasterBandInfo {
  
  @JSGlobal("__esri.RasterBandInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RasterBandInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RasterBandInfo]
}
