package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDiscovery extends StObject {
  
  /**
    * Specifies any Cloud Map information for the virtual node.
    */
  var awsCloudMap: js.UndefOr[AwsCloudMapServiceDiscovery] = js.undefined
  
  /**
    * Specifies the DNS information for the virtual node.
    */
  var dns: js.UndefOr[DnsServiceDiscovery] = js.undefined
}
object ServiceDiscovery {
  
  inline def apply(): ServiceDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceDiscovery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceDiscovery] (val x: Self) extends AnyVal {
    
    inline def setAwsCloudMap(value: AwsCloudMapServiceDiscovery): Self = StObject.set(x, "awsCloudMap", value.asInstanceOf[js.Any])
    
    inline def setAwsCloudMapUndefined: Self = StObject.set(x, "awsCloudMap", js.undefined)
    
    inline def setDns(value: DnsServiceDiscovery): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    inline def setDnsUndefined: Self = StObject.set(x, "dns", js.undefined)
  }
}
