package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasemapGalleryItemProperties extends js.Object {
  /**
    * The item's associated basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#basemap)
    */
  var basemap: js.UndefOr[BasemapProperties] = js.undefined
  /**
    * The view associated with this item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-BasemapGalleryItem.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object BasemapGalleryItemProperties {
  @scala.inline
  def apply(basemap: BasemapProperties = null, view: MapViewProperties | SceneViewProperties = null): BasemapGalleryItemProperties = {
    val __obj = js.Dynamic.literal()
    if (basemap != null) __obj.updateDynamic("basemap")(basemap)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasemapGalleryItemProperties]
  }
}

