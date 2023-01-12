package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.forward
import typings.arcgisJsApi.arcgisJsApiStrings.reverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemFetchRelatedItemsParams extends StObject {
  
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
  
  inline def apply(direction: forward | reverse, relationshipType: String): PortalItemFetchRelatedItemsParams = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], relationshipType = relationshipType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalItemFetchRelatedItemsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalItemFetchRelatedItemsParams] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: forward | reverse): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setRelationshipType(value: String): Self = StObject.set(x, "relationshipType", value.asInstanceOf[js.Any])
  }
}
