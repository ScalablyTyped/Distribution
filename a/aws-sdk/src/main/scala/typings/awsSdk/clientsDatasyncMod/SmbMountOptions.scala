package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmbMountOptions extends StObject {
  
  /**
    * By default, DataSync automatically chooses an SMB protocol version based on negotiation with your SMB file server. You also can configure DataSync to use a specific SMB version, but we recommend doing this only if DataSync has trouble negotiating with the SMB file server automatically. These are the following options for configuring the SMB version:    AUTOMATIC (default): DataSync and the SMB file server negotiate the highest version of SMB that they mutually support between 2.1 and 3.1.1. This is the recommended option. If you instead choose a specific version that your file server doesn't support, you may get an Operation Not Supported error.    SMB3: Restricts the protocol negotiation to only SMB version 3.0.2.    SMB2: Restricts the protocol negotiation to only SMB version 2.1.    SMB2_0: Restricts the protocol negotiation to only SMB version 2.0.    SMB1: Restricts the protocol negotiation to only SMB version 1.0.  The SMB1 option isn't available when creating an Amazon FSx for NetApp ONTAP location.   
    */
  var Version: js.UndefOr[SmbVersion] = js.undefined
}
object SmbMountOptions {
  
  inline def apply(): SmbMountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmbMountOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmbMountOptions] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: SmbVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
