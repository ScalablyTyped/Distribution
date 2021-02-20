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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthoringInfoProperties extends StObject {
  
  /**
    * Indicates which classification method was used if a classed color or classed size renderer was generated using one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#classificationMethod)
    */
  var classificationMethod: js.UndefOr[`equal-interval` | manual | `natural-breaks` | quantile | `standard-deviation`] = js.native
  
  /**
    * Indicates the color ramp was used to create the symbols for Unique Value or Class Breaks renderer for Imagery Layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#colorRamp)
    */
  var colorRamp: js.UndefOr[ColorRampProperties] = js.native
  
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html) along with [field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var field1: js.UndefOr[AuthoringInfoField1] = js.native
  
  /**
    * A numeric field used for generating a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html) along with [field1](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field2)
    */
  var field2: js.UndefOr[AuthoringInfoField2] = js.native
  
  /**
    * An array of string values representing field names used for creating a [predominance renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#fields)
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The focus of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#focus)
    */
  var focus: js.UndefOr[String] = js.native
  
  /**
    * **Only applicable to renderer used in web scenes.** Indicates the unit used in real-world sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[
    inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees`
  ] = js.native
  
  /**
    * Indicates the value of the upper handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#maxSliderValue)
    */
  var maxSliderValue: js.UndefOr[Double] = js.native
  
  /**
    * Indicates the value of the lower handle if a slider was used to generate the dot value for dot density renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#minSliderValue)
    */
  var minSliderValue: js.UndefOr[Double] = js.native
  
  /**
    * The number of classes used to classify each field of a [relationship renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#numClasses)
    */
  var numClasses: js.UndefOr[Double] = js.native
  
  /**
    * Indicates the standard deviation interval for each stop in a classed color or classed size renderer that was generated using the `standard-deviation` classification method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#standardDeviationInterval)
    */
  var standardDeviationInterval: js.UndefOr[Double] = js.native
  
  /**
    * Indicates the renderer type generated from one of the Smart Mapping functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#type)
    */
  var `type`: js.UndefOr[
    `class-breaks-size` | `class-breaks-color` | `classed-color` | `classed-size` | typings.arcgisJsApi.arcgisJsApiStrings.predominance | typings.arcgisJsApi.arcgisJsApiStrings.relationship | `univariate-color-size`
  ] = js.native
  
  /**
    * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[AuthoringInfoVisualVariableProperties]] = js.native
}
object AuthoringInfoProperties {
  
  @scala.inline
  def apply(): AuthoringInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthoringInfoProperties]
  }
  
  @scala.inline
  implicit class AuthoringInfoPropertiesMutableBuilder[Self <: AuthoringInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassificationMethod(value: `equal-interval` | manual | `natural-breaks` | quantile | `standard-deviation`): Self = StObject.set(x, "classificationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationMethodUndefined: Self = StObject.set(x, "classificationMethod", js.undefined)
    
    @scala.inline
    def setColorRamp(value: ColorRampProperties): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    @scala.inline
    def setField1(value: AuthoringInfoField1): Self = StObject.set(x, "field1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField1Undefined: Self = StObject.set(x, "field1", js.undefined)
    
    @scala.inline
    def setField2(value: AuthoringInfoField2): Self = StObject.set(x, "field2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField2Undefined: Self = StObject.set(x, "field2", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setLengthUnit(
      value: inches | feet_ | yards | miles_ | `nautical-miles` | millimeters | centimeters | decimeters | meters_ | kilometers_ | `decimal-degrees`
    ): Self = StObject.set(x, "lengthUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUnitUndefined: Self = StObject.set(x, "lengthUnit", js.undefined)
    
    @scala.inline
    def setMaxSliderValue(value: Double): Self = StObject.set(x, "maxSliderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSliderValueUndefined: Self = StObject.set(x, "maxSliderValue", js.undefined)
    
    @scala.inline
    def setMinSliderValue(value: Double): Self = StObject.set(x, "minSliderValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSliderValueUndefined: Self = StObject.set(x, "minSliderValue", js.undefined)
    
    @scala.inline
    def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumClassesUndefined: Self = StObject.set(x, "numClasses", js.undefined)
    
    @scala.inline
    def setStandardDeviationInterval(value: Double): Self = StObject.set(x, "standardDeviationInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDeviationIntervalUndefined: Self = StObject.set(x, "standardDeviationInterval", js.undefined)
    
    @scala.inline
    def setType(
      value: `class-breaks-size` | `class-breaks-color` | `classed-color` | `classed-size` | typings.arcgisJsApi.arcgisJsApiStrings.predominance | typings.arcgisJsApi.arcgisJsApiStrings.relationship | `univariate-color-size`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisualVariables(value: js.Array[AuthoringInfoVisualVariableProperties]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualVariablesUndefined: Self = StObject.set(x, "visualVariables", js.undefined)
    
    @scala.inline
    def setVisualVariablesVarargs(value: AuthoringInfoVisualVariableProperties*): Self = StObject.set(x, "visualVariables", js.Array(value :_*))
  }
}
