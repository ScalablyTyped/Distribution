package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EphemerisMetaData extends StObject {
  
  /**
    * UUID of a customer-provided ephemeris. This field is not populated for default ephemerides from Space Track.
    */
  var ephemerisId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * The epoch of a default, ephemeris from Space Track in UTC. This field is not populated for customer-provided ephemerides.
    */
  var epoch: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris. A name is only returned for customer-provider ephemerides that have a name associated.
    */
  var name: js.UndefOr[SafeName] = js.undefined
  
  /**
    * The EphemerisSource that generated a given ephemeris.
    */
  var source: EphemerisSource
}
object EphemerisMetaData {
  
  inline def apply(source: EphemerisSource): EphemerisMetaData = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemerisMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EphemerisMetaData] (val x: Self) extends AnyVal {
    
    inline def setEphemerisId(value: Uuid): Self = StObject.set(x, "ephemerisId", value.asInstanceOf[js.Any])
    
    inline def setEphemerisIdUndefined: Self = StObject.set(x, "ephemerisId", js.undefined)
    
    inline def setEpoch(value: js.Date): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    inline def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSource(value: EphemerisSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
