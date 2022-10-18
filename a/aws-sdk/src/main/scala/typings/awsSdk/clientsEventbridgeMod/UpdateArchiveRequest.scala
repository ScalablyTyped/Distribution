package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateArchiveRequest extends StObject {
  
  /**
    * The name of the archive to update.
    */
  var ArchiveName: typings.awsSdk.clientsEventbridgeMod.ArchiveName
  
  /**
    * The description for the archive.
    */
  var Description: js.UndefOr[ArchiveDescription] = js.undefined
  
  /**
    * The event pattern to use to filter events sent to the archive.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.EventPattern] = js.undefined
  
  /**
    * The number of days to retain events in the archive.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.RetentionDays] = js.undefined
}
object UpdateArchiveRequest {
  
  inline def apply(ArchiveName: ArchiveName): UpdateArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateArchiveRequest]
  }
  
  extension [Self <: UpdateArchiveRequest](x: Self) {
    
    inline def setArchiveName(value: ArchiveName): Self = StObject.set(x, "ArchiveName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ArchiveDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    inline def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
    inline def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
  }
}
