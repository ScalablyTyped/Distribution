package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`width-and-depth`
import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.area
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.depth
import typings.arcgisJsApi.arcgisJsApiStrings.diameter
import typings.arcgisJsApi.arcgisJsApiStrings.distance
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.height
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.radius
import typings.arcgisJsApi.arcgisJsApiStrings.unknown
import typings.arcgisJsApi.arcgisJsApiStrings.width
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeVariable
  extends StObject
     with VisualVariable {
  
  /**
  		 * Only applicable when working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * @default all
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#axis)
  		 */
  var axis: width | depth | height | `width-and-depth` | all = js.native
  
  /**
  		 * Modifies the SizeVariable in place by flipping the sizes in the [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#flipSizes)
  		 */
  def flipSizes(): scala.Unit = js.native
  
  /**
  		 * The maximum data value used in the size ramp.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue)
  		 */
  var maxDataValue: Double = js.native
  
  /**
  		 * The size used to render a feature containing the maximum data value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxSize)
  		 */
  var maxSize: Double | ScaleDependentStops = js.native
  
  /**
  		 * The minimum data value used in the size ramp.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue)
  		 */
  var minDataValue: Double = js.native
  
  /**
  		 * The size used to render a feature containing the minimum data value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minSize)
  		 */
  var minSize: Double | ScaleDependentStops = js.native
  
  /**
  		 * The name of the numeric attribute field used to normalize the data in the given [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#normalizationField)
  		 */
  var normalizationField: String = js.native
  
  /**
  		 * An array of objects that defines the mapping of data values returned from [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) to icon sizes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops)
  		 */
  var stops: js.Array[SizeStop] = js.native
  
  /**
  		 * This value must be `outline` when scaling polygon outline widths based on the view scale.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#target)
  		 */
  var target: String = js.native
  
  /**
  		 * The visual variable type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#type)
  		 */
  @JSName("type")
  val type_SizeVariable: typings.arcgisJsApi.arcgisJsApiStrings.size = js.native
  
  /**
  		 * When setting a size visual variable on a renderer using an [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), this property indicates whether to apply the value defined by the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#height), [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#width), or [depth](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#depth) properties to the corresponding [axis](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#axis) of this visual variable instead of proportionally scaling this axis' value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#useSymbolValue)
  		 */
  var useSymbolValue: Boolean = js.native
  
  /**
  		 * Specifies how to apply the data value when mapping real-world sizes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueRepresentation)
  		 */
  var valueRepresentation: radius | diameter | area | width | distance = js.native
  
  /**
  		 * Indicates the unit of measurement used to interpret the value returned by [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueUnit)
  		 */
  var valueUnit: unknown | inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees` = js.native
}
