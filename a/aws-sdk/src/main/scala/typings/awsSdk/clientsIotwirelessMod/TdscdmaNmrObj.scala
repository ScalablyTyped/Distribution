package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TdscdmaNmrObj extends StObject {
  
  /**
    * Cell parameters for TD-SCDMA network measurement reports object.
    */
  var CellParams: typings.awsSdk.clientsIotwirelessMod.CellParams
  
  /**
    * Path loss, or path attenuation, is the reduction in power density of an electromagnetic wave as it propagates through space.
    */
  var PathLoss: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.PathLoss] = js.undefined
  
  /**
    * Code power of the received signal, measured in decibel-milliwatts (dBm).
    */
  var Rscp: js.UndefOr[RSCP] = js.undefined
  
  /**
    * TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number.
    */
  var Uarfcn: UARFCN
  
  /**
    * UTRAN (UMTS Terrestrial Radio Access Network) cell global identifier.
    */
  var UtranCid: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.UtranCid] = js.undefined
}
object TdscdmaNmrObj {
  
  inline def apply(CellParams: CellParams, Uarfcn: UARFCN): TdscdmaNmrObj = {
    val __obj = js.Dynamic.literal(CellParams = CellParams.asInstanceOf[js.Any], Uarfcn = Uarfcn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TdscdmaNmrObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TdscdmaNmrObj] (val x: Self) extends AnyVal {
    
    inline def setCellParams(value: CellParams): Self = StObject.set(x, "CellParams", value.asInstanceOf[js.Any])
    
    inline def setPathLoss(value: PathLoss): Self = StObject.set(x, "PathLoss", value.asInstanceOf[js.Any])
    
    inline def setPathLossUndefined: Self = StObject.set(x, "PathLoss", js.undefined)
    
    inline def setRscp(value: RSCP): Self = StObject.set(x, "Rscp", value.asInstanceOf[js.Any])
    
    inline def setRscpUndefined: Self = StObject.set(x, "Rscp", js.undefined)
    
    inline def setUarfcn(value: UARFCN): Self = StObject.set(x, "Uarfcn", value.asInstanceOf[js.Any])
    
    inline def setUtranCid(value: UtranCid): Self = StObject.set(x, "UtranCid", value.asInstanceOf[js.Any])
    
    inline def setUtranCidUndefined: Self = StObject.set(x, "UtranCid", js.undefined)
  }
}
