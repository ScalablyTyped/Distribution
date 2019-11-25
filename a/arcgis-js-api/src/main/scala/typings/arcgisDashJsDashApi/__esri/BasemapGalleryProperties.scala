package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasemapGalleryProperties extends WidgetProperties {
  /**
    * The map's [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#activeBasemap)
    */
  var activeBasemap: js.UndefOr[BasemapProperties] = js.undefined
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * The source for basemaps that the widget will display. This property can be autocast with an array or [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)s, a [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html) instance, or a URL to a portal instance. The default source is a [PortalBasemapsSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html) that points to the default portal instance set in [esriConfig.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#source)
    */
  var source: js.UndefOr[LocalBasemapsSourceProperties | PortalBasemapsSourceProperties] = js.undefined
  /**
    * The view from which the widget will operate. This view provides access to the active [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) via the view's [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [BasemapGalleryViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#viewModel)
    */
  var viewModel: js.UndefOr[BasemapGalleryViewModelProperties] = js.undefined
}

object BasemapGalleryProperties {
  @scala.inline
  def apply(
    activeBasemap: BasemapProperties = null,
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    source: LocalBasemapsSourceProperties | PortalBasemapsSourceProperties = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: BasemapGalleryViewModelProperties = null
  ): BasemapGalleryProperties = {
    val __obj = js.Dynamic.literal()
    if (activeBasemap != null) __obj.updateDynamic("activeBasemap")(activeBasemap.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasemapGalleryProperties]
  }
}

