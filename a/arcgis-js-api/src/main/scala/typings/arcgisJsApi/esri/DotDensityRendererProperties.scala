package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotDensityRendererProperties
  extends StObject
     with RendererProperties {
  
  /**
    * Defines the variable(s) used to visualize density.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes)
    */
  var attributes: js.UndefOr[js.Array[AttributeColorInfoProperties]] = js.undefined
  
  /**
    * The color used to shade the polygon fill behind the dots.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#backgroundColor)
    */
  var backgroundColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * Only applicable when two or more [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes) are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotBlendingEnabled)
    */
  var dotBlendingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the initial dot value used for visualizing density.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#dotValue)
    */
  var dotValue: js.UndefOr[Double] = js.undefined
  
  /**
    * An object providing options for configuring the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[DotDensityRendererLegendOptions] = js.undefined
  
  /**
    * The outline of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#outline)
    */
  var outline: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  
  /**
    * When defined, the renderer will recalculate the dot value linearly based on the change in the view's scale using the [calculateDotValue()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#calculateDotValue) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale)
    */
  var referenceScale: js.UndefOr[Double] = js.undefined
  
  /**
    * When set to a consistent value, dot placements will be preserved for the same scale given all parameters are the same in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#seed)
    */
  var seed: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of [Size Visual Variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[VisualVariableProperties]] = js.undefined
}
object DotDensityRendererProperties {
  
  inline def apply(): DotDensityRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotDensityRendererProperties]
  }
  
  extension [Self <: DotDensityRendererProperties](x: Self) {
    
    inline def setAttributes(value: js.Array[AttributeColorInfoProperties]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeColorInfoProperties*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setBackgroundColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundColorVarargs(value: Double*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    inline def setDotBlendingEnabled(value: Boolean): Self = StObject.set(x, "dotBlendingEnabled", value.asInstanceOf[js.Any])
    
    inline def setDotBlendingEnabledUndefined: Self = StObject.set(x, "dotBlendingEnabled", js.undefined)
    
    inline def setDotValue(value: Double): Self = StObject.set(x, "dotValue", value.asInstanceOf[js.Any])
    
    inline def setDotValueUndefined: Self = StObject.set(x, "dotValue", js.undefined)
    
    inline def setLegendOptions(value: DotDensityRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setOutline(value: SimpleLineSymbolProperties): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setReferenceScale(value: Double): Self = StObject.set(x, "referenceScale", value.asInstanceOf[js.Any])
    
    inline def setReferenceScaleUndefined: Self = StObject.set(x, "referenceScale", js.undefined)
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setVisualVariables(value: js.Array[VisualVariableProperties]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    inline def setVisualVariablesUndefined: Self = StObject.set(x, "visualVariables", js.undefined)
    
    inline def setVisualVariablesVarargs(value: VisualVariableProperties*): Self = StObject.set(x, "visualVariables", js.Array(value :_*))
  }
}
