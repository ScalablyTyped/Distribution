package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RasterColormapRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RasterColormapRenderer")
@js.native
/**
		 * The RasterColormapRenderer defines the symbology to display raster data based on specific colors, aiding in visual analysis of the data.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html)
		 */
open class RasterColormapRenderer ()
  extends StObject
     with typings.arcgisJsApi.esri.RasterColormapRenderer {
  def this(properties: RasterColormapRendererProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RasterColormapRenderer {
  
  @JSGlobal("__esri.RasterColormapRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a new instance [RasterColormapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html) from an array of color maps where pixel values with its corresponding RGB color values specified.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html#createFromColormap)
  		 */
  inline def createFromColormap(colormap: js.Array[js.Array[Double]]): typings.arcgisJsApi.esri.RasterColormapRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromColormap")(colormap.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RasterColormapRenderer]
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RasterColormapRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RasterColormapRenderer]
}
