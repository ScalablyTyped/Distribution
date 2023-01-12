package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSignalCatalogRequest extends StObject {
  
  /**
    * A brief description of the signal catalog.
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    *  The name of the signal catalog to create. 
    */
  var name: resourceName
  
  /**
    *  A list of information about nodes, which are a general abstraction of signals. For more information, see the API data type.
    */
  var nodes: js.UndefOr[Nodes] = js.undefined
  
  /**
    * Metadata that can be used to manage the signal catalog.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateSignalCatalogRequest {
  
  inline def apply(name: resourceName): CreateSignalCatalogRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSignalCatalogRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSignalCatalogRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: Nodes): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
