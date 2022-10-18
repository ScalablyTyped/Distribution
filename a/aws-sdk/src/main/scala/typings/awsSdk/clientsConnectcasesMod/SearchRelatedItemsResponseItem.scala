package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRelatedItemsResponseItem extends StObject {
  
  /**
    * Time at which a related item was associated with a case.
    */
  var associationTime: js.Date
  
  /**
    * Represents the content of a particular type of related item.
    */
  var content: RelatedItemContent
  
  /**
    * Unique identifier of a related item.
    */
  var relatedItemId: RelatedItemId
  
  /**
    * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * Type of a related item.
    */
  var `type`: RelatedItemType
}
object SearchRelatedItemsResponseItem {
  
  inline def apply(
    associationTime: js.Date,
    content: RelatedItemContent,
    relatedItemId: RelatedItemId,
    `type`: RelatedItemType
  ): SearchRelatedItemsResponseItem = {
    val __obj = js.Dynamic.literal(associationTime = associationTime.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], relatedItemId = relatedItemId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRelatedItemsResponseItem]
  }
  
  extension [Self <: SearchRelatedItemsResponseItem](x: Self) {
    
    inline def setAssociationTime(value: js.Date): Self = StObject.set(x, "associationTime", value.asInstanceOf[js.Any])
    
    inline def setContent(value: RelatedItemContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setRelatedItemId(value: RelatedItemId): Self = StObject.set(x, "relatedItemId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: RelatedItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
