package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenZFSClientConfiguration extends StObject {
  
  /**
    * A value that specifies who can mount the file system. You can provide a wildcard character (*), an IP address (0.0.0.0), or a CIDR address (192.0.2.0/24). By default, Amazon FSx uses the wildcard character when specifying the client. 
    */
  var Clients: OpenZFSClients
  
  /**
    * The options to use when mounting the file system. For a list of options that you can use with Network File System (NFS), see the exports(5) - Linux man page. When choosing your options, consider the following:    crossmnt is used by default. If you don't specify crossmnt when changing the client configuration, you won't be able to see or access snapshots in your file system's snapshot directory.    sync is used by default. If you instead specify async, the system acknowledges writes before writing to disk. If the system crashes before the writes are finished, you lose the unwritten data.   
    */
  var Options: OpenZFSNfsExportOptions
}
object OpenZFSClientConfiguration {
  
  inline def apply(Clients: OpenZFSClients, Options: OpenZFSNfsExportOptions): OpenZFSClientConfiguration = {
    val __obj = js.Dynamic.literal(Clients = Clients.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenZFSClientConfiguration]
  }
  
  extension [Self <: OpenZFSClientConfiguration](x: Self) {
    
    inline def setClients(value: OpenZFSClients): Self = StObject.set(x, "Clients", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: OpenZFSNfsExportOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: OpenZFSNfsExportOption*): Self = StObject.set(x, "Options", js.Array(value*))
  }
}
