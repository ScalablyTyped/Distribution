package typings.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHostsOutput extends StObject {
  
  /**
    * A list of hosts and the details for each host, such as status, endpoint, and provider type.
    */
  var Hosts: js.UndefOr[HostList] = js.undefined
  
  /**
    * A token that can be used in the next ListHosts call. To view all items in the list, continue to call this operation with each subsequent token until no more nextToken values are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.NextToken] = js.undefined
}
object ListHostsOutput {
  
  inline def apply(): ListHostsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHostsOutput]
  }
  
  extension [Self <: ListHostsOutput](x: Self) {
    
    inline def setHosts(value: HostList): Self = StObject.set(x, "Hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "Hosts", js.undefined)
    
    inline def setHostsVarargs(value: Host*): Self = StObject.set(x, "Hosts", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
