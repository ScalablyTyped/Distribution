package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalBasemapsSourceProperties extends js.Object {
  /**
    * A collection of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-LocalBasemapsSource.html#basemaps)
    */
  var basemaps: js.UndefOr[CollectionProperties[BasemapProperties]] = js.undefined
}

object LocalBasemapsSourceProperties {
  @scala.inline
  def apply(basemaps: CollectionProperties[BasemapProperties] = null): LocalBasemapsSourceProperties = {
    val __obj = js.Dynamic.literal()
    if (basemaps != null) __obj.updateDynamic("basemaps")(basemaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalBasemapsSourceProperties]
  }
}

