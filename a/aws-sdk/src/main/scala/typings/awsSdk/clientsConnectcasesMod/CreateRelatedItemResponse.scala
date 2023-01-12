package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRelatedItemResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the related item.
    */
  var relatedItemArn: RelatedItemArn
  
  /**
    * The unique identifier of the related item.
    */
  var relatedItemId: RelatedItemId
}
object CreateRelatedItemResponse {
  
  inline def apply(relatedItemArn: RelatedItemArn, relatedItemId: RelatedItemId): CreateRelatedItemResponse = {
    val __obj = js.Dynamic.literal(relatedItemArn = relatedItemArn.asInstanceOf[js.Any], relatedItemId = relatedItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRelatedItemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRelatedItemResponse] (val x: Self) extends AnyVal {
    
    inline def setRelatedItemArn(value: RelatedItemArn): Self = StObject.set(x, "relatedItemArn", value.asInstanceOf[js.Any])
    
    inline def setRelatedItemId(value: RelatedItemId): Self = StObject.set(x, "relatedItemId", value.asInstanceOf[js.Any])
  }
}
