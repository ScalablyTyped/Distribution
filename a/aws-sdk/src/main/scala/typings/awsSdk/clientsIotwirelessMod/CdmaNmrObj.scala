package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CdmaNmrObj extends StObject {
  
  /**
    * CDMA base station ID (BSID).
    */
  var BaseStationId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.BaseStationId] = js.undefined
  
  /**
    * CDMA channel information.
    */
  var CdmaChannel: typings.awsSdk.clientsIotwirelessMod.CdmaChannel
  
  /**
    * Transmit power level of the pilot signal, measured in dBm (decibel-milliwatts).
    */
  var PilotPower: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.PilotPower] = js.undefined
  
  /**
    * Pseudo-noise offset, which is a characteristic of the signal from a cell on a radio tower.
    */
  var PnOffset: typings.awsSdk.clientsIotwirelessMod.PnOffset
}
object CdmaNmrObj {
  
  inline def apply(CdmaChannel: CdmaChannel, PnOffset: PnOffset): CdmaNmrObj = {
    val __obj = js.Dynamic.literal(CdmaChannel = CdmaChannel.asInstanceOf[js.Any], PnOffset = PnOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CdmaNmrObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CdmaNmrObj] (val x: Self) extends AnyVal {
    
    inline def setBaseStationId(value: BaseStationId): Self = StObject.set(x, "BaseStationId", value.asInstanceOf[js.Any])
    
    inline def setBaseStationIdUndefined: Self = StObject.set(x, "BaseStationId", js.undefined)
    
    inline def setCdmaChannel(value: CdmaChannel): Self = StObject.set(x, "CdmaChannel", value.asInstanceOf[js.Any])
    
    inline def setPilotPower(value: PilotPower): Self = StObject.set(x, "PilotPower", value.asInstanceOf[js.Any])
    
    inline def setPilotPowerUndefined: Self = StObject.set(x, "PilotPower", js.undefined)
    
    inline def setPnOffset(value: PnOffset): Self = StObject.set(x, "PnOffset", value.asInstanceOf[js.Any])
  }
}
