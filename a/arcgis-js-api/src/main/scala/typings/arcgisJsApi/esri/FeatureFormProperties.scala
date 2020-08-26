package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.sequential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFormProperties extends WidgetProperties {
  /**
    * The description of the form. If this is not set, it defaults to what is set within the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).  This property was added at 4.16 to provide parity with the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html). The preferred way to set this property is via the form template's [description](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#description) property. The `description` property on the [form](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) or its [view model](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html) will eventually be deprecated in a later release in favor of the setting it within the form [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The associated feature containing the editable attributes. A common way to access this is via the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) or [SceneView's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest) `hitTest()` method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#feature)
    */
  var feature: js.UndefOr[GraphicProperties] = js.native
  /**
    * Array of individual or grouped field configuration objects. This is where you specify what fields to display and how you wish to display them. It is possible to configure individual or [grouped fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html). For an example of individual field configurations, please refer to the [Update FeatureLayer using ApplyEdits](https://developers.arcgis.com/javascript/latest/sample-code/editing-applyedits/index.html) sample.  Starting with version 4.16, the preferred way to set the field or grouped field configurations is via [FieldElement(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) or [GroupElement(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html) set within the form's [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate).  Currently, the field configuration settings take precedence over any [FieldElement(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) that may be set within the form's [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html). The `fieldConfigs` property will be fully deprecated at a future release in favor of setting elements within the form's [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
    * > When not set, all fields except for `editor`, `globalID`, `objectID`, and system maintained area and length fields will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#fieldConfig)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfigProperties | FieldGroupConfigProperties]] = js.native
  /**
    * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used for the form.   The [formTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) is where you configure how the form should display. Properties, i.e. `title`, `description`, `fieldConfigs`, etc, set directly within the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) take precedence over any similar properties set within the `formTemplate`. This will change in a future release as the preferred way to set the form's properties is via it's [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate)
    */
  var formTemplate: js.UndefOr[FormTemplateProperties] = js.native
  /**
    * Defines how groups will be displayed to the user.  **Possible Values**
    *
    * Value | Description |
    * ----- | ----------- |
    * all | All groups will be expanded.
    * sequential | A single group will be expanded at a time.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#groupDisplay)
    *
    * @default all
    */
  var groupDisplay: js.UndefOr[all | sequential] = js.native
  /**
    * Layer containing the editable feature attributes. If this layer is not specified, it is the same as the [graphic's layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#layer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.native
  /**
    * The title of the form. If this is not set, it defaults to what is set within the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).  This property was added at 4.16 to provide parity with the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html). The preferred way to set this property is via the form template's [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#title) property. The `title` property on the [form](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) or its [view model](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html) will eventually be deprecated in a later release in favor of the setting it within the form [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#title)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureFormViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureFormViewModelProperties] = js.native
}

object FeatureFormProperties {
  @scala.inline
  def apply(): FeatureFormProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureFormProperties]
  }
  @scala.inline
  implicit class FeatureFormPropertiesOps[Self <: FeatureFormProperties] (val x: Self) extends AnyVal {
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
    def setGroupDisplay(value: all | sequential): Self = this.set("groupDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupDisplay: Self = this.set("groupDisplay", js.undefined)
    @scala.inline
    def setLayer(value: FeatureLayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setViewModel(value: FeatureFormViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

