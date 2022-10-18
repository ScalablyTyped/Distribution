package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTimelineEventOutput extends StObject {
  
  /**
    * Details about the timeline event.
    */
  var event: TimelineEvent
}
object GetTimelineEventOutput {
  
  inline def apply(event: TimelineEvent): GetTimelineEventOutput = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTimelineEventOutput]
  }
  
  extension [Self <: GetTimelineEventOutput](x: Self) {
    
    inline def setEvent(value: TimelineEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
