package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportingWidgetDefaultsFeatureForm
  extends StObject
     with Object {
  
  /**
    * An array of [FieldConfig](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html) objects to use within the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfig]] = js.undefined
  
  /**
    * String indicating the [groupDisplay](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#groupDisplay) and how they will be displayed to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var groupDisplay: js.UndefOr[String] = js.undefined
}
object SupportingWidgetDefaultsFeatureForm {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SupportingWidgetDefaultsFeatureForm = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SupportingWidgetDefaultsFeatureForm]
  }
  
  extension [Self <: SupportingWidgetDefaultsFeatureForm](x: Self) {
    
    inline def setFieldConfig(value: js.Array[FieldConfig]): Self = StObject.set(x, "fieldConfig", value.asInstanceOf[js.Any])
    
    inline def setFieldConfigUndefined: Self = StObject.set(x, "fieldConfig", js.undefined)
    
    inline def setFieldConfigVarargs(value: FieldConfig*): Self = StObject.set(x, "fieldConfig", js.Array(value :_*))
    
    inline def setGroupDisplay(value: String): Self = StObject.set(x, "groupDisplay", value.asInstanceOf[js.Any])
    
    inline def setGroupDisplayUndefined: Self = StObject.set(x, "groupDisplay", js.undefined)
  }
}
