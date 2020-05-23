package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalRatingProperties extends js.Object {
  /**
    * Date the rating was added to the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.undefined
  /**
    * A rating between 1.0 and 5.0 for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalRating.html#rating)
    */
  var rating: js.UndefOr[Double] = js.undefined
}

object PortalRatingProperties {
  @scala.inline
  def apply(created: DateProperties = null, rating: js.UndefOr[Double] = js.undefined): PortalRatingProperties = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (!js.isUndefined(rating)) __obj.updateDynamic("rating")(rating.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalRatingProperties]
  }
}

