package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeStatusItem extends StObject {
  
  /**
    * The details of the operation.
    */
  var Actions: js.UndefOr[VolumeStatusActionsList] = js.undefined
  
  /**
    * Information about the instances to which the volume is attached.
    */
  var AttachmentStatuses: js.UndefOr[VolumeStatusAttachmentStatusList] = js.undefined
  
  /**
    * The Availability Zone of the volume.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * A list of events associated with the volume.
    */
  var Events: js.UndefOr[VolumeStatusEventsList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
  
  /**
    * The volume status.
    */
  var VolumeStatus: js.UndefOr[VolumeStatusInfo] = js.undefined
}
object VolumeStatusItem {
  
  inline def apply(): VolumeStatusItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VolumeStatusItem] (val x: Self) extends AnyVal {
    
    inline def setActions(value: VolumeStatusActionsList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: VolumeStatusAction*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setAttachmentStatuses(value: VolumeStatusAttachmentStatusList): Self = StObject.set(x, "AttachmentStatuses", value.asInstanceOf[js.Any])
    
    inline def setAttachmentStatusesUndefined: Self = StObject.set(x, "AttachmentStatuses", js.undefined)
    
    inline def setAttachmentStatusesVarargs(value: VolumeStatusAttachmentStatus*): Self = StObject.set(x, "AttachmentStatuses", js.Array(value*))
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setEvents(value: VolumeStatusEventsList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: VolumeStatusEvent*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
    
    inline def setVolumeStatus(value: VolumeStatusInfo): Self = StObject.set(x, "VolumeStatus", value.asInstanceOf[js.Any])
    
    inline def setVolumeStatusUndefined: Self = StObject.set(x, "VolumeStatus", js.undefined)
  }
}
