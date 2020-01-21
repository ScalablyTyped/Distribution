package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapGalleryViewModel extends Accessor {
  /**
    * The map's [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#activeBasemap)
    */
  var activeBasemap: Basemap = js.native
  /**
    * A collection of [BasemapGalleryItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html)s representing basemaps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#items)
    */
  var items: Collection[BasemapGalleryItem] = js.native
  /**
    * The source for basemaps that the widget will display. This property can be autocast with an array or [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)s, a [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html) instance or a URL to a portal instance. The default source is a [PortalBasemapsSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-PortalBasemapsSource.html) that points to the default portal instance set in [esriConfig.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#source)
    */
  var source: LocalBasemapsSource | PortalBasemapsSource = js.native
  /**
    * The view model's state.  **Possible Values:** ready | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#state)
    *
    * @default disabled
    */
  val state: String = js.native
  /**
    * The view from which the widget will operate. This view provides access to the active [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) via the view's [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * A convenience function to check basemap equality.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-BasemapGalleryViewModel.html#basemapEquals)
    *
    * @param basemap1 The basemap to compare against `basemap2`.
    * @param basemap2 The basemap to compare against `basemap1`.
    *
    */
  def basemapEquals(basemap1: Basemap, basemap2: Basemap): Boolean = js.native
}

@JSGlobal("__esri.BasemapGalleryViewModel")
@js.native
object BasemapGalleryViewModel extends TopLevel[BasemapGalleryViewModelConstructor]

