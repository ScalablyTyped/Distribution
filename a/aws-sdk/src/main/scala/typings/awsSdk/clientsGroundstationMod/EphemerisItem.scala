package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EphemerisItem extends StObject {
  
  /**
    * The time the ephemeris was uploaded in UTC.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Whether or not the ephemeris is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The AWS Ground Station ephemeris ID.
    */
  var ephemerisId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
    */
  var name: js.UndefOr[SafeName] = js.undefined
  
  /**
    * Customer-provided priority score to establish the order in which overlapping ephemerides should be used. The default for customer-provided ephemeris priority is 1, and higher numbers take precedence. Priority must be 1 or greater
    */
  var priority: js.UndefOr[EphemerisPriority] = js.undefined
  
  /**
    * Source S3 object used for the ephemeris.
    */
  var sourceS3Object: js.UndefOr[S3Object] = js.undefined
  
  /**
    * The status of the ephemeris.
    */
  var status: js.UndefOr[EphemerisStatus] = js.undefined
}
object EphemerisItem {
  
  inline def apply(): EphemerisItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EphemerisItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EphemerisItem] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEphemerisId(value: Uuid): Self = StObject.set(x, "ephemerisId", value.asInstanceOf[js.Any])
    
    inline def setEphemerisIdUndefined: Self = StObject.set(x, "ephemerisId", js.undefined)
    
    inline def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPriority(value: EphemerisPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSourceS3Object(value: S3Object): Self = StObject.set(x, "sourceS3Object", value.asInstanceOf[js.Any])
    
    inline def setSourceS3ObjectUndefined: Self = StObject.set(x, "sourceS3Object", js.undefined)
    
    inline def setStatus(value: EphemerisStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
