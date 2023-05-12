package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LteLocalId extends StObject {
  
  /**
    * Evolved universal terrestrial radio access (E-UTRA) absolute radio frequency channel number (FCN).
    */
  var Earfcn: EARFCN
  
  /**
    * Physical cell ID.
    */
  var Pci: PCI
}
object LteLocalId {
  
  inline def apply(Earfcn: EARFCN, Pci: PCI): LteLocalId = {
    val __obj = js.Dynamic.literal(Earfcn = Earfcn.asInstanceOf[js.Any], Pci = Pci.asInstanceOf[js.Any])
    __obj.asInstanceOf[LteLocalId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LteLocalId] (val x: Self) extends AnyVal {
    
    inline def setEarfcn(value: EARFCN): Self = StObject.set(x, "Earfcn", value.asInstanceOf[js.Any])
    
    inline def setPci(value: PCI): Self = StObject.set(x, "Pci", value.asInstanceOf[js.Any])
  }
}
