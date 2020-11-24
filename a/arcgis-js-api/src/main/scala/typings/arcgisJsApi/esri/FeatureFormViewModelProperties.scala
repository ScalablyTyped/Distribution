package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFormViewModelProperties extends js.Object {
  
  /**
    * The description of the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#description)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The associated feature containing the editable attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#feature)
    */
  var feature: js.UndefOr[GraphicProperties] = js.native
  
  /**
    * Array of individual or grouped field configuration objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#fieldConfig)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfigProperties | FieldGroupConfigProperties]] = js.native
  
  /**
    * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used for the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#formTemplate)
    */
  var formTemplate: js.UndefOr[FormTemplateProperties] = js.native
  
  /**
    * Layer containing the editable feature attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.native
  
  /**
    * The title of the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#title)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether all input fields are valid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#valid)
    */
  var valid: js.UndefOr[Boolean] = js.native
}
object FeatureFormViewModelProperties {
  
  @scala.inline
  def apply(): FeatureFormViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureFormViewModelProperties]
  }
  
  @scala.inline
  implicit class FeatureFormViewModelPropertiesOps[Self <: FeatureFormViewModelProperties] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFeature(value: GraphicProperties): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    
    @scala.inline
    def setFieldConfigVarargs(value: (FieldConfigProperties | FieldGroupConfigProperties)*): Self = this.set("fieldConfig", js.Array(value :_*))
    
    @scala.inline
    def setFieldConfig(value: js.Array[FieldConfigProperties | FieldGroupConfigProperties]): Self = this.set("fieldConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldConfig: Self = this.set("fieldConfig", js.undefined)
    
    @scala.inline
    def setFormTemplate(value: FormTemplateProperties): Self = this.set("formTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormTemplate: Self = this.set("formTemplate", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
}
