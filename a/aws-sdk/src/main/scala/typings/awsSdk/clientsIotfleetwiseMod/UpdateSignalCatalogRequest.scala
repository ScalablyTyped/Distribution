package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSignalCatalogRequest extends StObject {
  
  /**
    *  A brief description of the signal catalog to update.
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    *  The name of the signal catalog to update. 
    */
  var name: resourceName
  
  /**
    *  A list of information about nodes to add to the signal catalog. 
    */
  var nodesToAdd: js.UndefOr[Nodes] = js.undefined
  
  /**
    *  A list of fullyQualifiedName of nodes to remove from the signal catalog. 
    */
  var nodesToRemove: js.UndefOr[NodePaths] = js.undefined
  
  /**
    *  A list of information about nodes to update in the signal catalog. 
    */
  var nodesToUpdate: js.UndefOr[Nodes] = js.undefined
}
object UpdateSignalCatalogRequest {
  
  inline def apply(name: resourceName): UpdateSignalCatalogRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSignalCatalogRequest]
  }
  
  extension [Self <: UpdateSignalCatalogRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodesToAdd(value: Nodes): Self = StObject.set(x, "nodesToAdd", value.asInstanceOf[js.Any])
    
    inline def setNodesToAddUndefined: Self = StObject.set(x, "nodesToAdd", js.undefined)
    
    inline def setNodesToAddVarargs(value: Node*): Self = StObject.set(x, "nodesToAdd", js.Array(value*))
    
    inline def setNodesToRemove(value: NodePaths): Self = StObject.set(x, "nodesToRemove", value.asInstanceOf[js.Any])
    
    inline def setNodesToRemoveUndefined: Self = StObject.set(x, "nodesToRemove", js.undefined)
    
    inline def setNodesToRemoveVarargs(value: NodePath*): Self = StObject.set(x, "nodesToRemove", js.Array(value*))
    
    inline def setNodesToUpdate(value: Nodes): Self = StObject.set(x, "nodesToUpdate", value.asInstanceOf[js.Any])
    
    inline def setNodesToUpdateUndefined: Self = StObject.set(x, "nodesToUpdate", js.undefined)
    
    inline def setNodesToUpdateVarargs(value: Node*): Self = StObject.set(x, "nodesToUpdate", js.Array(value*))
  }
}
