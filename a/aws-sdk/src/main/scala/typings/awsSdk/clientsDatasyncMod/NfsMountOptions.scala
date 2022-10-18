package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NfsMountOptions extends StObject {
  
  /**
    * Specifies the NFS version that you want DataSync to use when mounting your NFS share. If the server refuses to use the version specified, the task fails. You can specify the following options:    AUTOMATIC (default): DataSync chooses NFS version 4.1.    NFS3: Stateless protocol version that allows for asynchronous writes on the server.    NFSv4_0: Stateful, firewall-friendly protocol version that supports delegations and pseudo file systems.    NFSv4_1: Stateful protocol version that supports sessions, directory delegations, and parallel data processing. NFS version 4.1 also includes all features available in version 4.0.    DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations. 
    */
  var Version: js.UndefOr[NfsVersion] = js.undefined
}
object NfsMountOptions {
  
  inline def apply(): NfsMountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NfsMountOptions]
  }
  
  extension [Self <: NfsMountOptions](x: Self) {
    
    inline def setVersion(value: NfsVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
