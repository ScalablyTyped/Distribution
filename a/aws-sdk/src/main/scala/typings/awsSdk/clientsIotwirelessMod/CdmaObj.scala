package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CdmaObj extends StObject {
  
  /**
    * CDMA base station latitude in degrees.
    */
  var BaseLat: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.BaseLat] = js.undefined
  
  /**
    * CDMA base station longitude in degrees.
    */
  var BaseLng: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.BaseLng] = js.undefined
  
  /**
    * CDMA base station ID (BSID).
    */
  var BaseStationId: typings.awsSdk.clientsIotwirelessMod.BaseStationId
  
  /**
    * CDMA local identification (local ID) parameters.
    */
  var CdmaLocalId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.CdmaLocalId] = js.undefined
  
  /**
    * CDMA network measurement reports.
    */
  var CdmaNmr: js.UndefOr[CdmaNmrList] = js.undefined
  
  /**
    * CDMA network ID (NID).
    */
  var NetworkId: typings.awsSdk.clientsIotwirelessMod.NetworkId
  
  /**
    * Transmit power level of the pilot signal, measured in dBm (decibel-milliwatts).
    */
  var PilotPower: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.PilotPower] = js.undefined
  
  /**
    * CDMA registration zone (RZ).
    */
  var RegistrationZone: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.RegistrationZone] = js.undefined
  
  /**
    * CDMA system ID (SID).
    */
  var SystemId: typings.awsSdk.clientsIotwirelessMod.SystemId
}
object CdmaObj {
  
  inline def apply(BaseStationId: BaseStationId, NetworkId: NetworkId, SystemId: SystemId): CdmaObj = {
    val __obj = js.Dynamic.literal(BaseStationId = BaseStationId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], SystemId = SystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CdmaObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CdmaObj] (val x: Self) extends AnyVal {
    
    inline def setBaseLat(value: BaseLat): Self = StObject.set(x, "BaseLat", value.asInstanceOf[js.Any])
    
    inline def setBaseLatUndefined: Self = StObject.set(x, "BaseLat", js.undefined)
    
    inline def setBaseLng(value: BaseLng): Self = StObject.set(x, "BaseLng", value.asInstanceOf[js.Any])
    
    inline def setBaseLngUndefined: Self = StObject.set(x, "BaseLng", js.undefined)
    
    inline def setBaseStationId(value: BaseStationId): Self = StObject.set(x, "BaseStationId", value.asInstanceOf[js.Any])
    
    inline def setCdmaLocalId(value: CdmaLocalId): Self = StObject.set(x, "CdmaLocalId", value.asInstanceOf[js.Any])
    
    inline def setCdmaLocalIdUndefined: Self = StObject.set(x, "CdmaLocalId", js.undefined)
    
    inline def setCdmaNmr(value: CdmaNmrList): Self = StObject.set(x, "CdmaNmr", value.asInstanceOf[js.Any])
    
    inline def setCdmaNmrUndefined: Self = StObject.set(x, "CdmaNmr", js.undefined)
    
    inline def setCdmaNmrVarargs(value: CdmaNmrObj*): Self = StObject.set(x, "CdmaNmr", js.Array(value*))
    
    inline def setNetworkId(value: NetworkId): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setPilotPower(value: PilotPower): Self = StObject.set(x, "PilotPower", value.asInstanceOf[js.Any])
    
    inline def setPilotPowerUndefined: Self = StObject.set(x, "PilotPower", js.undefined)
    
    inline def setRegistrationZone(value: RegistrationZone): Self = StObject.set(x, "RegistrationZone", value.asInstanceOf[js.Any])
    
    inline def setRegistrationZoneUndefined: Self = StObject.set(x, "RegistrationZone", js.undefined)
    
    inline def setSystemId(value: SystemId): Self = StObject.set(x, "SystemId", value.asInstanceOf[js.Any])
  }
}
