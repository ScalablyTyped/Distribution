package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.forward
import typings.arcgisJsApi.arcgisJsApiStrings.reverse
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalItemFetchRelatedItemsParams extends Object {
  /**
    * The direction of the relationship. Can either be `forward` (from origin to destination) or `reverse` (from destination to origin).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var direction: forward | reverse = js.native
  /**
    * The type of relationship between the two items. See [Relationship types](https://developers.arcgis.com/rest/users-groups-and-items/relationship-types.htm) for a complete listing of types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var relationshipType: String = js.native
}

object PortalItemFetchRelatedItemsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    direction: forward | reverse,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    relationshipType: String
  ): PortalItemFetchRelatedItemsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relationshipType = relationshipType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalItemFetchRelatedItemsParams]
  }
  @scala.inline
  implicit class PortalItemFetchRelatedItemsParamsOps[Self <: PortalItemFetchRelatedItemsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirection(value: forward | reverse): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelationshipType(value: String): Self = this.set("relationshipType", value.asInstanceOf[js.Any])
  }
  
}

