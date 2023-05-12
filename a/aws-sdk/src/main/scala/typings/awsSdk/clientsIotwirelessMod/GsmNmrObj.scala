package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GsmNmrObj extends StObject {
  
  /**
    * GSM broadcast control channel.
    */
  var Bcch: BCCH
  
  /**
    * GSM base station identity code (BSIC).
    */
  var Bsic: BSIC
  
  /**
    * Global identity information of the GSM object.
    */
  var GlobalIdentity: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.GlobalIdentity] = js.undefined
  
  /**
    * Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
    */
  var RxLevel: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.RxLevel] = js.undefined
}
object GsmNmrObj {
  
  inline def apply(Bcch: BCCH, Bsic: BSIC): GsmNmrObj = {
    val __obj = js.Dynamic.literal(Bcch = Bcch.asInstanceOf[js.Any], Bsic = Bsic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GsmNmrObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GsmNmrObj] (val x: Self) extends AnyVal {
    
    inline def setBcch(value: BCCH): Self = StObject.set(x, "Bcch", value.asInstanceOf[js.Any])
    
    inline def setBsic(value: BSIC): Self = StObject.set(x, "Bsic", value.asInstanceOf[js.Any])
    
    inline def setGlobalIdentity(value: GlobalIdentity): Self = StObject.set(x, "GlobalIdentity", value.asInstanceOf[js.Any])
    
    inline def setGlobalIdentityUndefined: Self = StObject.set(x, "GlobalIdentity", js.undefined)
    
    inline def setRxLevel(value: RxLevel): Self = StObject.set(x, "RxLevel", value.asInstanceOf[js.Any])
    
    inline def setRxLevelUndefined: Self = StObject.set(x, "RxLevel", js.undefined)
  }
}
