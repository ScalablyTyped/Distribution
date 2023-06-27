package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RasterSensorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RasterSensorInfo")
@js.native
/**
		 * The `RasterSensorInfo` class provides additional information on the raster sensor associated with an image service referenced by [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#serviceRasterInfo) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#rasterInfo).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html)
		 */
open class RasterSensorInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.RasterSensorInfo {
  def this(properties: RasterSensorInfoProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RasterSensorInfo {
  
  @JSGlobal("__esri.RasterSensorInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RasterSensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RasterSensorInfo]
}
