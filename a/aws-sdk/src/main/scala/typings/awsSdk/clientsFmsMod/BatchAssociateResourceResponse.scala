package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateResourceResponse extends StObject {
  
  /**
    * The resources that failed to associate to the resource set.
    */
  var FailedItems: FailedItemList
  
  /**
    * A unique identifier for the resource set, used in a request to refer to the resource set.
    */
  var ResourceSetIdentifier: Identifier
}
object BatchAssociateResourceResponse {
  
  inline def apply(FailedItems: FailedItemList, ResourceSetIdentifier: Identifier): BatchAssociateResourceResponse = {
    val __obj = js.Dynamic.literal(FailedItems = FailedItems.asInstanceOf[js.Any], ResourceSetIdentifier = ResourceSetIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchAssociateResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedItems(value: FailedItemList): Self = StObject.set(x, "FailedItems", value.asInstanceOf[js.Any])
    
    inline def setFailedItemsVarargs(value: FailedItem*): Self = StObject.set(x, "FailedItems", js.Array(value*))
    
    inline def setResourceSetIdentifier(value: Identifier): Self = StObject.set(x, "ResourceSetIdentifier", value.asInstanceOf[js.Any])
  }
}
