package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ColormapInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ColormapInfo")
@js.native
/**
		 * The ColormapInfo describes pixel value, RGB colors and labels to color the raster.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html)
		 */
open class ColormapInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.ColormapInfo {
  def this(properties: ColormapInfoProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ColormapInfo {
  
  @JSGlobal("__esri.ColormapInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ColormapInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ColormapInfo]
}
