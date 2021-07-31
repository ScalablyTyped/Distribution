package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportingWidgetDefaults
  extends StObject
     with Object {
  
  /**
    * An object containing properties specific for customizing the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var featureForm: js.UndefOr[SupportingWidgetDefaultsFeatureForm] = js.undefined
  
  /**
    * An object containing properties specific for customizing the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var featureTemplates: js.UndefOr[SupportingWidgetDefaultsFeatureTemplates] = js.undefined
  
  /**
    * An object containing properties specific for customizng the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var sketch: js.UndefOr[SupportingWidgetDefaultsSketch] = js.undefined
}
object SupportingWidgetDefaults {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SupportingWidgetDefaults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SupportingWidgetDefaults]
  }
  
  @scala.inline
  implicit class SupportingWidgetDefaultsMutableBuilder[Self <: SupportingWidgetDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatureForm(value: SupportingWidgetDefaultsFeatureForm): Self = StObject.set(x, "featureForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureFormUndefined: Self = StObject.set(x, "featureForm", js.undefined)
    
    @scala.inline
    def setFeatureTemplates(value: SupportingWidgetDefaultsFeatureTemplates): Self = StObject.set(x, "featureTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTemplatesUndefined: Self = StObject.set(x, "featureTemplates", js.undefined)
    
    @scala.inline
    def setSketch(value: SupportingWidgetDefaultsSketch): Self = StObject.set(x, "sketch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSketchUndefined: Self = StObject.set(x, "sketch", js.undefined)
  }
}
