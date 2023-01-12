package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEphemerisRequest extends StObject {
  
  /**
    * Whether to set the ephemeris status to ENABLED after validation. Setting this to false will set the ephemeris status to DISABLED after validation.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ephemeris data.
    */
  var ephemeris: js.UndefOr[EphemerisData] = js.undefined
  
  /**
    * An overall expiration time for the ephemeris in UTC, after which it will become EXPIRED.
    */
  var expirationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of a KMS key used to encrypt the ephemeris in Ground Station.
    */
  var kmsKeyArn: js.UndefOr[KeyArn] = js.undefined
  
  /**
    * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
    */
  var name: SafeName
  
  /**
    * Customer-provided priority score to establish the order in which overlapping ephemerides should be used. The default for customer-provided ephemeris priority is 1, and higher numbers take precedence. Priority must be 1 or greater
    */
  var priority: js.UndefOr[CustomerEphemerisPriority] = js.undefined
  
  /**
    * AWS Ground Station satellite ID for this ephemeris.
    */
  var satelliteId: Uuid
  
  /**
    * Tags assigned to an ephemeris.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateEphemerisRequest {
  
  inline def apply(name: SafeName, satelliteId: Uuid): CreateEphemerisRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], satelliteId = satelliteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEphemerisRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEphemerisRequest] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEphemeris(value: EphemerisData): Self = StObject.set(x, "ephemeris", value.asInstanceOf[js.Any])
    
    inline def setEphemerisUndefined: Self = StObject.set(x, "ephemeris", js.undefined)
    
    inline def setExpirationTime(value: js.Date): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setKmsKeyArn(value: KeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: CustomerEphemerisPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSatelliteId(value: Uuid): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
