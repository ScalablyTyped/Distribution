package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAbpV11 extends StObject {
  
  /**
    * The FCnt init value.
    */
  var FCntStart: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FCntStart] = js.undefined
}
object UpdateAbpV11 {
  
  inline def apply(): UpdateAbpV11 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAbpV11]
  }
  
  extension [Self <: UpdateAbpV11](x: Self) {
    
    inline def setFCntStart(value: FCntStart): Self = StObject.set(x, "FCntStart", value.asInstanceOf[js.Any])
    
    inline def setFCntStartUndefined: Self = StObject.set(x, "FCntStart", js.undefined)
  }
}
