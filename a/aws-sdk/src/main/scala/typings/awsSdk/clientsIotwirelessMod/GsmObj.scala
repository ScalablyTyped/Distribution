package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GsmObj extends StObject {
  
  /**
    * GERAN (GSM EDGE Radio Access Network) Cell Global Identifier.
    */
  var GeranCid: typings.awsSdk.clientsIotwirelessMod.GeranCid
  
  /**
    * GSM local identification (local ID) information.
    */
  var GsmLocalId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.GsmLocalId] = js.undefined
  
  /**
    * GSM object for network measurement reports.
    */
  var GsmNmr: js.UndefOr[GsmNmrList] = js.undefined
  
  /**
    * Timing advance value, which corresponds to the length of time a signal takes to reach the base station from a mobile phone.
    */
  var GsmTimingAdvance: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.GsmTimingAdvance] = js.undefined
  
  /**
    * Location area code.
    */
  var Lac: LAC
  
  /**
    * Mobile Country Code.
    */
  var Mcc: MCC
  
  /**
    * Mobile Network Code.
    */
  var Mnc: MNC
  
  /**
    * Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
    */
  var RxLevel: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.RxLevel] = js.undefined
}
object GsmObj {
  
  inline def apply(GeranCid: GeranCid, Lac: LAC, Mcc: MCC, Mnc: MNC): GsmObj = {
    val __obj = js.Dynamic.literal(GeranCid = GeranCid.asInstanceOf[js.Any], Lac = Lac.asInstanceOf[js.Any], Mcc = Mcc.asInstanceOf[js.Any], Mnc = Mnc.asInstanceOf[js.Any])
    __obj.asInstanceOf[GsmObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GsmObj] (val x: Self) extends AnyVal {
    
    inline def setGeranCid(value: GeranCid): Self = StObject.set(x, "GeranCid", value.asInstanceOf[js.Any])
    
    inline def setGsmLocalId(value: GsmLocalId): Self = StObject.set(x, "GsmLocalId", value.asInstanceOf[js.Any])
    
    inline def setGsmLocalIdUndefined: Self = StObject.set(x, "GsmLocalId", js.undefined)
    
    inline def setGsmNmr(value: GsmNmrList): Self = StObject.set(x, "GsmNmr", value.asInstanceOf[js.Any])
    
    inline def setGsmNmrUndefined: Self = StObject.set(x, "GsmNmr", js.undefined)
    
    inline def setGsmNmrVarargs(value: GsmNmrObj*): Self = StObject.set(x, "GsmNmr", js.Array(value*))
    
    inline def setGsmTimingAdvance(value: GsmTimingAdvance): Self = StObject.set(x, "GsmTimingAdvance", value.asInstanceOf[js.Any])
    
    inline def setGsmTimingAdvanceUndefined: Self = StObject.set(x, "GsmTimingAdvance", js.undefined)
    
    inline def setLac(value: LAC): Self = StObject.set(x, "Lac", value.asInstanceOf[js.Any])
    
    inline def setMcc(value: MCC): Self = StObject.set(x, "Mcc", value.asInstanceOf[js.Any])
    
    inline def setMnc(value: MNC): Self = StObject.set(x, "Mnc", value.asInstanceOf[js.Any])
    
    inline def setRxLevel(value: RxLevel): Self = StObject.set(x, "RxLevel", value.asInstanceOf[js.Any])
    
    inline def setRxLevelUndefined: Self = StObject.set(x, "RxLevel", js.undefined)
  }
}
