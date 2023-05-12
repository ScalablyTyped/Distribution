package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TdscdmaLocalId extends StObject {
  
  /**
    * Cell parameters for TD-SCDMA.
    */
  var CellParams: typings.awsSdk.clientsIotwirelessMod.CellParams
  
  /**
    * TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number (UARFCN).
    */
  var Uarfcn: UARFCN
}
object TdscdmaLocalId {
  
  inline def apply(CellParams: CellParams, Uarfcn: UARFCN): TdscdmaLocalId = {
    val __obj = js.Dynamic.literal(CellParams = CellParams.asInstanceOf[js.Any], Uarfcn = Uarfcn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TdscdmaLocalId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TdscdmaLocalId] (val x: Self) extends AnyVal {
    
    inline def setCellParams(value: CellParams): Self = StObject.set(x, "CellParams", value.asInstanceOf[js.Any])
    
    inline def setUarfcn(value: UARFCN): Self = StObject.set(x, "Uarfcn", value.asInstanceOf[js.Any])
  }
}
