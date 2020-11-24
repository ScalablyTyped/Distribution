package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapRendererProperties extends RendererProperties {
  
  /**
    * The area of influence for each point in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#blurRadius)
    */
  var blurRadius: js.UndefOr[Double] = js.native
  
  /**
    * An array of objects describing the renderer's color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops)
    */
  var colorStops: js.UndefOr[js.Array[HeatmapColorStopProperties]] = js.native
  
  /**
    * The name of the attribute field used to weight the intensity of each heatmap point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * The pixel intensity value that determines which pixels are assigned the final color in the [colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#maxPixelIntensity)
    */
  var maxPixelIntensity: js.UndefOr[Double] = js.native
  
  /**
    * The pixel intensity value used to determine which pixels will be assigned the initial color in the [colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#minPixelIntensity)
    */
  var minPixelIntensity: js.UndefOr[Double] = js.native
}
object HeatmapRendererProperties {
  
  @scala.inline
  def apply(): HeatmapRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapRendererProperties]
  }
  
  @scala.inline
  implicit class HeatmapRendererPropertiesOps[Self <: HeatmapRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlurRadius(value: Double): Self = this.set("blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurRadius: Self = this.set("blurRadius", js.undefined)
    
    @scala.inline
    def setColorStopsVarargs(value: HeatmapColorStopProperties*): Self = this.set("colorStops", js.Array(value :_*))
    
    @scala.inline
    def setColorStops(value: js.Array[HeatmapColorStopProperties]): Self = this.set("colorStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorStops: Self = this.set("colorStops", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setMaxPixelIntensity(value: Double): Self = this.set("maxPixelIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPixelIntensity: Self = this.set("maxPixelIntensity", js.undefined)
    
    @scala.inline
    def setMinPixelIntensity(value: Double): Self = this.set("minPixelIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPixelIntensity: Self = this.set("minPixelIntensity", js.undefined)
  }
}
