package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEphemerisRequest extends StObject {
  
  /**
    * Whether the ephemeris is enabled or not. Changing this value will not require the ephemeris to be re-validated.
    */
  var enabled: Boolean
  
  /**
    * The AWS Ground Station ephemeris ID.
    */
  var ephemerisId: Uuid
  
  /**
    * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
    */
  var name: js.UndefOr[SafeName] = js.undefined
  
  /**
    * Customer-provided priority score to establish the order in which overlapping ephemerides should be used. The default for customer-provided ephemeris priority is 1, and higher numbers take precedence. Priority must be 1 or greater
    */
  var priority: js.UndefOr[EphemerisPriority] = js.undefined
}
object UpdateEphemerisRequest {
  
  inline def apply(enabled: Boolean, ephemerisId: Uuid): UpdateEphemerisRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], ephemerisId = ephemerisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEphemerisRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEphemerisRequest] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEphemerisId(value: Uuid): Self = StObject.set(x, "ephemerisId", value.asInstanceOf[js.Any])
    
    inline def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPriority(value: EphemerisPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
