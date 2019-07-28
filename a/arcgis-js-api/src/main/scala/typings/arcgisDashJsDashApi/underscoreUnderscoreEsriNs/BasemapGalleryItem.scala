package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapGalleryItem extends Accessor {
  /**
    * The item's associated basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#basemap)
    */
  var basemap: Basemap = js.native
  /**
    * The Error object returned if an error occurred.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#error)
    */
  val error: Error = js.native
  /**
    * The item's state.  **Possible Values:** loading | ready | error
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#state)
    *
    * @default loading
    */
  val state: String = js.native
  /**
    * The view associated with this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#view)
    */
  var view: MapView | SceneView = js.native
}

@JSGlobal("__esri.BasemapGalleryItem")
@js.native
class BasemapGalleryItemCls () extends BasemapGalleryItem {
  def this(properties: BasemapGalleryItemProperties) = this()
}

