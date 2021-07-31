package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapRendererProperties
  extends StObject
     with RendererProperties {
  
  /**
    * The area of influence for each point in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#blurRadius)
    */
  var blurRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of objects describing the renderer's color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops)
    */
  var colorStops: js.UndefOr[js.Array[HeatmapColorStopProperties]] = js.undefined
  
  /**
    * The name of the attribute field used to weight the intensity of each heatmap point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The pixel intensity value that determines which pixels are assigned the final color in the [colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#maxPixelIntensity)
    */
  var maxPixelIntensity: js.UndefOr[Double] = js.undefined
  
  /**
    * The pixel intensity value used to determine which pixels will be assigned the initial color in the [colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#minPixelIntensity)
    */
  var minPixelIntensity: js.UndefOr[Double] = js.undefined
}
object HeatmapRendererProperties {
  
  @scala.inline
  def apply(): HeatmapRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapRendererProperties]
  }
  
  @scala.inline
  implicit class HeatmapRendererPropertiesMutableBuilder[Self <: HeatmapRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    @scala.inline
    def setColorStops(value: js.Array[HeatmapColorStopProperties]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStopsUndefined: Self = StObject.set(x, "colorStops", js.undefined)
    
    @scala.inline
    def setColorStopsVarargs(value: HeatmapColorStopProperties*): Self = StObject.set(x, "colorStops", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setMaxPixelIntensity(value: Double): Self = StObject.set(x, "maxPixelIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPixelIntensityUndefined: Self = StObject.set(x, "maxPixelIntensity", js.undefined)
    
    @scala.inline
    def setMinPixelIntensity(value: Double): Self = StObject.set(x, "minPixelIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPixelIntensityUndefined: Self = StObject.set(x, "minPixelIntensity", js.undefined)
  }
}
