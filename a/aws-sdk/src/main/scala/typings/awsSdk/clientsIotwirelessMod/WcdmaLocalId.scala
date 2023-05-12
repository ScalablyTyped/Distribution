package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WcdmaLocalId extends StObject {
  
  /**
    * Primary Scrambling Code.
    */
  var Psc: PSC
  
  /**
    * WCDMA UTRA Absolute RF Channel Number downlink.
    */
  var Uarfcndl: UARFCNDL
}
object WcdmaLocalId {
  
  inline def apply(Psc: PSC, Uarfcndl: UARFCNDL): WcdmaLocalId = {
    val __obj = js.Dynamic.literal(Psc = Psc.asInstanceOf[js.Any], Uarfcndl = Uarfcndl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WcdmaLocalId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WcdmaLocalId] (val x: Self) extends AnyVal {
    
    inline def setPsc(value: PSC): Self = StObject.set(x, "Psc", value.asInstanceOf[js.Any])
    
    inline def setUarfcndl(value: UARFCNDL): Self = StObject.set(x, "Uarfcndl", value.asInstanceOf[js.Any])
  }
}
