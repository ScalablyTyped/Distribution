package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`selection-change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTable extends Widget_ {
  /**
    * Indicates whether to display the `Attachments` field in the table. This is only applicable if the feature layer supports attachments. Currently, this field only displays the count of attachments per feature.  ![featuretable attachmentenabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/attachments-enabled.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#attachmentsEnabled)
    *
    * @default false
    */
  var attachmentsEnabled: Boolean = js.native
  /**
    * An array of individual configuration objects.  This is where you can specify what fields to display and how you wish to display them.  When not set, all fields except for `CreationDate`, `Creator`, `EditDate`, `Editor`, and `GlobalID` will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#fieldConfigs)
    *
    * @default null
    */
  var fieldConfigs: js.Array[FieldColumnConfig] = js.native
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#layer)
    */
  var layer: FeatureLayer = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureTableViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#viewModel)
    */
  var viewModel: FeatureTableViewModel = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#visibleElements)
    */
  var visibleElements: FeatureTableVisibleElements = js.native
  @JSName("on")
  def on_selectionchange(name: `selection-change`, eventHandler: FeatureTableSelectionChangeEventHandler): IHandle = js.native
}

@JSGlobal("__esri.FeatureTable")
@js.native
object FeatureTable extends TopLevel[FeatureTableConstructor]

