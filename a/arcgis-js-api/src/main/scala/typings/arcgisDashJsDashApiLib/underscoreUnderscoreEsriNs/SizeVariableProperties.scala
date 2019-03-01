package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeVariableProperties extends VisualVariableProperties {
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
  var axis: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Deprecated. Use [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) instead**. The only supported expression is `view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#expression)
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum data value used in the size ramp. Features whose [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) return a value equal to or higher than the value defined in `maxDataValue` will be rendered at the size defined in [maxSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxSize).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue)
    */
  var maxDataValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The size used to render a feature containing the maximum data value.
    *   * When setting a number, sizes are expressed in points for all 2D symbols and 3D flat symbol layers; size is expressed in meters for all 3D volumetric symbols.
    *   * String values are only supported for 2D symbols and 3D flat symbol layers. Strings may specify size in either points or pixels (e.g. `minSize: "16pt"`, `minSize: "12px"`).
    *   * When an object is used, the size of features whose data value (defined in [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression)) is greater than or equal to the [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue) for the given view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxSize)
    */
  var maxSize: js.UndefOr[scala.Double | ScaleDependentStops | java.lang.String] = js.undefined
  /**
    * The minimum data value used in the size ramp. Features whose [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) return a value equal to or lower than the value defined in `maxDataValue` will be rendered at the size defined in [minSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minSize).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue)
    */
  var minDataValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The size used to render a feature containing the minimum data value.
    *   * When setting a number, sizes are expressed in points for all 2D symbols and 3D flat symbol layers; size is expressed in meters for all 3D volumetric symbols.
    *   * String values are only supported for 2D symbols and 3D flat symbol layers. Strings may specify size in either points or pixels (e.g. `minSize: "16pt"`, `minSize: "12px"`).
    *   * When an object is used, the size of features whose data value (defined in [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression)) is greater than or equal to the [minDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue) for the given view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minSize)
    */
  var minSize: js.UndefOr[scala.Double | ScaleDependentStops | java.lang.String] = js.undefined
  /**
    * The name of the numeric attribute field used to normalize the data in the given [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field). If this field is used, then the values in [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue) and [minDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue) or [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops) should be normalized as percentages or ratios.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#normalizationField)
    */
  var normalizationField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of objects that defines the mapping of data values returned from [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) to icon sizes. You must specify 2 - 6 stops. The stops must be listed in ascending order based on the value of the `value` property in each stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops)
    */
  var stops: js.UndefOr[js.Array[SizeStopProperties]] = js.undefined
  /**
    * This value must be `outline` when scaling polygon outline widths based on the view scale. If scale-dependent icons are desired, then this property should be ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#target)
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When setting a size visual variable on a renderer using an [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), this property indicates whether to apply the value defined by the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#height), [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#width), or [depth](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#depth) properties to the corresponding [axis](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#axis) of this visual variable instead of proportionally scaling this axis' value. [View an example](https://developers.arcgis.com/javascript/latest/sample-code/visualization-multivariate-3d/index.html) of this.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#useSymbolValue)
    */
  var useSymbolValue: js.UndefOr[scala.Boolean] = js.undefined
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
  var valueRepresentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates the unit of measurement used to interpret the value returned by [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression). For 3D volumetric symbols the default is `meters`. This property should not be used if the data value represents a thematic quantity (e.g. traffic count, census data, etc.).  **Possible Values:** unknown | inches | feet | yards | miles | nautical-miles | millimeters | centimeters | decimeters | meters | kilometers | decimal-degrees
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueUnit)
    */
  var valueUnit: js.UndefOr[java.lang.String] = js.undefined
}

object SizeVariableProperties {
  @scala.inline
  def apply(
    axis: java.lang.String = null,
    expression: java.lang.String = null,
    field: java.lang.String = null,
    index: java.lang.String | scala.Double = null,
    legendOptions: VisualVariableLegendOptions = null,
    maxDataValue: scala.Int | scala.Double = null,
    maxSize: scala.Double | ScaleDependentStops | java.lang.String = null,
    minDataValue: scala.Int | scala.Double = null,
    minSize: scala.Double | ScaleDependentStops | java.lang.String = null,
    normalizationField: java.lang.String = null,
    stops: js.Array[SizeStopProperties] = null,
    target: java.lang.String = null,
    useSymbolValue: js.UndefOr[scala.Boolean] = js.undefined,
    valueExpression: java.lang.String = null,
    valueExpressionTitle: java.lang.String = null,
    valueRepresentation: java.lang.String = null,
    valueUnit: java.lang.String = null
  ): SizeVariableProperties = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (field != null) __obj.updateDynamic("field")(field)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (maxDataValue != null) __obj.updateDynamic("maxDataValue")(maxDataValue.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minDataValue != null) __obj.updateDynamic("minDataValue")(minDataValue.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField)
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (target != null) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(useSymbolValue)) __obj.updateDynamic("useSymbolValue")(useSymbolValue)
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression)
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle)
    if (valueRepresentation != null) __obj.updateDynamic("valueRepresentation")(valueRepresentation)
    if (valueUnit != null) __obj.updateDynamic("valueUnit")(valueUnit)
    __obj.asInstanceOf[SizeVariableProperties]
  }
}

