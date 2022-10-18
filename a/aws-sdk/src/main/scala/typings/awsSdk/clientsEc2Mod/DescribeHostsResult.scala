package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHostsResult extends StObject {
  
  /**
    * Information about the Dedicated Hosts.
    */
  var Hosts: js.UndefOr[HostList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeHostsResult {
  
  inline def apply(): DescribeHostsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHostsResult]
  }
  
  extension [Self <: DescribeHostsResult](x: Self) {
    
    inline def setHosts(value: HostList): Self = StObject.set(x, "Hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "Hosts", js.undefined)
    
    inline def setHostsVarargs(value: Host*): Self = StObject.set(x, "Hosts", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
