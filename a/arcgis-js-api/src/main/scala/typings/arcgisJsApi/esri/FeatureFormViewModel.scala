package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`value-change`
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFormViewModel
  extends StObject
     with Accessor
     with Evented {
  
  /**
  		 * The associated feature containing the editable attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#feature)
  		 */
  var feature: Graphic = js.native
  
  /**
  		 * Convenience method to find field inputs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#findField)
  		 */
  def findField(fieldName: String): FieldInput = js.native
  
  /**
  		 * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used for the form.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#formTemplate)
  		 */
  var formTemplate: FormTemplate = js.native
  
  /**
  		 * Returns all of the field values, regardless of whether or not they were updated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#getValues)
  		 */
  def getValues(): Any = js.native
  
  /**
  		 * The field and/or group inputs that make up the form [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
  		 *
  		 * @deprecated since version 4.27. Instead use {@link module:esri/widgets/FeatureFormViewModel#inputs inputs}.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#inputFields)
  		 */
  val inputFields: js.Array[InputField | InputFieldGroup] = js.native
  
  /**
  		 * The field, group, or relationship inputs that make up the form [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#inputs)
  		 */
  val inputs: js.Array[FieldInput | GroupInput | RelationshipInput] = js.native
  
  /**
  		 * Layer containing the editable feature attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#layer)
  		 */
  var layer: FeatureLayer | SceneLayer | SubtypeSublayer = js.native
  
  /**
  		 * A reference to the associated [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#map)
  		 */
  var map: Map = js.native
  
  @JSName("on")
  def on_submit(name: submit, eventHandler: FeatureFormViewModelSubmitEventHandler): IHandle = js.native
  @JSName("on")
  def on_valuechange(name: `value-change`, eventHandler: FeatureFormViewModelValueChangeEventHandler): IHandle = js.native
  
  /**
  		 * The method used to set the updated field value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#setValue)
  		 */
  def setValue(fieldName: String): scala.Unit = js.native
  def setValue(fieldName: String, value: String): scala.Unit = js.native
  def setValue(fieldName: String, value: Double): scala.Unit = js.native
  
  /**
  		 * The widget's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#state)
  		 */
  val state: ready | disabled = js.native
  
  /**
  		 * Fires the [submit](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#event-submit) event.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#submit)
  		 */
  def submit(): scala.Unit = js.native
  
  /**
  		 * Indicates if the field's value can be submitted without introducing data validation issues.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#submittable)
  		 */
  var submittable: Boolean = js.native
  
  /**
  		 * Indicates whether the form is currently updating.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#updating)
  		 */
  val updating: Boolean = js.native
  
  /**
  		 * Indicates whether all of the input fields are valid.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#valid)
  		 */
  val valid: Boolean = js.native
  
  /**
  		 * Validates whether a feature's attribute values conform to the defined contingent values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#validateContingencyConstraints)
  		 */
  def validateContingencyConstraints(values: String): js.Array[Any] = js.native
  def validateContingencyConstraints(values: String, options: FeatureFormViewModelValidateContingencyConstraintsOptions): js.Array[Any] = js.native
}
