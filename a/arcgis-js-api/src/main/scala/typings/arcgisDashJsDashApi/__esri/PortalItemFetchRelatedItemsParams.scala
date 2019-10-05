package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalItemFetchRelatedItemsParams extends Object {
  /**
    * The direction of the relationship. Can either be `forward` (from origin to destination) or `reverse` (from destination to origin). **Possible Values:** forward | reverse
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var direction: js.UndefOr[String] = js.undefined
  /**
    * The type of relationship between the two items. See [Relationship types](https://developers.arcgis.com/rest/users-groups-and-items/relationship-types.htm) for a complete listing of types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var relationshipType: String
}

object PortalItemFetchRelatedItemsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    relationshipType: String,
    direction: String = null
  ): PortalItemFetchRelatedItemsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relationshipType = relationshipType)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[PortalItemFetchRelatedItemsParams]
  }
}

