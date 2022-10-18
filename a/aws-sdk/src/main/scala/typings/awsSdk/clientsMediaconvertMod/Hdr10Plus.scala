package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hdr10Plus extends StObject {
  
  /**
    * Specify the HDR10+ mastering display normalized peak luminance, in nits. This is the normalized actual peak luminance of the mastering display, as defined by ST 2094-40.
    */
  var MasteringMonitorNits: js.UndefOr[integerMin0Max4000] = js.undefined
  
  /**
    * Specify the HDR10+ target display nominal peak luminance, in nits. This is the nominal maximum luminance of the target display as defined by ST 2094-40.
    */
  var TargetMonitorNits: js.UndefOr[integerMin0Max4000] = js.undefined
}
object Hdr10Plus {
  
  inline def apply(): Hdr10Plus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hdr10Plus]
  }
  
  extension [Self <: Hdr10Plus](x: Self) {
    
    inline def setMasteringMonitorNits(value: integerMin0Max4000): Self = StObject.set(x, "MasteringMonitorNits", value.asInstanceOf[js.Any])
    
    inline def setMasteringMonitorNitsUndefined: Self = StObject.set(x, "MasteringMonitorNits", js.undefined)
    
    inline def setTargetMonitorNits(value: integerMin0Max4000): Self = StObject.set(x, "TargetMonitorNits", value.asInstanceOf[js.Any])
    
    inline def setTargetMonitorNitsUndefined: Self = StObject.set(x, "TargetMonitorNits", js.undefined)
  }
}
