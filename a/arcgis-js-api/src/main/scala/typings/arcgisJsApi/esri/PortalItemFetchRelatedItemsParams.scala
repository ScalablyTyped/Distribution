package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.forward
import typings.arcgisJsApi.arcgisJsApiStrings.reverse
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemFetchRelatedItemsParams
  extends StObject
     with Object {
  
  /**
    * The direction of the relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var direction: forward | reverse
  
  /**
    * The type of relationship between the two items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchRelatedItems)
    */
  var relationshipType: String
}
object PortalItemFetchRelatedItemsParams {
  
  inline def apply(
    constructor: js.Function,
    direction: forward | reverse,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    relationshipType: String
  ): PortalItemFetchRelatedItemsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relationshipType = relationshipType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalItemFetchRelatedItemsParams]
  }
  
  extension [Self <: PortalItemFetchRelatedItemsParams](x: Self) {
    
    inline def setDirection(value: forward | reverse): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setRelationshipType(value: String): Self = StObject.set(x, "relationshipType", value.asInstanceOf[js.Any])
  }
}
