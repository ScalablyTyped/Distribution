package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceInstancesOutput extends StObject {
  
  /**
    * A token that indicates the location of the next service instance in the array of service instances, after the current requested list of service instances.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of service instances with summary data.
    */
  var serviceInstances: ServiceInstanceSummaryList
}
object ListServiceInstancesOutput {
  
  inline def apply(serviceInstances: ServiceInstanceSummaryList): ListServiceInstancesOutput = {
    val __obj = js.Dynamic.literal(serviceInstances = serviceInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceInstancesOutput]
  }
  
  extension [Self <: ListServiceInstancesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServiceInstances(value: ServiceInstanceSummaryList): Self = StObject.set(x, "serviceInstances", value.asInstanceOf[js.Any])
    
    inline def setServiceInstancesVarargs(value: ServiceInstanceSummary*): Self = StObject.set(x, "serviceInstances", js.Array(value*))
  }
}
