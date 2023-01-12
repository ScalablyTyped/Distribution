package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateArchiveRequest extends StObject {
  
  /**
    * The name for the archive to create.
    */
  var ArchiveName: typings.awsSdk.clientsCloudwatcheventsMod.ArchiveName
  
  /**
    * A description for the archive.
    */
  var Description: js.UndefOr[ArchiveDescription] = js.undefined
  
  /**
    * An event pattern to use to filter events sent to the archive.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.EventPattern] = js.undefined
  
  /**
    * The ARN of the event bus that sends events to the archive.
    */
  var EventSourceArn: Arn
  
  /**
    * The number of days to retain events for. Default value is 0. If set to 0, events are retained indefinitely
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.RetentionDays] = js.undefined
}
object CreateArchiveRequest {
  
  inline def apply(ArchiveName: ArchiveName, EventSourceArn: Arn): CreateArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any], EventSourceArn = EventSourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateArchiveRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateArchiveRequest] (val x: Self) extends AnyVal {
    
    inline def setArchiveName(value: ArchiveName): Self = StObject.set(x, "ArchiveName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ArchiveDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    inline def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
    inline def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    inline def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
  }
}
