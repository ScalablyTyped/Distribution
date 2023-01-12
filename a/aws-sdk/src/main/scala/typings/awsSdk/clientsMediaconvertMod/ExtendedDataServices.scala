package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedDataServices extends StObject {
  
  /**
    * The action to take on copy and redistribution control XDS packets.  If you select PASSTHROUGH, packets will not be changed. If you select STRIP, any packets will be removed in output captions.
    */
  var CopyProtectionAction: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.CopyProtectionAction] = js.undefined
  
  /**
    * The action to take on content advisory XDS packets.  If you select PASSTHROUGH, packets will not be changed. If you select STRIP, any packets will be removed in output captions.
    */
  var VchipAction: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.VchipAction] = js.undefined
}
object ExtendedDataServices {
  
  inline def apply(): ExtendedDataServices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedDataServices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedDataServices] (val x: Self) extends AnyVal {
    
    inline def setCopyProtectionAction(value: CopyProtectionAction): Self = StObject.set(x, "CopyProtectionAction", value.asInstanceOf[js.Any])
    
    inline def setCopyProtectionActionUndefined: Self = StObject.set(x, "CopyProtectionAction", js.undefined)
    
    inline def setVchipAction(value: VchipAction): Self = StObject.set(x, "VchipAction", value.asInstanceOf[js.Any])
    
    inline def setVchipActionUndefined: Self = StObject.set(x, "VchipAction", js.undefined)
  }
}
