package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerListProperties extends WidgetProperties {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html). Each list item can be modified according to its modifiable properties. Actions can be added to list items using the [actionsSections](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections) property of the ListItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#listItemCreatedFunction)
    */
  var listItemCreatedFunction: js.UndefOr[ListItemCreatedHandler] = js.native
  /**
    * Indicates whether more than one list item may be selected by the user at a single time. You must first set [selectionEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectionEnabled) to `true` for this property to have an effect on the widget.  Selected items are available in the [selectedItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectedItems) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#multipleSelectionEnabled)
    *
    * @default false
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A collection of selected [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html)s representing operational layers selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectedItems)
    */
  var selectedItems: js.UndefOr[CollectionProperties[ListItem]] = js.native
  /**
    * Indicates whether list items may be selected by the user. Selected items may be reordered in the list by dragging gestures with the mouse or touch screen, or with arrow keys on the keyboard.  Selected items are available in the [selectedItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectedItems) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectionEnabled)
    *
    * @default false
    */
  var selectionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Option for enabling status indicators, which indicate whether or not each layer is loading resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#statusIndicatorsVisible)
    *
    * @default true
    */
  var statusIndicatorsVisible: js.UndefOr[Boolean] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [LayerListViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#viewModel)
    */
  var viewModel: js.UndefOr[LayerListViewModelProperties] = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#visibleElements)
    */
  var visibleElements: js.UndefOr[LayerListVisibleElements] = js.native
}

object LayerListProperties {
  @scala.inline
  def apply(): LayerListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerListProperties]
  }
  @scala.inline
  implicit class LayerListPropertiesOps[Self <: LayerListProperties] (val x: Self) extends AnyVal {
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
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setListItemCreatedFunction(value: /* event */ js.Any => Unit): Self = this.set("listItemCreatedFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteListItemCreatedFunction: Self = this.set("listItemCreatedFunction", js.undefined)
    @scala.inline
    def setMultipleSelectionEnabled(value: Boolean): Self = this.set("multipleSelectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleSelectionEnabled: Self = this.set("multipleSelectionEnabled", js.undefined)
    @scala.inline
    def setSelectedItemsVarargs(value: ListItem*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: CollectionProperties[ListItem]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    @scala.inline
    def setSelectionEnabled(value: Boolean): Self = this.set("selectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionEnabled: Self = this.set("selectionEnabled", js.undefined)
    @scala.inline
    def setStatusIndicatorsVisible(value: Boolean): Self = this.set("statusIndicatorsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusIndicatorsVisible: Self = this.set("statusIndicatorsVisible", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewModel(value: LayerListViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    @scala.inline
    def setVisibleElements(value: LayerListVisibleElements): Self = this.set("visibleElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleElements: Self = this.set("visibleElements", js.undefined)
  }
  
}

