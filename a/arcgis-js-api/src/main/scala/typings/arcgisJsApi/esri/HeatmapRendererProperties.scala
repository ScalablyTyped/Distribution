package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapRendererProperties
  extends StObject
     with RendererProperties {
  
  /**
    * An array of objects describing the renderer's color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops)
    */
  var colorStops: js.UndefOr[js.Array[HeatmapColorStopProperties]] = js.undefined
  
  /**
    * The name of the attribute field used to weight the density of each heatmap point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * An object providing options for describing the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[HeatmapRendererLegendOptions] = js.undefined
  
  /**
    * The max density value to be assigned a color in the heatmap surface.
    *
    * @default 0.04
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#maxDensity)
    */
  var maxDensity: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum density value to be assigned a color in the heatmap surface.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#minDensity)
    */
  var minDensity: js.UndefOr[Double] = js.undefined
  
  /**
    * The search radius (in points) used to create a smooth kernel surface fitted around each point.
    *
    * @default 18
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#radius)
    */
  var radius: js.UndefOr[Double | String] = js.undefined
  
  /**
    * When set, the heatmap's visualization at the given scale will remain static and not change as the user zooms in and out of the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#referenceScale)
    */
  var referenceScale: js.UndefOr[Double] = js.undefined
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#valueExpression)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  
  /**
    * The title identifying and describing the [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#valueExpression) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
}
object HeatmapRendererProperties {
  
  inline def apply(): HeatmapRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatmapRendererProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeatmapRendererProperties] (val x: Self) extends AnyVal {
    
    inline def setColorStops(value: js.Array[HeatmapColorStopProperties]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    inline def setColorStopsUndefined: Self = StObject.set(x, "colorStops", js.undefined)
    
    inline def setColorStopsVarargs(value: HeatmapColorStopProperties*): Self = StObject.set(x, "colorStops", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLegendOptions(value: HeatmapRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setMaxDensity(value: Double): Self = StObject.set(x, "maxDensity", value.asInstanceOf[js.Any])
    
    inline def setMaxDensityUndefined: Self = StObject.set(x, "maxDensity", js.undefined)
    
    inline def setMinDensity(value: Double): Self = StObject.set(x, "minDensity", value.asInstanceOf[js.Any])
    
    inline def setMinDensityUndefined: Self = StObject.set(x, "minDensity", js.undefined)
    
    inline def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setReferenceScale(value: Double): Self = StObject.set(x, "referenceScale", value.asInstanceOf[js.Any])
    
    inline def setReferenceScaleUndefined: Self = StObject.set(x, "referenceScale", js.undefined)
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitle(value: String): Self = StObject.set(x, "valueExpressionTitle", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionTitleUndefined: Self = StObject.set(x, "valueExpressionTitle", js.undefined)
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
  }
}
