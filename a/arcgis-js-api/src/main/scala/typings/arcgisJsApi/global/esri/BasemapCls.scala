package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BasemapProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Basemap")
@js.native
/**
  * Creates a new basemap object. Basemaps can be created from a [PortalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html), from a well known [basemap ID](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#fromId), or can be used for creating custom basemaps. These basemaps may be created from tiled services you publish to your own server, or from tiled services published by third parties.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)
  */
class BasemapCls ()
  extends typings.arcgisJsApi.esri.Basemap {
  def this(properties: BasemapProperties) = this()
}

