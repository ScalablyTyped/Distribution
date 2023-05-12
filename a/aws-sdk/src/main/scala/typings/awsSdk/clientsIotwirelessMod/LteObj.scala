package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LteObj extends StObject {
  
  /**
    * E-UTRAN (Evolved Universal Terrestrial Radio Access Network) Cell Global Identifier.
    */
  var EutranCid: typings.awsSdk.clientsIotwirelessMod.EutranCid
  
  /**
    * LTE local identification (local ID) information.
    */
  var LteLocalId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.LteLocalId] = js.undefined
  
  /**
    * LTE object for network measurement reports.
    */
  var LteNmr: js.UndefOr[LteNmrList] = js.undefined
  
  /**
    * LTE timing advance.
    */
  var LteTimingAdvance: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.LteTimingAdvance] = js.undefined
  
  /**
    * Mobile Country Code.
    */
  var Mcc: MCC
  
  /**
    * Mobile Network Code.
    */
  var Mnc: MNC
  
  /**
    * Parameter that determines whether the LTE object is capable of supporting NR (new radio).
    */
  var NrCapable: js.UndefOr[NRCapable] = js.undefined
  
  /**
    * Signal power of the reference signal received, measured in dBm (decibel-milliwatts).
    */
  var Rsrp: js.UndefOr[RSRP] = js.undefined
  
  /**
    * Signal quality of the reference Signal received, measured in decibels (dB).
    */
  var Rsrq: js.UndefOr[RSRQ] = js.undefined
  
  /**
    * LTE tracking area code.
    */
  var Tac: js.UndefOr[TAC] = js.undefined
}
object LteObj {
  
  inline def apply(EutranCid: EutranCid, Mcc: MCC, Mnc: MNC): LteObj = {
    val __obj = js.Dynamic.literal(EutranCid = EutranCid.asInstanceOf[js.Any], Mcc = Mcc.asInstanceOf[js.Any], Mnc = Mnc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LteObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LteObj] (val x: Self) extends AnyVal {
    
    inline def setEutranCid(value: EutranCid): Self = StObject.set(x, "EutranCid", value.asInstanceOf[js.Any])
    
    inline def setLteLocalId(value: LteLocalId): Self = StObject.set(x, "LteLocalId", value.asInstanceOf[js.Any])
    
    inline def setLteLocalIdUndefined: Self = StObject.set(x, "LteLocalId", js.undefined)
    
    inline def setLteNmr(value: LteNmrList): Self = StObject.set(x, "LteNmr", value.asInstanceOf[js.Any])
    
    inline def setLteNmrUndefined: Self = StObject.set(x, "LteNmr", js.undefined)
    
    inline def setLteNmrVarargs(value: LteNmrObj*): Self = StObject.set(x, "LteNmr", js.Array(value*))
    
    inline def setLteTimingAdvance(value: LteTimingAdvance): Self = StObject.set(x, "LteTimingAdvance", value.asInstanceOf[js.Any])
    
    inline def setLteTimingAdvanceUndefined: Self = StObject.set(x, "LteTimingAdvance", js.undefined)
    
    inline def setMcc(value: MCC): Self = StObject.set(x, "Mcc", value.asInstanceOf[js.Any])
    
    inline def setMnc(value: MNC): Self = StObject.set(x, "Mnc", value.asInstanceOf[js.Any])
    
    inline def setNrCapable(value: NRCapable): Self = StObject.set(x, "NrCapable", value.asInstanceOf[js.Any])
    
    inline def setNrCapableUndefined: Self = StObject.set(x, "NrCapable", js.undefined)
    
    inline def setRsrp(value: RSRP): Self = StObject.set(x, "Rsrp", value.asInstanceOf[js.Any])
    
    inline def setRsrpUndefined: Self = StObject.set(x, "Rsrp", js.undefined)
    
    inline def setRsrq(value: RSRQ): Self = StObject.set(x, "Rsrq", value.asInstanceOf[js.Any])
    
    inline def setRsrqUndefined: Self = StObject.set(x, "Rsrq", js.undefined)
    
    inline def setTac(value: TAC): Self = StObject.set(x, "Tac", value.asInstanceOf[js.Any])
    
    inline def setTacUndefined: Self = StObject.set(x, "Tac", js.undefined)
  }
}
