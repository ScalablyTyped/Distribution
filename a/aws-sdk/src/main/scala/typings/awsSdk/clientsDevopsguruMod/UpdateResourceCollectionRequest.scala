package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceCollectionRequest extends StObject {
  
  /**
    *  Specifies if the resource collection in the request is added or deleted to the resource collection. 
    */
  var Action: UpdateResourceCollectionAction
  
  var ResourceCollection: UpdateResourceCollectionFilter
}
object UpdateResourceCollectionRequest {
  
  inline def apply(Action: UpdateResourceCollectionAction, ResourceCollection: UpdateResourceCollectionFilter): UpdateResourceCollectionRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ResourceCollection = ResourceCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceCollectionRequest]
  }
  
  extension [Self <: UpdateResourceCollectionRequest](x: Self) {
    
    inline def setAction(value: UpdateResourceCollectionAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setResourceCollection(value: UpdateResourceCollectionFilter): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
  }
}
