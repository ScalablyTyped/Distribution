package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`value-change`
import typings.arcgisJsApi.arcgisJsApiStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.Evented because Inheritance from two classes. Inlined emit, emit, hasEventListener, on, on */ @js.native
trait FeatureFormViewModel extends Accessor {
  /**
    * The associated feature containing the editable attributes. A common way to access this is via the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) or [SceneView's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest) `hitTest()` method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#feature)
    */
  var feature: Graphic = js.native
  /**
    * Array of individual or grouped field configuration objects. This is where you specify what fields to display and how you wish to display them. It is possible to configure individual or [grouped fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html). For an example of individual field configurations, please refer to the [Update FeatureLayer using ApplyEdits](https://developers.arcgis.com/javascript/latest/sample-code/editing-applyedits/index.html) sample. For an example of grouped field configurations, please refer to the [Update Feature Attributes](https://developers.arcgis.com/javascript/latest/sample-code/editing-groupedfeatureform/index.html) sample.
    * > When not set, all fields except for `editor`, `globalID`, `objectID`, and system maintained area and length fields will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#fieldConfig)
    */
  var fieldConfig: js.Array[FieldConfig | FieldGroupConfig] = js.native
  /**
    * The input fields and/or grouped field rendered by the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#inputField)
    */
  val inputField: js.Array[InputField | InputFieldGroup] = js.native
  /**
    * Layer containing the editable feature attributes. If this layer is not specified, it is the same as the [graphic's layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#layer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#layer)
    */
  var layer: FeatureLayer = js.native
  /**
    * The widget's state. Possible values are in the table below.
    *
    * Value | Description
    * ------|------------
    * ready | Dependencies are met and has valid property values.
    * disabled | Dependencies are missing and cannot provide valid inputs.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#state)
    *
    * @default disabled
    */
  val state: String = js.native
  /**
    * Indicates whether all input fields are valid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#valid)
    */
  var valid: Boolean = js.native
  /**
    * Emits an event on the instance. This method should only be used when creating subclasses of this class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#emit)
    *
    * @param type The name of the event.
    * @param event The event payload.
    *
    */
  def emit(`type`: String): Boolean = js.native
  def emit(`type`: String, event: js.Any): Boolean = js.native
  /**
    * Convenience method to find input fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#findField)
    *
    * @param fieldName The input field to find.
    *
    */
  def findField(fieldName: String): InputField = js.native
  /**
    * Returns all of the field values, regardless of whether or not they were updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#getValues)
    *
    *
    */
  def getValues(): js.Any = js.native
  /**
    * Indicates whether there is an event listener on the instance that matches the provided event name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#hasEventListener)
    *
    * @param type The name of the event.
    *
    */
  def hasEventListener(`type`: String): Boolean = js.native
  /**
    * Registers an event handler on the instance. Call this method to hook an event with a listener.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#on)
    *
    * @param type A event type, or an array of event types, to listen for.
    * @param listener The function to call when the event is fired.
    *
    */
  def on(`type`: String, listener: EventHandler): IHandle = js.native
  def on(`type`: js.Array[String], listener: EventHandler): IHandle = js.native
  @JSName("on")
  def on_submit(name: submit, eventHandler: FeatureFormViewModelSubmitEventHandler): IHandle = js.native
  @JSName("on")
  def on_valuechange(name: `value-change`, eventHandler: FeatureFormViewModelValueChangeEventHandler): IHandle = js.native
  /**
    * Fires the [submit](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#event-submit) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#submit)
    *
    *
    */
  def submit(): Unit = js.native
}

@JSGlobal("__esri.FeatureFormViewModel")
@js.native
object FeatureFormViewModel extends TopLevel[FeatureFormViewModelConstructor]

