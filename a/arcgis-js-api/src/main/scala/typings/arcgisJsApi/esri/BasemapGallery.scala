package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapGallery extends Widget_ {
  /**
    * The map's [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#activeBasemap)
    */
  var activeBasemap: Basemap = js.native
  /**
    * When `true`, sets the widget to a disabled state so the user cannot interact with it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#disabled)
    *
    * @default false
    */
  var disabled: Boolean = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#iconClass)
    */
  var iconClass: String = js.native
  /**
    * The source for basemaps that the widget will display. This property can be autocast with an array or [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)s, a [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html) instance, or a URL to a portal instance. The default source is a [PortalBasemapsSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html) that points to the default portal instance set in [esriConfig.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#source)
    */
  var source: LocalBasemapsSource | PortalBasemapsSource = js.native
  /**
    * The view from which the widget will operate. This view provides access to the active [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) via the view's [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [BasemapGalleryViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery.html#viewModel)
    */
  var viewModel: BasemapGalleryViewModel = js.native
}

