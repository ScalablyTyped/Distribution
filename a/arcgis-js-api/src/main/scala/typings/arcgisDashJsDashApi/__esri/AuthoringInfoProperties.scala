package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`class-breaks-color`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`class-breaks-size`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`classed-color`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`classed-size`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`decimal-degrees`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`equal-interval`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`natural-breaks`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`standard-deviation`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`univariate-color-size`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.centimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.decimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.manual
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.millimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.quantile
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthoringInfoProperties extends js.Object {
  /**
    * Indicates which classification method was used if a classed color or classed size renderer was generated using one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#classificationMethod)
    */
  var classificationMethod: js.UndefOr[`equal-interval` | manual | `natural-breaks` | quantile | `standard-deviation`] = js.undefined
  /**
    * Indicates the color ramp was used to create the symbols for Unique Value or Class Breaks renderer for Imagery Layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#colorRamp)
    */
  var colorRamp: js.UndefOr[ColorRampProperties] = js.undefined
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html) along with [field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2). In the default visualization, the values of this field are rendered along the vertical axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var field1: js.UndefOr[AuthoringInfoField1] = js.undefined
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html) along with [field1](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1). In the default visualization, the values of this field are rendered along the horizontal axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var field2: js.UndefOr[AuthoringInfoField2] = js.undefined
  /**
    * An array of string values representing field names used for creating a [predominance renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#fields)
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The focus of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html). This determines the orientation of the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#focus)
    */
  var focus: js.UndefOr[String] = js.undefined
  /**
    * **Only applicable to renderer used in web scenes.** Indicates the unit used in real-world sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[
    inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees`
  ] = js.undefined
  /**
    * Indicates the value of the upper handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#maxSliderValue)
    */
  var maxSliderValue: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the value of the lower handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#minSliderValue)
    */
  var minSliderValue: js.UndefOr[Double] = js.undefined
  /**
    * The number of classes used to classify each field of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html). This determines the number of categories in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#numClasses)
    */
  var numClasses: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the standard deviation interval for each stop in a classed color or classed size renderer that was generated using the `standard-deviation` classification method.  **Possible Values:** 0.25 | 0.33 | 0.5 | 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#standardDeviationInterval)
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the renderer type generated from one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#type)
    */
  var `type`: js.UndefOr[
    `class-breaks-size` | `class-breaks-color` | `classed-color` | `classed-size` | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.predominance | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.relationship | `univariate-color-size`
  ] = js.undefined
  /**
    * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[AuthoringInfoVisualVariableProperties]] = js.undefined
}

object AuthoringInfoProperties {
  @scala.inline
  def apply(
    classificationMethod: `equal-interval` | manual | `natural-breaks` | quantile | `standard-deviation` = null,
    colorRamp: ColorRampProperties = null,
    field1: AuthoringInfoField1 = null,
    field2: AuthoringInfoField2 = null,
    fields: js.Array[String] = null,
    focus: String = null,
    lengthUnit: inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees` = null,
    maxSliderValue: Int | Double = null,
    minSliderValue: Int | Double = null,
    numClasses: Int | Double = null,
    standardDeviationInterval: Int | Double = null,
    `type`: `class-breaks-size` | `class-breaks-color` | `classed-color` | `classed-size` | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.predominance | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.relationship | `univariate-color-size` = null,
    visualVariables: js.Array[AuthoringInfoVisualVariableProperties] = null
  ): AuthoringInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (classificationMethod != null) __obj.updateDynamic("classificationMethod")(classificationMethod.asInstanceOf[js.Any])
    if (colorRamp != null) __obj.updateDynamic("colorRamp")(colorRamp.asInstanceOf[js.Any])
    if (field1 != null) __obj.updateDynamic("field1")(field1.asInstanceOf[js.Any])
    if (field2 != null) __obj.updateDynamic("field2")(field2.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (lengthUnit != null) __obj.updateDynamic("lengthUnit")(lengthUnit.asInstanceOf[js.Any])
    if (maxSliderValue != null) __obj.updateDynamic("maxSliderValue")(maxSliderValue.asInstanceOf[js.Any])
    if (minSliderValue != null) __obj.updateDynamic("minSliderValue")(minSliderValue.asInstanceOf[js.Any])
    if (numClasses != null) __obj.updateDynamic("numClasses")(numClasses.asInstanceOf[js.Any])
    if (standardDeviationInterval != null) __obj.updateDynamic("standardDeviationInterval")(standardDeviationInterval.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visualVariables != null) __obj.updateDynamic("visualVariables")(visualVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthoringInfoProperties]
  }
}

