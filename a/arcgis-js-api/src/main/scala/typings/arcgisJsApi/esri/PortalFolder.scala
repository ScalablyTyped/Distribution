package typings.arcgisJsApi.esri

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalFolder extends Accessor {
  /**
    * The date the folder was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#created)
    */
  var created: Date = js.native
  /**
    * The unique id of the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#id)
    */
  var id: String = js.native
  /**
    * The portal associated with the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#portal)
    */
  var portal: Portal = js.native
  /**
    * The title of the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#title)
    */
  var title: String = js.native
  /**
    * The URL to the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#url)
    */
  val url: String = js.native
}

