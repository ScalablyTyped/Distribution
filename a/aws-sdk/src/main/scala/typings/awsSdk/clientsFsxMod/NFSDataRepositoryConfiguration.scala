package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NFSDataRepositoryConfiguration extends StObject {
  
  /**
    * This parameter is not supported for Amazon File Cache.
    */
  var AutoExportPolicy: js.UndefOr[typings.awsSdk.clientsFsxMod.AutoExportPolicy] = js.undefined
  
  /**
    * A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The provided IP addresses can either be the IP addresses of a DNS forwarder or resolver that the customer manages and runs inside the customer VPC, or the IP addresses of the on-premises DNS servers.
    */
  var DnsIps: js.UndefOr[RepositoryDnsIps] = js.undefined
  
  /**
    * The version of the NFS (Network File System) protocol of the NFS data repository. Currently, the only supported value is NFS3, which indicates that the data repository must support the NFSv3 protocol.
    */
  var Version: NfsVersion
}
object NFSDataRepositoryConfiguration {
  
  inline def apply(Version: NfsVersion): NFSDataRepositoryConfiguration = {
    val __obj = js.Dynamic.literal(Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NFSDataRepositoryConfiguration]
  }
  
  extension [Self <: NFSDataRepositoryConfiguration](x: Self) {
    
    inline def setAutoExportPolicy(value: AutoExportPolicy): Self = StObject.set(x, "AutoExportPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoExportPolicyUndefined: Self = StObject.set(x, "AutoExportPolicy", js.undefined)
    
    inline def setDnsIps(value: RepositoryDnsIps): Self = StObject.set(x, "DnsIps", value.asInstanceOf[js.Any])
    
    inline def setDnsIpsUndefined: Self = StObject.set(x, "DnsIps", js.undefined)
    
    inline def setDnsIpsVarargs(value: IpAddress*): Self = StObject.set(x, "DnsIps", js.Array(value*))
    
    inline def setVersion(value: NfsVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
