package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellTowers extends StObject {
  
  /**
    * CDMA object information.
    */
  var Cdma: js.UndefOr[CdmaList] = js.undefined
  
  /**
    * GSM object information.
    */
  var Gsm: js.UndefOr[GsmList] = js.undefined
  
  /**
    * LTE object information.
    */
  var Lte: js.UndefOr[LteList] = js.undefined
  
  /**
    * TD-SCDMA object information.
    */
  var Tdscdma: js.UndefOr[TdscdmaList] = js.undefined
  
  /**
    * WCDMA object information.
    */
  var Wcdma: js.UndefOr[WcdmaList] = js.undefined
}
object CellTowers {
  
  inline def apply(): CellTowers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellTowers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellTowers] (val x: Self) extends AnyVal {
    
    inline def setCdma(value: CdmaList): Self = StObject.set(x, "Cdma", value.asInstanceOf[js.Any])
    
    inline def setCdmaUndefined: Self = StObject.set(x, "Cdma", js.undefined)
    
    inline def setCdmaVarargs(value: CdmaObj*): Self = StObject.set(x, "Cdma", js.Array(value*))
    
    inline def setGsm(value: GsmList): Self = StObject.set(x, "Gsm", value.asInstanceOf[js.Any])
    
    inline def setGsmUndefined: Self = StObject.set(x, "Gsm", js.undefined)
    
    inline def setGsmVarargs(value: GsmObj*): Self = StObject.set(x, "Gsm", js.Array(value*))
    
    inline def setLte(value: LteList): Self = StObject.set(x, "Lte", value.asInstanceOf[js.Any])
    
    inline def setLteUndefined: Self = StObject.set(x, "Lte", js.undefined)
    
    inline def setLteVarargs(value: LteObj*): Self = StObject.set(x, "Lte", js.Array(value*))
    
    inline def setTdscdma(value: TdscdmaList): Self = StObject.set(x, "Tdscdma", value.asInstanceOf[js.Any])
    
    inline def setTdscdmaUndefined: Self = StObject.set(x, "Tdscdma", js.undefined)
    
    inline def setTdscdmaVarargs(value: TdscdmaObj*): Self = StObject.set(x, "Tdscdma", js.Array(value*))
    
    inline def setWcdma(value: WcdmaList): Self = StObject.set(x, "Wcdma", value.asInstanceOf[js.Any])
    
    inline def setWcdmaUndefined: Self = StObject.set(x, "Wcdma", js.undefined)
    
    inline def setWcdmaVarargs(value: WcdmaObj*): Self = StObject.set(x, "Wcdma", js.Array(value*))
  }
}
