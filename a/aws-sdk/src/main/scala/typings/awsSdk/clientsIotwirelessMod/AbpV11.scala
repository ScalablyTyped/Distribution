package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbpV11 extends StObject {
  
  /**
    * The DevAddr value.
    */
  var DevAddr: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DevAddr] = js.undefined
  
  /**
    * The FCnt init value.
    */
  var FCntStart: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FCntStart] = js.undefined
  
  /**
    * Session keys for ABP v1.1
    */
  var SessionKeys: js.UndefOr[SessionKeysAbpV11] = js.undefined
}
object AbpV11 {
  
  inline def apply(): AbpV11 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbpV11]
  }
  
  extension [Self <: AbpV11](x: Self) {
    
    inline def setDevAddr(value: DevAddr): Self = StObject.set(x, "DevAddr", value.asInstanceOf[js.Any])
    
    inline def setDevAddrUndefined: Self = StObject.set(x, "DevAddr", js.undefined)
    
    inline def setFCntStart(value: FCntStart): Self = StObject.set(x, "FCntStart", value.asInstanceOf[js.Any])
    
    inline def setFCntStartUndefined: Self = StObject.set(x, "FCntStart", js.undefined)
    
    inline def setSessionKeys(value: SessionKeysAbpV11): Self = StObject.set(x, "SessionKeys", value.asInstanceOf[js.Any])
    
    inline def setSessionKeysUndefined: Self = StObject.set(x, "SessionKeys", js.undefined)
  }
}
