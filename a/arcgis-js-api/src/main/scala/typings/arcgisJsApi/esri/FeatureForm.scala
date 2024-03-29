package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`value-change`
import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.sequential
import typings.arcgisJsApi.arcgisJsApiStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureForm
  extends StObject
     with Widget_ {
  
  /**
  		 * When `true`, sets the widget to a disabled state so the user cannot interact with it.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#disabled)
  		 */
  var disabled: Boolean = js.native
  
  /**
  		 * The associated feature containing the editable attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#feature)
  		 */
  var feature: Graphic = js.native
  
  /**
  		 * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used for the form.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate)
  		 */
  var formTemplate: FormTemplate = js.native
  
  /**
  		 * Returns all of the field values, regardless of update status.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#getValues)
  		 */
  def getValues(): Any = js.native
  
  /**
  		 * Defines how groups will be displayed to the user.
  		 *
  		 * @default all
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#groupDisplay)
  		 */
  var groupDisplay: all | sequential = js.native
  
  /**
  		 * Indicates the heading level to use for the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#title) of the form.
  		 *
  		 * @default 2
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#headingLevel)
  		 */
  var headingLevel: Double = js.native
  
  /**
  		 * Layer containing the editable feature attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#layer)
  		 */
  var layer: FeatureLayer | SubtypeSublayer = js.native
  
  /**
  		 * A reference to the associated [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#map)
  		 */
  var map: Map = js.native
  
  @JSName("on")
  def on_submit(name: submit, eventHandler: FeatureFormSubmitEventHandler): IHandle = js.native
  @JSName("on")
  def on_valuechange(name: `value-change`, eventHandler: FeatureFormValueChangeEventHandler): IHandle = js.native
  
  /**
  		 * Fires the [submit](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#event-submit) event.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#submit)
  		 */
  def submit(): scala.Unit = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/FeatureForm#map map} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#viewModel)
  		 */
  var viewModel: FeatureFormViewModel = js.native
}
