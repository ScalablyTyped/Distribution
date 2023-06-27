package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartRendererProperties
  extends StObject
     with RendererProperties {
  
  /**
  		 * Defines the variable(s) to include in the pie charts.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#attributes)
  		 */
  var attributes: js.UndefOr[js.Array[AttributeColorInfoProperties]] = js.undefined
  
  /**
  		 * The symbol used to render polygons behind the pie symbols.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#backgroundFillSymbol)
  		 */
  var backgroundFillSymbol: js.UndefOr[SimpleFillSymbolProperties] = js.undefined
  
  /**
  		 * The color used to visualize features whose [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#attributes) all have null or empty values.
  		 *
  		 * @default new Color([0, 0, 0, 0])
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#defaultColor)
  		 */
  var defaultColor: js.UndefOr[Color_] = js.undefined
  
  /**
  		 * Describes the [defaultColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#defaultColor) in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#defaultLabel)
  		 */
  var defaultLabel: js.UndefOr[String] = js.undefined
  
  /**
  		 * Use this property to create a donut chart.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#holePercentage)
  		 */
  var holePercentage: js.UndefOr[Double] = js.undefined
  
  /**
  		 * An object providing options for describing the renderer in the Legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#legendOptions)
  		 */
  var legendOptions: js.UndefOr[PieChartRendererLegendOptions] = js.undefined
  
  /**
  		 * Defines the rules for how to aggregate small categories to a generic "others" category.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#othersCategory)
  		 */
  var othersCategory: js.UndefOr[PieChartRendererOthersCategory] = js.undefined
  
  /**
  		 * Defines the outline of the pie chart.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#outline)
  		 */
  var outline: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  
  /**
  		 * Defines the size of each pie chart in points.
  		 *
  		 * @default 12
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#size)
  		 */
  var size: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * An array of [Size Visual Variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#visualVariables)
  		 */
  var visualVariables: js.UndefOr[js.Array[SizeVariableProperties]] = js.undefined
}
object PieChartRendererProperties {
  
  inline def apply(): PieChartRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartRendererProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieChartRendererProperties] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[AttributeColorInfoProperties]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: AttributeColorInfoProperties*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setBackgroundFillSymbol(value: SimpleFillSymbolProperties): Self = StObject.set(x, "backgroundFillSymbol", value.asInstanceOf[js.Any])
    
    inline def setBackgroundFillSymbolUndefined: Self = StObject.set(x, "backgroundFillSymbol", js.undefined)
    
    inline def setDefaultColor(value: Color_): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
    
    inline def setDefaultLabel(value: String): Self = StObject.set(x, "defaultLabel", value.asInstanceOf[js.Any])
    
    inline def setDefaultLabelUndefined: Self = StObject.set(x, "defaultLabel", js.undefined)
    
    inline def setHolePercentage(value: Double): Self = StObject.set(x, "holePercentage", value.asInstanceOf[js.Any])
    
    inline def setHolePercentageUndefined: Self = StObject.set(x, "holePercentage", js.undefined)
    
    inline def setLegendOptions(value: PieChartRendererLegendOptions): Self = StObject.set(x, "legendOptions", value.asInstanceOf[js.Any])
    
    inline def setLegendOptionsUndefined: Self = StObject.set(x, "legendOptions", js.undefined)
    
    inline def setOthersCategory(value: PieChartRendererOthersCategory): Self = StObject.set(x, "othersCategory", value.asInstanceOf[js.Any])
    
    inline def setOthersCategoryUndefined: Self = StObject.set(x, "othersCategory", js.undefined)
    
    inline def setOutline(value: SimpleLineSymbolProperties): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVisualVariables(value: js.Array[SizeVariableProperties]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    inline def setVisualVariablesUndefined: Self = StObject.set(x, "visualVariables", js.undefined)
    
    inline def setVisualVariablesVarargs(value: SizeVariableProperties*): Self = StObject.set(x, "visualVariables", js.Array(value*))
  }
}
