package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelManifestRequest extends StObject {
  
  /**
    *  A brief description of the vehicle model. 
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    *  The name of the vehicle model to create.
    */
  var name: resourceName
  
  /**
    *  A list of nodes, which are a general abstraction of signals. 
    */
  var nodes: listOfStrings
  
  /**
    *  The Amazon Resource Name (ARN) of a signal catalog. 
    */
  var signalCatalogArn: arn
  
  /**
    * Metadata that can be used to manage the vehicle model.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateModelManifestRequest {
  
  inline def apply(name: resourceName, nodes: listOfStrings, signalCatalogArn: arn): CreateModelManifestRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], signalCatalogArn = signalCatalogArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelManifestRequest]
  }
  
  extension [Self <: CreateModelManifestRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: listOfStrings): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: java.lang.String*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setSignalCatalogArn(value: arn): Self = StObject.set(x, "signalCatalogArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
