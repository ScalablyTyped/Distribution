package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsxProtocolNfs extends StObject {
  
  var MountOptions: js.UndefOr[NfsMountOptions] = js.undefined
}
object FsxProtocolNfs {
  
  inline def apply(): FsxProtocolNfs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FsxProtocolNfs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FsxProtocolNfs] (val x: Self) extends AnyVal {
    
    inline def setMountOptions(value: NfsMountOptions): Self = StObject.set(x, "MountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsUndefined: Self = StObject.set(x, "MountOptions", js.undefined)
  }
}
