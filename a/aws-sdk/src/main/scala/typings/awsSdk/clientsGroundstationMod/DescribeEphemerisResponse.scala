package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEphemerisResponse extends StObject {
  
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
    * Reason that an ephemeris failed validation. Only provided for ephemerides with INVALID status.
    */
  var invalidReason: js.UndefOr[EphemerisInvalidReason] = js.undefined
  
  /**
    * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
    */
  var name: js.UndefOr[SafeName] = js.undefined
  
  /**
    * Customer-provided priority score to establish the order in which overlapping ephemerides should be used. The default for customer-provided ephemeris priority is 1, and higher numbers take precedence. Priority must be 1 or greater
    */
  var priority: js.UndefOr[EphemerisPriority] = js.undefined
  
  /**
    * The AWS Ground Station satellite ID associated with ephemeris.
    */
  var satelliteId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * The status of the ephemeris.
    */
  var status: js.UndefOr[EphemerisStatus] = js.undefined
  
  /**
    * Supplied ephemeris data.
    */
  var suppliedData: js.UndefOr[EphemerisTypeDescription] = js.undefined
  
  /**
    * Tags assigned to an ephemeris.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object DescribeEphemerisResponse {
  
  inline def apply(): DescribeEphemerisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEphemerisResponse]
  }
  
  extension [Self <: DescribeEphemerisResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEphemerisId(value: Uuid): Self = StObject.set(x, "ephemerisId", value.asInstanceOf[js.Any])
    
    inline def setEphemerisIdUndefined: Self = StObject.set(x, "ephemerisId", js.undefined)
    
    inline def setInvalidReason(value: EphemerisInvalidReason): Self = StObject.set(x, "invalidReason", value.asInstanceOf[js.Any])
    
    inline def setInvalidReasonUndefined: Self = StObject.set(x, "invalidReason", js.undefined)
    
    inline def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPriority(value: EphemerisPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSatelliteId(value: Uuid): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
    
    inline def setSatelliteIdUndefined: Self = StObject.set(x, "satelliteId", js.undefined)
    
    inline def setStatus(value: EphemerisStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSuppliedData(value: EphemerisTypeDescription): Self = StObject.set(x, "suppliedData", value.asInstanceOf[js.Any])
    
    inline def setSuppliedDataUndefined: Self = StObject.set(x, "suppliedData", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
