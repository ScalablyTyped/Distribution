package typings.arcgisJsApi.esri

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalRating extends Accessor {
  /**
    * Date the rating was added to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html#created)
    */
  var created: Date = js.native
  /**
    * A rating between 1.0 and 5.0 for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html#rating)
    */
  var rating: Double = js.native
}

