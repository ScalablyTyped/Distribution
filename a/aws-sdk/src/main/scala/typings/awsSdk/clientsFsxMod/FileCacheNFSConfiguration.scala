package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCacheNFSConfiguration extends StObject {
  
  /**
    * A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The provided IP addresses can either be the IP addresses of a DNS forwarder or resolver that the customer manages and runs inside the customer VPC, or the IP addresses of the on-premises DNS servers.
    */
  var DnsIps: js.UndefOr[RepositoryDnsIps] = js.undefined
  
  /**
    * The version of the NFS (Network File System) protocol of the NFS data repository. The only supported value is NFS3, which indicates that the data repository must support the NFSv3 protocol.
    */
  var Version: NfsVersion
}
object FileCacheNFSConfiguration {
  
  inline def apply(Version: NfsVersion): FileCacheNFSConfiguration = {
    val __obj = js.Dynamic.literal(Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCacheNFSConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileCacheNFSConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDnsIps(value: RepositoryDnsIps): Self = StObject.set(x, "DnsIps", value.asInstanceOf[js.Any])
    
    inline def setDnsIpsUndefined: Self = StObject.set(x, "DnsIps", js.undefined)
    
    inline def setDnsIpsVarargs(value: IpAddress*): Self = StObject.set(x, "DnsIps", js.Array(value*))
    
    inline def setVersion(value: NfsVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
