package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.sequential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureFormProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * The description of the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The associated feature containing the editable attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#feature)
    */
  var feature: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
    * Array of individual or grouped field configuration objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#fieldConfig)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfigProperties | FieldGroupConfigProperties]] = js.undefined
  
  /**
    * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used for the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate)
    */
  var formTemplate: js.UndefOr[FormTemplateProperties] = js.undefined
  
  /**
    * Defines how groups will be displayed to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#groupDisplay)
    */
  var groupDisplay: js.UndefOr[all | sequential] = js.undefined
  
  /**
    * Layer containing the editable feature attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.undefined
  
  /**
    * The title of the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureFormViewModelProperties] = js.undefined
}
object FeatureFormProperties {
  
  @scala.inline
  def apply(): FeatureFormProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureFormProperties]
  }
  
  @scala.inline
  implicit class FeatureFormPropertiesMutableBuilder[Self <: FeatureFormProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFeature(value: GraphicProperties): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    @scala.inline
    def setFieldConfig(value: js.Array[FieldConfigProperties | FieldGroupConfigProperties]): Self = StObject.set(x, "fieldConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldConfigUndefined: Self = StObject.set(x, "fieldConfig", js.undefined)
    
    @scala.inline
    def setFieldConfigVarargs(value: (FieldConfigProperties | FieldGroupConfigProperties)*): Self = StObject.set(x, "fieldConfig", js.Array(value :_*))
    
    @scala.inline
    def setFormTemplate(value: FormTemplateProperties): Self = StObject.set(x, "formTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormTemplateUndefined: Self = StObject.set(x, "formTemplate", js.undefined)
    
    @scala.inline
    def setGroupDisplay(value: all | sequential): Self = StObject.set(x, "groupDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDisplayUndefined: Self = StObject.set(x, "groupDisplay", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setViewModel(value: FeatureFormViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
