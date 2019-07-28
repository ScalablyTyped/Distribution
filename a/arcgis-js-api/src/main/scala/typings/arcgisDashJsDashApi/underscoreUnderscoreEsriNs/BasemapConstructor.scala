package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapConstructor
  extends /**
  * Creates a new basemap object. Basemaps can be created from a [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html), from a well known [basemap ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#fromId), or can be used for creating custom basemaps. These basemaps may be created from tiled services you publish to your own server, or from tiled services published by third parties.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)
  */
Instantiable0[Basemap]
     with Instantiable1[/* properties */ BasemapProperties, Basemap] {
  /**
    * Creates a new basemap instance from a [well known basemap ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap). See [Map.basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) for a list of possible values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#fromId)
    *
    * @param id The basemap ID.
    *
    */
  def fromId(id: String): Basemap = js.native
  def fromJSON(json: js.Any): Basemap = js.native
}

