package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`value-change`
import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.sequential
import typings.arcgisJsApi.arcgisJsApiStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureForm extends Widget_ {
  /**
    * The description of the form. If this is not set, it defaults to what is set within the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).  This property was added at 4.16 to provide parity with the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html). The preferred way to set this property is via the form template's [description](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#description) property. The `description` property on the [form](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) or its [view model](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html) will eventually be deprecated in a later release in favor of the setting it within the form [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#description)
    */
  var description: String = js.native
  /**
    * The associated feature containing the editable attributes. A common way to access this is via the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) or [SceneView's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest) `hitTest()` method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#feature)
    */
  var feature: Graphic = js.native
  /**
    * Array of individual or grouped field configuration objects. This is where you specify what fields to display and how you wish to display them. It is possible to configure individual or [grouped fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html). For an example of individual field configurations, please refer to the [Update FeatureLayer using ApplyEdits](https://developers.arcgis.com/javascript/latest/sample-code/editing-applyedits/index.html) sample.  Starting with version 4.16, the preferred way to set the field or grouped field configurations is via [FieldElement(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) or [GroupElement(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html) set within the form's [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate).  Currently, the field configuration settings take precedence over any [FieldElement(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) that may be set within the form's [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html). The `fieldConfigs` property will be fully deprecated at a future release in favor of setting elements within the form's [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
    * > When not set, all fields except for `editor`, `globalID`, `objectID`, and system maintained area and length fields will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#fieldConfig)
    */
  var fieldConfig: js.Array[FieldConfig | FieldGroupConfig] = js.native
  /**
    * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used for the form.   The [formTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) is where you configure how the form should display. Properties, i.e. `title`, `description`, `fieldConfigs`, etc, set directly within the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) take precedence over any similar properties set within the `formTemplate`. This will change in a future release as the preferred way to set the form's properties is via it's [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate)
    */
  var formTemplate: FormTemplate = js.native
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
  var groupDisplay: all | sequential = js.native
  /**
    * Layer containing the editable feature attributes. If this layer is not specified, it is the same as the [graphic's layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#layer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#layer)
    */
  var layer: FeatureLayer = js.native
  /**
    * The title of the form. If this is not set, it defaults to what is set within the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).  This property was added at 4.16 to provide parity with the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html). The preferred way to set this property is via the form template's [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#title) property. The `title` property on the [form](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) or its [view model](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html) will eventually be deprecated in a later release in favor of the setting it within the form [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#title)
    */
  var title: String = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureFormViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#viewModel)
    */
  var viewModel: FeatureFormViewModel = js.native
  /**
    * Returns all of the field values, regardless of whether or not they were updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#getValues)
    *
    *
    */
  def getValues(): js.Any = js.native
  @JSName("on")
  def on_submit(name: submit, eventHandler: FeatureFormSubmitEventHandler): IHandle = js.native
  @JSName("on")
  def on_valuechange(name: `value-change`, eventHandler: FeatureFormValueChangeEventHandler): IHandle = js.native
  /**
    * Fires the [submit](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#event-submit) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#submit)
    *
    *
    */
  def submit(): Unit = js.native
}

