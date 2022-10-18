package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeArchiveResponse extends StObject {
  
  /**
    * The ARN of the archive.
    */
  var ArchiveArn: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ArchiveArn] = js.undefined
  
  /**
    * The name of the archive.
    */
  var ArchiveName: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ArchiveName] = js.undefined
  
  /**
    * The time at which the archive was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the archive.
    */
  var Description: js.UndefOr[ArchiveDescription] = js.undefined
  
  /**
    * The number of events in the archive.
    */
  var EventCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The event pattern used to filter events sent to the archive.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.EventPattern] = js.undefined
  
  /**
    * The ARN of the event source associated with the archive.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The number of days to retain events for in the archive.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.RetentionDays] = js.undefined
  
  /**
    * The size of the archive in bytes.
    */
  var SizeBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The state of the archive.
    */
  var State: js.UndefOr[ArchiveState] = js.undefined
  
  /**
    * The reason that the archive is in the state.
    */
  var StateReason: js.UndefOr[ArchiveStateReason] = js.undefined
}
object DescribeArchiveResponse {
  
  inline def apply(): DescribeArchiveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeArchiveResponse]
  }
  
  extension [Self <: DescribeArchiveResponse](x: Self) {
    
    inline def setArchiveArn(value: ArchiveArn): Self = StObject.set(x, "ArchiveArn", value.asInstanceOf[js.Any])
    
    inline def setArchiveArnUndefined: Self = StObject.set(x, "ArchiveArn", js.undefined)
    
    inline def setArchiveName(value: ArchiveName): Self = StObject.set(x, "ArchiveName", value.asInstanceOf[js.Any])
    
    inline def setArchiveNameUndefined: Self = StObject.set(x, "ArchiveName", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: ArchiveDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventCount(value: Long): Self = StObject.set(x, "EventCount", value.asInstanceOf[js.Any])
    
    inline def setEventCountUndefined: Self = StObject.set(x, "EventCount", js.undefined)
    
    inline def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    inline def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
    inline def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    inline def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
    
    inline def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
    
    inline def setSizeBytes(value: Long): Self = StObject.set(x, "SizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "SizeBytes", js.undefined)
    
    inline def setState(value: ArchiveState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: ArchiveStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
