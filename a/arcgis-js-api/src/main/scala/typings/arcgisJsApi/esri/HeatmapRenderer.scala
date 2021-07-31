package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapRenderer
  extends StObject
     with Renderer
     with typings.arcgisJsApi.esri.renderers.Renderer
     with renderersRenderer {
  
  /**
    * The area of influence for each point in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#blurRadius)
    */
  var blurRadius: Double = js.native
  
  /**
    * An array of objects describing the renderer's color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops)
    */
  var colorStops: js.Array[HeatmapColorStop] = js.native
  
  /**
    * The name of the attribute field used to weight the intensity of each heatmap point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#field)
    */
  var field: String = js.native
  
  /**
    * The pixel intensity value that determines which pixels are assigned the final color in the [colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#maxPixelIntensity)
    */
  var maxPixelIntensity: Double = js.native
  
  /**
    * The pixel intensity value used to determine which pixels will be assigned the initial color in the [colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#minPixelIntensity)
    */
  var minPixelIntensity: Double = js.native
  
  /**
    * The type of renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#type)
    */
  @JSName("type")
  val type_HeatmapRenderer: typings.arcgisJsApi.arcgisJsApiStrings.heatmap = js.native
}
