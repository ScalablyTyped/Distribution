package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceInstancesInput extends StObject {
  
  /**
    * The maximum number of service instances to list.
    */
  var maxResults: js.UndefOr[MaxPageResults] = js.undefined
  
  /**
    * A token that indicates the location of the next service in the array of service instances, after the list of service instances that was previously requested.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of the service that the service instance belongs to.
    */
  var serviceName: js.UndefOr[ResourceName] = js.undefined
}
object ListServiceInstancesInput {
  
  inline def apply(): ListServiceInstancesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceInstancesInput]
  }
  
  extension [Self <: ListServiceInstancesInput](x: Self) {
    
    inline def setMaxResults(value: MaxPageResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
