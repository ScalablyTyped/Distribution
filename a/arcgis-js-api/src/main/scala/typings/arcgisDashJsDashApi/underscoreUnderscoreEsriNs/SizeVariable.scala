package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeVariable extends VisualVariable {
  /**
    * Only applicable when working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Defines the axis the size visual variable should be applied to when rendering features with an [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html). See the [local scene sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-local/index.html) for an example of this.
    *
    * Possible Value | Description
    * ----------------|-----------
    * width | The diameter of the symbol from east to west.
    * depth | The diameter of the symbol from north to south.
    * height | The height of the symbol.
    * width-and-depth | Applies the size visual variable to both width and depth axes.
    * all | Applies the size visual variable to all axes.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#axis)
    *
    * @default all
    */
  var axis: String = js.native
  /**
    * Deprecated. Use [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) instead**. The only supported expression is `view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#expression)
    */
  var expression: String = js.native
  /**
    * The maximum data value used in the size ramp. Features whose [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) return a value equal to or higher than the value defined in `maxDataValue` will be rendered at the size defined in [maxSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxSize).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue)
    */
  var maxDataValue: Double = js.native
  /**
    * The size used to render a feature containing the maximum data value.
    *   * When setting a number, sizes are expressed in points for all 2D symbols and 3D flat symbol layers; size is expressed in meters for all 3D volumetric symbols.
    *   * String values are only supported for 2D symbols and 3D flat symbol layers. Strings may specify size in either points or pixels (e.g. `minSize: "16pt"`, `minSize: "12px"`).
    *   * When an object is used, the size of features whose data value (defined in [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression)) is greater than or equal to the [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue) for the given view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxSize)
    */
  var maxSize: Double | ScaleDependentStops = js.native
  /**
    * The minimum data value used in the size ramp. Features whose [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) return a value equal to or lower than the value defined in `maxDataValue` will be rendered at the size defined in [minSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minSize).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue)
    */
  var minDataValue: Double = js.native
  /**
    * The size used to render a feature containing the minimum data value.
    *   * When setting a number, sizes are expressed in points for all 2D symbols and 3D flat symbol layers; size is expressed in meters for all 3D volumetric symbols.
    *   * String values are only supported for 2D symbols and 3D flat symbol layers. Strings may specify size in either points or pixels (e.g. `minSize: "16pt"`, `minSize: "12px"`).
    *   * When an object is used, the size of features whose data value (defined in [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression)) is greater than or equal to the [minDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue) for the given view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minSize)
    */
  var minSize: Double | ScaleDependentStops = js.native
  /**
    * The name of the numeric attribute field used to normalize the data in the given [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field). If this field is used, then the values in [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue) and [minDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue) or [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops) should be normalized as percentages or ratios.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#normalizationField)
    */
  var normalizationField: String = js.native
  /**
    * An array of objects that defines the mapping of data values returned from [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) to icon sizes. You must specify 2 - 6 stops. The stops must be listed in ascending order based on the value of the `value` property in each stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops)
    */
  var stops: js.Array[SizeStop] = js.native
  /**
    * This value must be `outline` when scaling polygon outline widths based on the view scale. If scale-dependent icons are desired, then this property should be ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#target)
    */
  var target: String = js.native
  /**
    * The visual variable type. For SizeVariable, this value is always `size`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#type)
    */
  @JSName("type")
  val type_SizeVariable: typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.size = js.native
  /**
    * When setting a size visual variable on a renderer using an [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), this property indicates whether to apply the value defined by the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#height), [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#width), or [depth](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#depth) properties to the corresponding [axis](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#axis) of this visual variable instead of proportionally scaling this axis' value. [View an example](https://developers.arcgis.com/javascript/latest/sample-code/visualization-multivariate-3d/index.html) of this.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#useSymbolValue)
    */
  var useSymbolValue: Boolean = js.native
  /**
    * Specifies how to apply the data value when mapping real-world sizes. See table below for supported values.
    *
    * Value | Description
    * ------|-----------
    * radius | The point data value represents the radius of a circular feature.
    * diameter | The point data value represents the diameter of a circular feature.
    * area | The point data value represents the area of a feature.
    * width | The polyline data value represents the width of a line.
    * distance | The polyline data value represents the distance from the center line (one half of the width).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueRepresentation)
    */
  var valueRepresentation: String = js.native
  /**
    * Indicates the unit of measurement used to interpret the value returned by [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression). For 3D volumetric symbols the default is `meters`. This property should not be used if the data value represents a thematic quantity (e.g. traffic count, census data, etc.).  **Possible Values:** unknown | inches | feet | yards | miles | nautical-miles | millimeters | centimeters | decimeters | meters | kilometers | decimal-degrees
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueUnit)
    */
  var valueUnit: String = js.native
}

@JSGlobal("__esri.SizeVariable")
@js.native
/**
  * The size visual variable defines the size of individual features in a layer based on a numeric (often thematic) value. This value comes from one of the following:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html)
  */
class SizeVariableCls () extends SizeVariable {
  def this(properties: SizeVariableProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

