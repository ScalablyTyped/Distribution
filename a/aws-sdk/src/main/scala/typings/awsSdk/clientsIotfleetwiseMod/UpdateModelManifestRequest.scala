package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateModelManifestRequest extends StObject {
  
  /**
    *  A brief description of the vehicle model. 
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    *  The name of the vehicle model to update. 
    */
  var name: resourceName
  
  /**
    *  A list of fullyQualifiedName of nodes, which are a general abstraction of signals, to add to the vehicle model. 
    */
  var nodesToAdd: js.UndefOr[NodePaths] = js.undefined
  
  /**
    *  A list of fullyQualifiedName of nodes, which are a general abstraction of signals, to remove from the vehicle model. 
    */
  var nodesToRemove: js.UndefOr[NodePaths] = js.undefined
  
  /**
    *  The state of the vehicle model. If the status is ACTIVE, the vehicle model can't be edited. If the status is DRAFT, you can edit the vehicle model. 
    */
  var status: js.UndefOr[ManifestStatus] = js.undefined
}
object UpdateModelManifestRequest {
  
  inline def apply(name: resourceName): UpdateModelManifestRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelManifestRequest]
  }
  
  extension [Self <: UpdateModelManifestRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodesToAdd(value: NodePaths): Self = StObject.set(x, "nodesToAdd", value.asInstanceOf[js.Any])
    
    inline def setNodesToAddUndefined: Self = StObject.set(x, "nodesToAdd", js.undefined)
    
    inline def setNodesToAddVarargs(value: NodePath*): Self = StObject.set(x, "nodesToAdd", js.Array(value*))
    
    inline def setNodesToRemove(value: NodePaths): Self = StObject.set(x, "nodesToRemove", value.asInstanceOf[js.Any])
    
    inline def setNodesToRemoveUndefined: Self = StObject.set(x, "nodesToRemove", js.undefined)
    
    inline def setNodesToRemoveVarargs(value: NodePath*): Self = StObject.set(x, "nodesToRemove", js.Array(value*))
    
    inline def setStatus(value: ManifestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
