package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CdmaLocalId extends StObject {
  
  /**
    * CDMA channel information.
    */
  var CdmaChannel: typings.awsSdk.clientsIotwirelessMod.CdmaChannel
  
  /**
    * Pseudo-noise offset, which is a characteristic of the signal from a cell on a radio tower.
    */
  var PnOffset: typings.awsSdk.clientsIotwirelessMod.PnOffset
}
object CdmaLocalId {
  
  inline def apply(CdmaChannel: CdmaChannel, PnOffset: PnOffset): CdmaLocalId = {
    val __obj = js.Dynamic.literal(CdmaChannel = CdmaChannel.asInstanceOf[js.Any], PnOffset = PnOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CdmaLocalId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CdmaLocalId] (val x: Self) extends AnyVal {
    
    inline def setCdmaChannel(value: CdmaChannel): Self = StObject.set(x, "CdmaChannel", value.asInstanceOf[js.Any])
    
    inline def setPnOffset(value: PnOffset): Self = StObject.set(x, "PnOffset", value.asInstanceOf[js.Any])
  }
}
