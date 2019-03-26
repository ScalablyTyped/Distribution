package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalBasemapsSource extends Accessor {
  /**
    * A collection of [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-LocalBasemapsSource.html#basemaps)
    */
  var basemaps: Collection[Basemap] = js.native
  /**
    * The source's state. The state is always `ready`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-LocalBasemapsSource.html#state)
    */
  val state: java.lang.String = js.native
  /**
    * Refreshes the source basemaps. Note: `refresh` will not affect LocalBasemapsSource. Modify basemaps directly instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapGallery-support-LocalBasemapsSource.html#refresh)
    *
    *
    */
  def refresh(): scala.Unit = js.native
}

@JSGlobal("__esri.LocalBasemapsSource")
@js.native
class LocalBasemapsSourceCls () extends LocalBasemapsSource {
  def this(properties: LocalBasemapsSourceProperties) = this()
}

