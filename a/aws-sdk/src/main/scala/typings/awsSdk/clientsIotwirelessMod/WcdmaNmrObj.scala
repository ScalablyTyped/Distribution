package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WcdmaNmrObj extends StObject {
  
  /**
    * Path loss, or path attenuation, is the reduction in power density of an electromagnetic wave as it propagates through space.
    */
  var PathLoss: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.PathLoss] = js.undefined
  
  /**
    * Primary Scrambling Code.
    */
  var Psc: PSC
  
  /**
    * Received Signal Code Power (signal power) (dBm)
    */
  var Rscp: js.UndefOr[RSCP] = js.undefined
  
  /**
    * WCDMA UTRA Absolute RF Channel Number downlink.
    */
  var Uarfcndl: UARFCNDL
  
  /**
    * UTRAN (UMTS Terrestrial Radio Access Network) Cell Global Identifier.
    */
  var UtranCid: typings.awsSdk.clientsIotwirelessMod.UtranCid
}
object WcdmaNmrObj {
  
  inline def apply(Psc: PSC, Uarfcndl: UARFCNDL, UtranCid: UtranCid): WcdmaNmrObj = {
    val __obj = js.Dynamic.literal(Psc = Psc.asInstanceOf[js.Any], Uarfcndl = Uarfcndl.asInstanceOf[js.Any], UtranCid = UtranCid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WcdmaNmrObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WcdmaNmrObj] (val x: Self) extends AnyVal {
    
    inline def setPathLoss(value: PathLoss): Self = StObject.set(x, "PathLoss", value.asInstanceOf[js.Any])
    
    inline def setPathLossUndefined: Self = StObject.set(x, "PathLoss", js.undefined)
    
    inline def setPsc(value: PSC): Self = StObject.set(x, "Psc", value.asInstanceOf[js.Any])
    
    inline def setRscp(value: RSCP): Self = StObject.set(x, "Rscp", value.asInstanceOf[js.Any])
    
    inline def setRscpUndefined: Self = StObject.set(x, "Rscp", js.undefined)
    
    inline def setUarfcndl(value: UARFCNDL): Self = StObject.set(x, "Uarfcndl", value.asInstanceOf[js.Any])
    
    inline def setUtranCid(value: UtranCid): Self = StObject.set(x, "UtranCid", value.asInstanceOf[js.Any])
  }
}
