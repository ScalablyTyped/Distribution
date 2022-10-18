package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationInstanceNodeInstancesResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
  
  /**
    * A list of node instances.
    */
  var NodeInstances: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NodeInstances] = js.undefined
}
object ListApplicationInstanceNodeInstancesResponse {
  
  inline def apply(): ListApplicationInstanceNodeInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationInstanceNodeInstancesResponse]
  }
  
  extension [Self <: ListApplicationInstanceNodeInstancesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNodeInstances(value: NodeInstances): Self = StObject.set(x, "NodeInstances", value.asInstanceOf[js.Any])
    
    inline def setNodeInstancesUndefined: Self = StObject.set(x, "NodeInstances", js.undefined)
    
    inline def setNodeInstancesVarargs(value: NodeInstance*): Self = StObject.set(x, "NodeInstances", js.Array(value*))
  }
}
