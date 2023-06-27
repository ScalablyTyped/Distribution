package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RasterStretchRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RasterStretchRenderer")
@js.native
/**
		 * RasterStretchRenderer defines the symbology with a gradual ramp of colors for each pixel in a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), and [WCSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html) based on the pixel value.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html)
		 */
open class RasterStretchRenderer ()
  extends StObject
     with typings.arcgisJsApi.esri.RasterStretchRenderer {
  def this(properties: RasterStretchRendererProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RasterStretchRenderer {
  
  @JSGlobal("__esri.RasterStretchRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RasterStretchRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RasterStretchRenderer]
}
