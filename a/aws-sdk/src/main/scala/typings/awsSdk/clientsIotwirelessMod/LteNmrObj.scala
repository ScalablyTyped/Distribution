package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LteNmrObj extends StObject {
  
  /**
    * E-UTRA (Evolved universal terrestrial Radio Access) absolute radio frequency channel Number (EARFCN).
    */
  var Earfcn: EARFCN
  
  /**
    * E-UTRAN (Evolved Universal Terrestrial Radio Access Network) cell global identifier (EUTRANCID).
    */
  var EutranCid: typings.awsSdk.clientsIotwirelessMod.EutranCid
  
  /**
    * Physical cell ID.
    */
  var Pci: PCI
  
  /**
    * Signal power of the reference signal received, measured in dBm (decibel-milliwatts).
    */
  var Rsrp: js.UndefOr[RSRP] = js.undefined
  
  /**
    * Signal quality of the reference Signal received, measured in decibels (dB).
    */
  var Rsrq: js.UndefOr[RSRQ] = js.undefined
}
object LteNmrObj {
  
  inline def apply(Earfcn: EARFCN, EutranCid: EutranCid, Pci: PCI): LteNmrObj = {
    val __obj = js.Dynamic.literal(Earfcn = Earfcn.asInstanceOf[js.Any], EutranCid = EutranCid.asInstanceOf[js.Any], Pci = Pci.asInstanceOf[js.Any])
    __obj.asInstanceOf[LteNmrObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LteNmrObj] (val x: Self) extends AnyVal {
    
    inline def setEarfcn(value: EARFCN): Self = StObject.set(x, "Earfcn", value.asInstanceOf[js.Any])
    
    inline def setEutranCid(value: EutranCid): Self = StObject.set(x, "EutranCid", value.asInstanceOf[js.Any])
    
    inline def setPci(value: PCI): Self = StObject.set(x, "Pci", value.asInstanceOf[js.Any])
    
    inline def setRsrp(value: RSRP): Self = StObject.set(x, "Rsrp", value.asInstanceOf[js.Any])
    
    inline def setRsrpUndefined: Self = StObject.set(x, "Rsrp", js.undefined)
    
    inline def setRsrq(value: RSRQ): Self = StObject.set(x, "Rsrq", value.asInstanceOf[js.Any])
    
    inline def setRsrqUndefined: Self = StObject.set(x, "Rsrq", js.undefined)
  }
}
