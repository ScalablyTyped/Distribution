package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTableProperties extends WidgetProperties {
  /**
    * Indicates whether to display the `Attachments` field in the table. This is only applicable if the feature layer supports attachments. Currently, this field only displays the count of attachments per feature.  ![featuretable attachmentenabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/attachments-enabled.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#attachmentsEnabled)
    *
    * @default false
    */
  var attachmentsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of individual configuration objects.  This is where you can specify what fields to display and how you wish to display them.  When not set, all fields except for `CreationDate`, `Creator`, `EditDate`, `Editor`, and `GlobalID` will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#fieldConfigs)
    *
    * @default null
    */
  var fieldConfigs: js.UndefOr[js.Array[FieldColumnConfigProperties]] = js.undefined
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureTableViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureTableViewModel] = js.undefined
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#visibleElements)
    */
  var visibleElements: js.UndefOr[FeatureTableVisibleElements] = js.undefined
}

object FeatureTableProperties {
  @scala.inline
  def apply(
    attachmentsEnabled: js.UndefOr[Boolean] = js.undefined,
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    fieldConfigs: js.Array[FieldColumnConfigProperties] = null,
    id: String = null,
    label: String = null,
    layer: FeatureLayerProperties = null,
    viewModel: FeatureTableViewModel = null,
    visibleElements: FeatureTableVisibleElements = null
  ): FeatureTableProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachmentsEnabled)) __obj.updateDynamic("attachmentsEnabled")(attachmentsEnabled.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.get.asInstanceOf[js.Any])
    if (fieldConfigs != null) __obj.updateDynamic("fieldConfigs")(fieldConfigs.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    if (visibleElements != null) __obj.updateDynamic("visibleElements")(visibleElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTableProperties]
  }
}

