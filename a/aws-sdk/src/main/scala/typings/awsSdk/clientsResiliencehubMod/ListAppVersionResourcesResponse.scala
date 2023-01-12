package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppVersionResourcesResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The physical resources in the application version.
    */
  var physicalResources: PhysicalResourceList
  
  /**
    * The identifier for a specific resolution.
    */
  var resolutionId: String255
}
object ListAppVersionResourcesResponse {
  
  inline def apply(physicalResources: PhysicalResourceList, resolutionId: String255): ListAppVersionResourcesResponse = {
    val __obj = js.Dynamic.literal(physicalResources = physicalResources.asInstanceOf[js.Any], resolutionId = resolutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppVersionResourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppVersionResourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPhysicalResources(value: PhysicalResourceList): Self = StObject.set(x, "physicalResources", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourcesVarargs(value: PhysicalResource*): Self = StObject.set(x, "physicalResources", js.Array(value*))
    
    inline def setResolutionId(value: String255): Self = StObject.set(x, "resolutionId", value.asInstanceOf[js.Any])
  }
}
