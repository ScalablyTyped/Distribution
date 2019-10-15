package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`value-change`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureForm extends Widget {
  /**
    * The associated feature containing the editable attributes. A common way to access this is via the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) or [SceneView's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest) `hitTest()` method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#feature)
    */
  var feature: Graphic = js.native
  /**
    * Array of individual or grouped field configuration objects. This is where you specify what fields to display and how you wish to display them. It is possible to configure individual or [grouped fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html). For an example of individual field configurations, please refer to the [Update FeatureLayer using ApplyEdits](https://developers.arcgis.com/javascript/latest/sample-code/editing-applyedits/index.html) sample. For an example of grouped field configurations, please refer to the [Update Feature Attributes](https://developers.arcgis.com/javascript/latest/sample-code/editing-groupedfeatureform/index.html) sample.
    * > When not set, all fields except for `editor`, `globalID`, `objectID`, and system maintained area and length fields will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#fieldConfig)
    */
  var fieldConfig: js.Array[FieldConfig | FieldGroupConfig] = js.native
  /**
    * Defines how groups will be displayed to the user.  **Possible Values:**
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
  var groupDisplay: String = js.native
  /**
    * Layer containing the editable feature attributes. If this layer is not specified, it is the same as the [graphic's layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#layer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#layer)
    */
  var layer: FeatureLayer = js.native
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

@JSGlobal("__esri.FeatureForm")
@js.native
object FeatureForm extends TopLevel[FeatureFormConstructor]

