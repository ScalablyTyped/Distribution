package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchThingsRequest extends StObject {
  
  /**
    * The ID of the entity to which the things are associated. The IDs should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME 
    */
  var entityId: Urn
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object SearchThingsRequest {
  
  inline def apply(entityId: Urn): SearchThingsRequest = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchThingsRequest]
  }
  
  extension [Self <: SearchThingsRequest](x: Self) {
    
    inline def setEntityId(value: Urn): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNamespaceVersion(value: Version): Self = StObject.set(x, "namespaceVersion", value.asInstanceOf[js.Any])
    
    inline def setNamespaceVersionUndefined: Self = StObject.set(x, "namespaceVersion", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
