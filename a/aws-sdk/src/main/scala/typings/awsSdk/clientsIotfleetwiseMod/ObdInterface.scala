package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObdInterface extends StObject {
  
  /**
    * The maximum number message requests per diagnostic trouble code per second.
    */
  var dtcRequestIntervalSeconds: js.UndefOr[nonNegativeInteger] = js.undefined
  
  /**
    * Whether the vehicle has a transmission control module (TCM).
    */
  var hasTransmissionEcu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the interface.
    */
  var name: ObdInterfaceName
  
  /**
    * The standard OBD II PID.
    */
  var obdStandard: js.UndefOr[ObdStandard] = js.undefined
  
  /**
    * The maximum number message requests per second.
    */
  var pidRequestIntervalSeconds: js.UndefOr[nonNegativeInteger] = js.undefined
  
  /**
    * The ID of the message requesting vehicle data.
    */
  var requestMessageId: nonNegativeInteger
  
  /**
    * Whether to use extended IDs in the message.
    */
  var useExtendedIds: js.UndefOr[Boolean] = js.undefined
}
object ObdInterface {
  
  inline def apply(name: ObdInterfaceName, requestMessageId: nonNegativeInteger): ObdInterface = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], requestMessageId = requestMessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObdInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObdInterface] (val x: Self) extends AnyVal {
    
    inline def setDtcRequestIntervalSeconds(value: nonNegativeInteger): Self = StObject.set(x, "dtcRequestIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setDtcRequestIntervalSecondsUndefined: Self = StObject.set(x, "dtcRequestIntervalSeconds", js.undefined)
    
    inline def setHasTransmissionEcu(value: Boolean): Self = StObject.set(x, "hasTransmissionEcu", value.asInstanceOf[js.Any])
    
    inline def setHasTransmissionEcuUndefined: Self = StObject.set(x, "hasTransmissionEcu", js.undefined)
    
    inline def setName(value: ObdInterfaceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObdStandard(value: ObdStandard): Self = StObject.set(x, "obdStandard", value.asInstanceOf[js.Any])
    
    inline def setObdStandardUndefined: Self = StObject.set(x, "obdStandard", js.undefined)
    
    inline def setPidRequestIntervalSeconds(value: nonNegativeInteger): Self = StObject.set(x, "pidRequestIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setPidRequestIntervalSecondsUndefined: Self = StObject.set(x, "pidRequestIntervalSeconds", js.undefined)
    
    inline def setRequestMessageId(value: nonNegativeInteger): Self = StObject.set(x, "requestMessageId", value.asInstanceOf[js.Any])
    
    inline def setUseExtendedIds(value: Boolean): Self = StObject.set(x, "useExtendedIds", value.asInstanceOf[js.Any])
    
    inline def setUseExtendedIdsUndefined: Self = StObject.set(x, "useExtendedIds", js.undefined)
  }
}
