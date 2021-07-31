package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`class-breaks-color`
import typings.arcgisJsApi.arcgisJsApiStrings.`class-breaks-size`
import typings.arcgisJsApi.arcgisJsApiStrings.`classed-color`
import typings.arcgisJsApi.arcgisJsApiStrings.`classed-size`
import typings.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typings.arcgisJsApi.arcgisJsApiStrings.`equal-interval`
import typings.arcgisJsApi.arcgisJsApiStrings.`natural-breaks`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typings.arcgisJsApi.arcgisJsApiStrings.`univariate-color-size`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.manual
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.quantile
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthoringInfo
  extends StObject
     with Accessor
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
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html) along with [field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var field1: AuthoringInfoField1 = js.native
  
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html) along with [field1](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var field2: AuthoringInfoField2 = js.native
  
  /**
    * An array of string values representing field names used for creating a [predominance renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#fields)
    */
  var fields: js.Array[String] = js.native
  
  /**
    * The focus of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#focus)
    */
  var focus: String = js.native
  
  /**
    * **Only applicable to renderer used in web scenes.** Indicates the unit used in real-world sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#lengthUnit)
    */
  var lengthUnit: inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees` = js.native
  
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
    * The number of classes used to classify each field of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#numClasses)
    */
  var numClasses: Double = js.native
  
  /**
    * Indicates the standard deviation interval for each stop in a classed color or classed size renderer that was generated using the `standard-deviation` classification method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#standardDeviationInterval)
    */
  var standardDeviationInterval: Double = js.native
  
  /**
    * Indicates the renderer type generated from one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#type)
    */
  var `type`: `class-breaks-size` | `class-breaks-color` | `classed-color` | `classed-size` | typings.arcgisJsApi.arcgisJsApiStrings.predominance | typings.arcgisJsApi.arcgisJsApiStrings.relationship | `univariate-color-size` = js.native
  
  /**
    * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#visualVariables)
    */
  var visualVariables: js.Array[AuthoringInfoVisualVariable] = js.native
}
