package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDiscovery extends StObject {
  
  /**
    * Specifies any AWS Cloud Map information for the virtual node.
    */
  var awsCloudMap: js.UndefOr[AwsCloudMapServiceDiscovery] = js.undefined
  
  /**
    * Specifies the DNS information for the virtual node.
    */
  var dns: js.UndefOr[DnsServiceDiscovery] = js.undefined
}
object ServiceDiscovery {
  
  @scala.inline
  def apply(): ServiceDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceDiscovery]
  }
  
  @scala.inline
  implicit class ServiceDiscoveryMutableBuilder[Self <: ServiceDiscovery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsCloudMap(value: AwsCloudMapServiceDiscovery): Self = StObject.set(x, "awsCloudMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsCloudMapUndefined: Self = StObject.set(x, "awsCloudMap", js.undefined)
    
    @scala.inline
    def setDns(value: DnsServiceDiscovery): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsUndefined: Self = StObject.set(x, "dns", js.undefined)
  }
}
