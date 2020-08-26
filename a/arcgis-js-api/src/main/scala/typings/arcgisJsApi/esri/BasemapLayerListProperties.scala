package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapLayerListProperties extends WidgetProperties {
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) representing a base layer. Each list item's modifiable properties can be updated within. Actions can be added to list items using the [actionsSections](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections) property of the ListItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#baseListItemCreatedFunction)
    */
  var baseListItemCreatedFunction: js.UndefOr[js.Function] = js.native
  /**
    * The current basemap's title.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#basemapTitle)
    */
  var basemapTitle: js.UndefOr[String] = js.native
  /**
    * Indicates whether the basemap’s title, layer order and layer grouping can be edited by the user. Any edits made will only be shown locally and will not be saved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#editingEnabled)
    *
    * @default false
    */
  var editingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * Indicates whether more than one list item may be selected by the user at a single time. Selected items are available in the [selectedItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#selectedItems) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#multipleSelectionEnabled)
    *
    * @default false
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html) representing a reference layer. Each list item's modifiable properties can be updated within. Actions can be added to list items using the [actionsSections](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections) property of the ListItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#referenceListItemCreatedFunction)
    */
  var referenceListItemCreatedFunction: js.UndefOr[js.Function] = js.native
  /**
    * A collection of selected [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing basemap layers selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#selectedItems)
    */
  var selectedItems: js.UndefOr[CollectionProperties[ListItem]] = js.native
  /**
    * Option for enabling status indicators, which indicate whether or not each layer is loading resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#statusIndicatorsVisible)
    *
    * @default true
    */
  var statusIndicatorsVisible: js.UndefOr[Boolean] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [BasemapLayerListViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList-BasemapLayerListViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#viewModel)
    */
  var viewModel: js.UndefOr[BasemapLayerListViewModelProperties] = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapLayerList.html#visibleElements)
    */
  var visibleElements: js.UndefOr[VisibleElements] = js.native
}

object BasemapLayerListProperties {
  @scala.inline
  def apply(): BasemapLayerListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapLayerListProperties]
  }
  @scala.inline
  implicit class BasemapLayerListPropertiesOps[Self <: BasemapLayerListProperties] (val x: Self) extends AnyVal {
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
    def setBaseListItemCreatedFunction(value: js.Function): Self = this.set("baseListItemCreatedFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseListItemCreatedFunction: Self = this.set("baseListItemCreatedFunction", js.undefined)
    @scala.inline
    def setBasemapTitle(value: String): Self = this.set("basemapTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemapTitle: Self = this.set("basemapTitle", js.undefined)
    @scala.inline
    def setEditingEnabled(value: Boolean): Self = this.set("editingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditingEnabled: Self = this.set("editingEnabled", js.undefined)
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setMultipleSelectionEnabled(value: Boolean): Self = this.set("multipleSelectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleSelectionEnabled: Self = this.set("multipleSelectionEnabled", js.undefined)
    @scala.inline
    def setReferenceListItemCreatedFunction(value: js.Function): Self = this.set("referenceListItemCreatedFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceListItemCreatedFunction: Self = this.set("referenceListItemCreatedFunction", js.undefined)
    @scala.inline
    def setSelectedItemsVarargs(value: ListItem*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: CollectionProperties[ListItem]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    @scala.inline
    def setStatusIndicatorsVisible(value: Boolean): Self = this.set("statusIndicatorsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusIndicatorsVisible: Self = this.set("statusIndicatorsVisible", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewModel(value: BasemapLayerListViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    @scala.inline
    def setVisibleElements(value: VisibleElements): Self = this.set("visibleElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleElements: Self = this.set("visibleElements", js.undefined)
  }
  
}

