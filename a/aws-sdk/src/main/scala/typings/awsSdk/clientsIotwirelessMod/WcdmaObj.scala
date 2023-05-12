package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WcdmaObj extends StObject {
  
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
    * Received Signal Code Power (signal power) (dBm).
    */
  var Rscp: js.UndefOr[RSCP] = js.undefined
  
  /**
    * UTRAN (UMTS Terrestrial Radio Access Network) Cell Global Identifier.
    */
  var UtranCid: typings.awsSdk.clientsIotwirelessMod.UtranCid
  
  /**
    * WCDMA local ID information.
    */
  var WcdmaLocalId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.WcdmaLocalId] = js.undefined
  
  /**
    * WCDMA object for network measurement reports.
    */
  var WcdmaNmr: js.UndefOr[WcdmaNmrList] = js.undefined
}
object WcdmaObj {
  
  inline def apply(Mcc: MCC, Mnc: MNC, UtranCid: UtranCid): WcdmaObj = {
    val __obj = js.Dynamic.literal(Mcc = Mcc.asInstanceOf[js.Any], Mnc = Mnc.asInstanceOf[js.Any], UtranCid = UtranCid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WcdmaObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WcdmaObj] (val x: Self) extends AnyVal {
    
    inline def setLac(value: LAC): Self = StObject.set(x, "Lac", value.asInstanceOf[js.Any])
    
    inline def setLacUndefined: Self = StObject.set(x, "Lac", js.undefined)
    
    inline def setMcc(value: MCC): Self = StObject.set(x, "Mcc", value.asInstanceOf[js.Any])
    
    inline def setMnc(value: MNC): Self = StObject.set(x, "Mnc", value.asInstanceOf[js.Any])
    
    inline def setPathLoss(value: PathLoss): Self = StObject.set(x, "PathLoss", value.asInstanceOf[js.Any])
    
    inline def setPathLossUndefined: Self = StObject.set(x, "PathLoss", js.undefined)
    
    inline def setRscp(value: RSCP): Self = StObject.set(x, "Rscp", value.asInstanceOf[js.Any])
    
    inline def setRscpUndefined: Self = StObject.set(x, "Rscp", js.undefined)
    
    inline def setUtranCid(value: UtranCid): Self = StObject.set(x, "UtranCid", value.asInstanceOf[js.Any])
    
    inline def setWcdmaLocalId(value: WcdmaLocalId): Self = StObject.set(x, "WcdmaLocalId", value.asInstanceOf[js.Any])
    
    inline def setWcdmaLocalIdUndefined: Self = StObject.set(x, "WcdmaLocalId", js.undefined)
    
    inline def setWcdmaNmr(value: WcdmaNmrList): Self = StObject.set(x, "WcdmaNmr", value.asInstanceOf[js.Any])
    
    inline def setWcdmaNmrUndefined: Self = StObject.set(x, "WcdmaNmr", js.undefined)
    
    inline def setWcdmaNmrVarargs(value: WcdmaNmrObj*): Self = StObject.set(x, "WcdmaNmr", js.Array(value*))
  }
}
