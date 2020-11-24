package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceDiscovery extends js.Object {
  
  /**
    * Specifies any AWS Cloud Map information for the virtual node.
    */
  var awsCloudMap: js.UndefOr[AwsCloudMapServiceDiscovery] = js.native
  
  /**
    * Specifies the DNS information for the virtual node.
    */
  var dns: js.UndefOr[DnsServiceDiscovery] = js.native
}
object ServiceDiscovery {
  
  @scala.inline
  def apply(): ServiceDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceDiscovery]
  }
  
  @scala.inline
  implicit class ServiceDiscoveryOps[Self <: ServiceDiscovery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsCloudMap(value: AwsCloudMapServiceDiscovery): Self = this.set("awsCloudMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsCloudMap: Self = this.set("awsCloudMap", js.undefined)
    
    @scala.inline
    def setDns(value: DnsServiceDiscovery): Self = this.set("dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDns: Self = this.set("dns", js.undefined)
  }
}
