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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var axis: js.UndefOr[width | depth | height | `width-and-depth` | all] = js.native
  /**
    * The only supported expression is `view.scale`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#expression)
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * The maximum data value used in the size ramp. Features whose [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) return a value equal to or higher than the value defined in `maxDataValue` will be rendered at the size defined in [maxSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxSize).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue)
    */
  var maxDataValue: js.UndefOr[Double] = js.native
  /**
    * The size used to render a feature containing the maximum data value.
    *   * When setting a number, sizes are expressed in points for all 2D symbols and 3D flat symbol layers; size is expressed in meters for all 3D volumetric symbols.
    *   * String values are only supported for 2D symbols and 3D flat symbol layers. Strings may specify size in either points or pixels (e.g. `minSize: "16pt"`, `minSize: "12px"`).
    *   * When an object is used, the size of features whose data value (defined in [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression)) is greater than or equal to the [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue) for the given view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxSize)
    */
  var maxSize: js.UndefOr[Double | ScaleDependentStops | String] = js.native
  /**
    * The minimum data value used in the size ramp. Features whose [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) return a value equal to or lower than the value defined in `maxDataValue` will be rendered at the size defined in [minSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minSize).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue)
    */
  var minDataValue: js.UndefOr[Double] = js.native
  /**
    * The size used to render a feature containing the minimum data value.
    *   * When setting a number, sizes are expressed in points for all 2D symbols and 3D flat symbol layers; size is expressed in meters for all 3D volumetric symbols.
    *   * String values are only supported for 2D symbols and 3D flat symbol layers. Strings may specify size in either points or pixels (e.g. `minSize: "16pt"`, `minSize: "12px"`).
    *   * When an object is used, the size of features whose data value (defined in [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression)) is greater than or equal to the [minDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue) for the given view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minSize)
    */
  var minSize: js.UndefOr[Double | ScaleDependentStops | String] = js.native
  /**
    * The name of the numeric attribute field used to normalize the data in the given [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field). If this field is used, then the values in [maxDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#maxDataValue) and [minDataValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#minDataValue) or [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops) should be normalized as percentages or ratios.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#normalizationField)
    */
  var normalizationField: js.UndefOr[String] = js.native
  /**
    * An array of objects that defines the mapping of data values returned from [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression) to icon sizes. You must specify 2 - 6 stops. The stops must be listed in ascending order based on the value of the `value` property in each stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#stops)
    */
  var stops: js.UndefOr[js.Array[SizeStopProperties]] = js.native
  /**
    * This value must be `outline` when scaling polygon outline widths based on the view scale. If scale-dependent icons are desired, then this property should be ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#target)
    */
  var target: js.UndefOr[String] = js.native
  /**
    * When setting a size visual variable on a renderer using an [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), this property indicates whether to apply the value defined by the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#height), [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#width), or [depth](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#depth) properties to the corresponding [axis](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#axis) of this visual variable instead of proportionally scaling this axis' value. [View an example](https://developers.arcgis.com/javascript/latest/sample-code/visualization-multivariate-3d/index.html) of this.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#useSymbolValue)
    */
  var useSymbolValue: js.UndefOr[Boolean] = js.native
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
  var valueRepresentation: js.UndefOr[radius | diameter | area | width | distance] = js.native
  /**
    * Indicates the unit of measurement used to interpret the value returned by [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueExpression). For 3D volumetric symbols the default is `meters`. This property should not be used if the data value represents a thematic quantity (e.g. traffic count, census data, etc.).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#valueUnit)
    */
  var valueUnit: js.UndefOr[
    unknown | inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees`
  ] = js.native
}

object SizeVariableProperties {
  @scala.inline
  def apply(): SizeVariableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeVariableProperties]
  }
  @scala.inline
  implicit class SizeVariablePropertiesOps[Self <: SizeVariableProperties] (val x: Self) extends AnyVal {
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
    def setAxis(value: width | depth | height | `width-and-depth` | all): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setMaxDataValue(value: Double): Self = this.set("maxDataValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDataValue: Self = this.set("maxDataValue", js.undefined)
    @scala.inline
    def setMaxSize(value: Double | ScaleDependentStops | String): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMinDataValue(value: Double): Self = this.set("minDataValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDataValue: Self = this.set("minDataValue", js.undefined)
    @scala.inline
    def setMinSize(value: Double | ScaleDependentStops | String): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setNormalizationField(value: String): Self = this.set("normalizationField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizationField: Self = this.set("normalizationField", js.undefined)
    @scala.inline
    def setStopsVarargs(value: SizeStopProperties*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[SizeStopProperties]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setUseSymbolValue(value: Boolean): Self = this.set("useSymbolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSymbolValue: Self = this.set("useSymbolValue", js.undefined)
    @scala.inline
    def setValueRepresentation(value: radius | diameter | area | width | distance): Self = this.set("valueRepresentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueRepresentation: Self = this.set("valueRepresentation", js.undefined)
    @scala.inline
    def setValueUnit(
      value: unknown | inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees`
    ): Self = this.set("valueUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueUnit: Self = this.set("valueUnit", js.undefined)
  }
  
}

