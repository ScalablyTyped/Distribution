package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarksProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * Specifies how new bookmarks will be created if [editingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#editingEnabled) is set to `true`. Can be used to enable or disable taking screenshots or creating an extent based on the current view when a bookmark is created. See [BookmarkCreationOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkCreationOptions) for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#bookmarkCreationOptions)
    */
  var bookmarkCreationOptions: js.UndefOr[BookmarkCreationOptions] = js.undefined
  /**
    * A collection of [Bookmark](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#bookmarks)
    */
  var bookmarks: js.UndefOr[CollectionProperties[BookmarkProperties]] = js.undefined
  /**
    * When true, the widget is visually withdrawn and cannot be interacted with.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#disabled)
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the widget is able to be edited. When `true`, allows bookmarks to be added, edited, reordered, or deleted from within the widget. Any edits made will only be shown locally and will not be saved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#editingEnabled)
    *
    * @default false
    */
  var editingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [BookmarksViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#viewModel)
    */
  var viewModel: js.UndefOr[BookmarksViewModelProperties] = js.undefined
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#visibleElements)
    */
  var visibleElements: js.UndefOr[BookmarksVisibleElements] = js.undefined
}

object BookmarksProperties {
  @scala.inline
  def apply(
    bookmarkCreationOptions: BookmarkCreationOptions = null,
    bookmarks: CollectionProperties[BookmarkProperties] = null,
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editingEnabled: js.UndefOr[Boolean] = js.undefined,
    goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ js.Any) => Unit = null,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    view: MapViewProperties = null,
    viewModel: BookmarksViewModelProperties = null,
    visibleElements: BookmarksVisibleElements = null
  ): BookmarksProperties = {
    val __obj = js.Dynamic.literal()
    if (bookmarkCreationOptions != null) __obj.updateDynamic("bookmarkCreationOptions")(bookmarkCreationOptions.asInstanceOf[js.Any])
    if (bookmarks != null) __obj.updateDynamic("bookmarks")(bookmarks.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(editingEnabled)) __obj.updateDynamic("editingEnabled")(editingEnabled.asInstanceOf[js.Any])
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(js.Any.fromFunction2(goToOverride))
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    if (visibleElements != null) __obj.updateDynamic("visibleElements")(visibleElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarksProperties]
  }
}

