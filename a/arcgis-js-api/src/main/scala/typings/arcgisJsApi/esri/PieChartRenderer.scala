package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`pie-chart`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChartRenderer
  extends StObject
     with Renderer
     with RendererWithVisualVariables
     with typings.arcgisJsApi.esri.renderers.RendererWithVisualVariables {
  
  /**
  		 * Defines the variable(s) to include in the pie charts.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#attributes)
  		 */
  var attributes: js.Array[AttributeColorInfo] = js.native
  
  /**
  		 * The symbol used to render polygons behind the pie symbols.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#backgroundFillSymbol)
  		 */
  var backgroundFillSymbol: SimpleFillSymbol = js.native
  
  /**
  		 * The color used to visualize features whose [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#attributes) all have null or empty values.
  		 *
  		 * @default new Color([0, 0, 0, 0])
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#defaultColor)
  		 */
  var defaultColor: Color_ = js.native
  
  /**
  		 * Describes the [defaultColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#defaultColor) in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#defaultLabel)
  		 */
  var defaultLabel: String = js.native
  
  /**
  		 * Use this property to create a donut chart.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#holePercentage)
  		 */
  var holePercentage: Double = js.native
  
  /**
  		 * An object providing options for describing the renderer in the Legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#legendOptions)
  		 */
  var legendOptions: PieChartRendererLegendOptions = js.native
  
  /**
  		 * Defines the rules for how to aggregate small categories to a generic "others" category.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#othersCategory)
  		 */
  var othersCategory: PieChartRendererOthersCategory = js.native
  
  /**
  		 * Defines the outline of the pie chart.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#outline)
  		 */
  var outline: SimpleLineSymbol = js.native
  
  /**
  		 * Defines the size of each pie chart in points.
  		 *
  		 * @default 12
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#size)
  		 */
  var size: Double = js.native
  
  /**
  		 * The type of renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#type)
  		 */
  @JSName("type")
  val type_PieChartRenderer: `pie-chart` = js.native
  
  /**
  		 * An array of [Size Visual Variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#visualVariables)
  		 */
  var visualVariables: js.Array[SizeVariable] = js.native
}
