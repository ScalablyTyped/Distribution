package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoRaWANGateway extends StObject {
  
  /**
    * Beaconing object information, which consists of the data rate and frequency parameters.
    */
  var Beaconing: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Beaconing] = js.undefined
  
  /**
    * The gateway's EUI value.
    */
  var GatewayEui: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.GatewayEui] = js.undefined
  
  var JoinEuiFilters: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.JoinEuiFilters] = js.undefined
  
  /**
    * The MaxEIRP value.
    */
  var MaxEirp: js.UndefOr[GatewayMaxEirp] = js.undefined
  
  var NetIdFilters: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NetIdFilters] = js.undefined
  
  /**
    * The frequency band (RFRegion) value.
    */
  var RfRegion: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.RfRegion] = js.undefined
  
  var SubBands: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.SubBands] = js.undefined
}
object LoRaWANGateway {
  
  inline def apply(): LoRaWANGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoRaWANGateway]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoRaWANGateway] (val x: Self) extends AnyVal {
    
    inline def setBeaconing(value: Beaconing): Self = StObject.set(x, "Beaconing", value.asInstanceOf[js.Any])
    
    inline def setBeaconingUndefined: Self = StObject.set(x, "Beaconing", js.undefined)
    
    inline def setGatewayEui(value: GatewayEui): Self = StObject.set(x, "GatewayEui", value.asInstanceOf[js.Any])
    
    inline def setGatewayEuiUndefined: Self = StObject.set(x, "GatewayEui", js.undefined)
    
    inline def setJoinEuiFilters(value: JoinEuiFilters): Self = StObject.set(x, "JoinEuiFilters", value.asInstanceOf[js.Any])
    
    inline def setJoinEuiFiltersUndefined: Self = StObject.set(x, "JoinEuiFilters", js.undefined)
    
    inline def setJoinEuiFiltersVarargs(value: JoinEuiRange*): Self = StObject.set(x, "JoinEuiFilters", js.Array(value*))
    
    inline def setMaxEirp(value: GatewayMaxEirp): Self = StObject.set(x, "MaxEirp", value.asInstanceOf[js.Any])
    
    inline def setMaxEirpUndefined: Self = StObject.set(x, "MaxEirp", js.undefined)
    
    inline def setNetIdFilters(value: NetIdFilters): Self = StObject.set(x, "NetIdFilters", value.asInstanceOf[js.Any])
    
    inline def setNetIdFiltersUndefined: Self = StObject.set(x, "NetIdFilters", js.undefined)
    
    inline def setNetIdFiltersVarargs(value: NetId*): Self = StObject.set(x, "NetIdFilters", js.Array(value*))
    
    inline def setRfRegion(value: RfRegion): Self = StObject.set(x, "RfRegion", value.asInstanceOf[js.Any])
    
    inline def setRfRegionUndefined: Self = StObject.set(x, "RfRegion", js.undefined)
    
    inline def setSubBands(value: SubBands): Self = StObject.set(x, "SubBands", value.asInstanceOf[js.Any])
    
    inline def setSubBandsUndefined: Self = StObject.set(x, "SubBands", js.undefined)
    
    inline def setSubBandsVarargs(value: SubBand*): Self = StObject.set(x, "SubBands", js.Array(value*))
  }
}
