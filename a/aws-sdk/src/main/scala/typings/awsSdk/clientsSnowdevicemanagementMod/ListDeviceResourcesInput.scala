package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceResourcesInput extends StObject {
  
  /**
    * The ID of the managed device that you are listing the resources of.
    */
  var managedDeviceId: ManagedDeviceId
  
  /**
    * The maximum number of resources per page.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A pagination token to continue to the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A structure used to filter the results by type of resource.
    */
  var `type`: js.UndefOr[ListDeviceResourcesInputTypeString] = js.undefined
}
object ListDeviceResourcesInput {
  
  inline def apply(managedDeviceId: ManagedDeviceId): ListDeviceResourcesInput = {
    val __obj = js.Dynamic.literal(managedDeviceId = managedDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceResourcesInput]
  }
  
  extension [Self <: ListDeviceResourcesInput](x: Self) {
    
    inline def setManagedDeviceId(value: ManagedDeviceId): Self = StObject.set(x, "managedDeviceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setType(value: ListDeviceResourcesInputTypeString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
