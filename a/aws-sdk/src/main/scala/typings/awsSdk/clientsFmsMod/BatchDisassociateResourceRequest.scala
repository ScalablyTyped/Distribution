package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateResourceRequest extends StObject {
  
  /**
    * The uniform resource identifiers (URI) of resources that should be disassociated from the resource set. The URIs must be Amazon Resource Names (ARNs).
    */
  var Items: IdentifierList
  
  /**
    * A unique identifier for the resource set, used in a TODO to refer to the resource set.
    */
  var ResourceSetIdentifier: Identifier
}
object BatchDisassociateResourceRequest {
  
  inline def apply(Items: IdentifierList, ResourceSetIdentifier: Identifier): BatchDisassociateResourceRequest = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], ResourceSetIdentifier = ResourceSetIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDisassociateResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setItems(value: IdentifierList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Identifier*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setResourceSetIdentifier(value: Identifier): Self = StObject.set(x, "ResourceSetIdentifier", value.asInstanceOf[js.Any])
  }
}
