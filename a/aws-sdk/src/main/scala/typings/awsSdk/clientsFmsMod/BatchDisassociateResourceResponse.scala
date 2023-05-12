package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateResourceResponse extends StObject {
  
  /**
    * The resources that failed to disassociate from the resource set.
    */
  var FailedItems: FailedItemList
  
  /**
    * A unique identifier for the resource set, used in a request to refer to the resource set.
    */
  var ResourceSetIdentifier: Identifier
}
object BatchDisassociateResourceResponse {
  
  inline def apply(FailedItems: FailedItemList, ResourceSetIdentifier: Identifier): BatchDisassociateResourceResponse = {
    val __obj = js.Dynamic.literal(FailedItems = FailedItems.asInstanceOf[js.Any], ResourceSetIdentifier = ResourceSetIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDisassociateResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedItems(value: FailedItemList): Self = StObject.set(x, "FailedItems", value.asInstanceOf[js.Any])
    
    inline def setFailedItemsVarargs(value: FailedItem*): Self = StObject.set(x, "FailedItems", js.Array(value*))
    
    inline def setResourceSetIdentifier(value: Identifier): Self = StObject.set(x, "ResourceSetIdentifier", value.asInstanceOf[js.Any])
  }
}
