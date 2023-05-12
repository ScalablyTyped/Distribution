package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TdscdmaObj extends StObject {
  
  /**
    * Location Area Code.
    */
  var Lac: js.UndefOr[LAC] = js.undefined
  
  /**
    * Mobile Country Code.
    */
  var Mcc: MCC
  
  /**
    * Mobile Network Code.
    */
  var Mnc: MNC
  
  /**
    * Path loss, or path attenuation, is the reduction in power density of an electromagnetic wave as it propagates through space.
    */
  var PathLoss: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.PathLoss] = js.undefined
  
  /**
    * Signal power of the received signal (Received Signal Code Power), measured in decibel-milliwatts (dBm).
    */
  var Rscp: js.UndefOr[RSCP] = js.undefined
  
  /**
    * TD-SCDMA local identification (local ID) information.
    */
  var TdscdmaLocalId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.TdscdmaLocalId] = js.undefined
  
  /**
    * TD-SCDMA object for network measurement reports.
    */
  var TdscdmaNmr: js.UndefOr[TdscdmaNmrList] = js.undefined
  
  /**
    * TD-SCDMA Timing advance.
    */
  var TdscdmaTimingAdvance: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.TdscdmaTimingAdvance] = js.undefined
  
  /**
    * UTRAN (UMTS Terrestrial Radio Access Network) Cell Global Identifier.
    */
  var UtranCid: typings.awsSdk.clientsIotwirelessMod.UtranCid
}
object TdscdmaObj {
  
  inline def apply(Mcc: MCC, Mnc: MNC, UtranCid: UtranCid): TdscdmaObj = {
    val __obj = js.Dynamic.literal(Mcc = Mcc.asInstanceOf[js.Any], Mnc = Mnc.asInstanceOf[js.Any], UtranCid = UtranCid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TdscdmaObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TdscdmaObj] (val x: Self) extends AnyVal {
    
    inline def setLac(value: LAC): Self = StObject.set(x, "Lac", value.asInstanceOf[js.Any])
    
    inline def setLacUndefined: Self = StObject.set(x, "Lac", js.undefined)
    
    inline def setMcc(value: MCC): Self = StObject.set(x, "Mcc", value.asInstanceOf[js.Any])
    
    inline def setMnc(value: MNC): Self = StObject.set(x, "Mnc", value.asInstanceOf[js.Any])
    
    inline def setPathLoss(value: PathLoss): Self = StObject.set(x, "PathLoss", value.asInstanceOf[js.Any])
    
    inline def setPathLossUndefined: Self = StObject.set(x, "PathLoss", js.undefined)
    
    inline def setRscp(value: RSCP): Self = StObject.set(x, "Rscp", value.asInstanceOf[js.Any])
    
    inline def setRscpUndefined: Self = StObject.set(x, "Rscp", js.undefined)
    
    inline def setTdscdmaLocalId(value: TdscdmaLocalId): Self = StObject.set(x, "TdscdmaLocalId", value.asInstanceOf[js.Any])
    
    inline def setTdscdmaLocalIdUndefined: Self = StObject.set(x, "TdscdmaLocalId", js.undefined)
    
    inline def setTdscdmaNmr(value: TdscdmaNmrList): Self = StObject.set(x, "TdscdmaNmr", value.asInstanceOf[js.Any])
    
    inline def setTdscdmaNmrUndefined: Self = StObject.set(x, "TdscdmaNmr", js.undefined)
    
    inline def setTdscdmaNmrVarargs(value: TdscdmaNmrObj*): Self = StObject.set(x, "TdscdmaNmr", js.Array(value*))
    
    inline def setTdscdmaTimingAdvance(value: TdscdmaTimingAdvance): Self = StObject.set(x, "TdscdmaTimingAdvance", value.asInstanceOf[js.Any])
    
    inline def setTdscdmaTimingAdvanceUndefined: Self = StObject.set(x, "TdscdmaTimingAdvance", js.undefined)
    
    inline def setUtranCid(value: UtranCid): Self = StObject.set(x, "UtranCid", value.asInstanceOf[js.Any])
  }
}
