package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beaconing extends StObject {
  
  /**
    * The data rate for gateways that are sending the beacons.
    */
  var DataRate: js.UndefOr[BeaconingDataRate] = js.undefined
  
  /**
    * The frequency list for the gateways to send the beacons.
    */
  var Frequencies: js.UndefOr[BeaconingFrequencies] = js.undefined
}
object Beaconing {
  
  inline def apply(): Beaconing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beaconing]
  }
  
  extension [Self <: Beaconing](x: Self) {
    
    inline def setDataRate(value: BeaconingDataRate): Self = StObject.set(x, "DataRate", value.asInstanceOf[js.Any])
    
    inline def setDataRateUndefined: Self = StObject.set(x, "DataRate", js.undefined)
    
    inline def setFrequencies(value: BeaconingFrequencies): Self = StObject.set(x, "Frequencies", value.asInstanceOf[js.Any])
    
    inline def setFrequenciesUndefined: Self = StObject.set(x, "Frequencies", js.undefined)
    
    inline def setFrequenciesVarargs(value: BeaconingFrequency*): Self = StObject.set(x, "Frequencies", js.Array(value*))
  }
}
