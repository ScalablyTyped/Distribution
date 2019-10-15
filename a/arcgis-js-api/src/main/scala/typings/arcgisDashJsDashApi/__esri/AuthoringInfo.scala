package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
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
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.manual
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.millimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.quantile
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthoringInfo
  extends Accessor
     with JSONSupport {
  /**
    * Indicates which classification method was used if a classed color or classed size renderer was generated using one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#classificationMethod)
    */
  var classificationMethod: `equal-interval` | manual | `natural-breaks` | quantile | `standard-deviation` = js.native
  /**
    * Indicates the color ramp was used to create the symbols for Unique Value or Class Breaks renderer for Imagery Layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#colorRamp)
    */
  var colorRamp: ColorRamp = js.native
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html) along with [field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2). In the default visualization, the values of this field are rendered along the vertical axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var field1: AuthoringInfoField1 = js.native
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html) along with [field1](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1). In the default visualization, the values of this field are rendered along the horizontal axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var field2: AuthoringInfoField2 = js.native
  /**
    * An array of string values representing field names used for creating a [predominance renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#fields)
    */
  var fields: js.Array[String] = js.native
  /**
    * The focus of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html). This determines the orientation of the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#focus)
    */
  var focus: String = js.native
  /**
    * **Only applicable to renderer used in web scenes.** Indicates the unit used in real-world sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#lengthUnit)
    */
  var lengthUnit: inches | feet | yards | miles | `nautical-miles` | millimeters | centimeters | decimeters | meters | kilometers | `decimal-degrees` = js.native
  /**
    * Indicates the value of the upper handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#maxSliderValue)
    */
  var maxSliderValue: Double = js.native
  /**
    * Indicates the value of the lower handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#minSliderValue)
    */
  var minSliderValue: Double = js.native
  /**
    * The number of classes used to classify each field of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html). This determines the number of categories in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#numClasses)
    */
  var numClasses: Double = js.native
  /**
    * Indicates the standard deviation interval for each stop in a classed color or classed size renderer that was generated using the `standard-deviation` classification method.  **Possible Values:** 0.25 | 0.33 | 0.5 | 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#standardDeviationInterval)
    */
  var standardDeviationInterval: Double = js.native
  /**
    * Indicates the renderer type generated from one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#type)
    */
  var `type`: `class-breaks-size` | `class-breaks-color` | `classed-color` | `classed-size` | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.predominance | typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.relationship | `univariate-color-size` = js.native
  /**
    * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#visualVariables)
    */
  var visualVariables: js.Array[AuthoringInfoVisualVariable] = js.native
}

@JSGlobal("__esri.AuthoringInfo")
@js.native
object AuthoringInfo extends TopLevel[AuthoringInfoConstructor]

