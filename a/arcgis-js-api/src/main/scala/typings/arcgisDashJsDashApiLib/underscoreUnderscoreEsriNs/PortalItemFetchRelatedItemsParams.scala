package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalItemFetchRelatedItemsParams
  extends stdLib.Object {
  /**
    * The direction of the relationship. Can either be `forward` (from origin to destination) or `reverse` (from destination to origin). **Possible Values:** forward | reverse
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of relationship between the two items. See [Relationship types](https://developers.arcgis.com/rest/users-groups-and-items/relationship-types.htm) for a complete listing of types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var relationshipType: java.lang.String
}

object PortalItemFetchRelatedItemsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    relationshipType: java.lang.String,
    direction: java.lang.String = null
  ): PortalItemFetchRelatedItemsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relationshipType = relationshipType)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[PortalItemFetchRelatedItemsParams]
  }
}

