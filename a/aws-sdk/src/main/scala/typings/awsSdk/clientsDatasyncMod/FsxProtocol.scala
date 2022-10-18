package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsxProtocol extends StObject {
  
  /**
    * Specifies the Network File System (NFS) protocol configuration that DataSync uses to access your FSx for OpenZFS file system or FSx for ONTAP file system's storage virtual machine (SVM).
    */
  var NFS: js.UndefOr[FsxProtocolNfs] = js.undefined
  
  /**
    * Specifies the Server Message Block (SMB) protocol configuration that DataSync uses to access your FSx for ONTAP file system's SVM.
    */
  var SMB: js.UndefOr[FsxProtocolSmb] = js.undefined
}
object FsxProtocol {
  
  inline def apply(): FsxProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FsxProtocol]
  }
  
  extension [Self <: FsxProtocol](x: Self) {
    
    inline def setNFS(value: FsxProtocolNfs): Self = StObject.set(x, "NFS", value.asInstanceOf[js.Any])
    
    inline def setNFSUndefined: Self = StObject.set(x, "NFS", js.undefined)
    
    inline def setSMB(value: FsxProtocolSmb): Self = StObject.set(x, "SMB", value.asInstanceOf[js.Any])
    
    inline def setSMBUndefined: Self = StObject.set(x, "SMB", js.undefined)
  }
}
