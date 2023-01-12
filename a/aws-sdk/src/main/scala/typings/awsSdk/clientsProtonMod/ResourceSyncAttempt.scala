package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSyncAttempt extends StObject {
  
  /**
    * An array of events with detail data.
    */
  var events: ResourceSyncEvents
  
  /**
    * Detail data for the initial repository commit, path and push.
    */
  var initialRevision: Revision
  
  /**
    * The time when the sync attempt started.
    */
  var startedAt: js.Date
  
  /**
    * The status of the sync attempt.
    */
  var status: ResourceSyncStatus
  
  /**
    * The resource that is synced to.
    */
  var target: String
  
  /**
    * Detail data for the target revision.
    */
  var targetRevision: Revision
}
object ResourceSyncAttempt {
  
  inline def apply(
    events: ResourceSyncEvents,
    initialRevision: Revision,
    startedAt: js.Date,
    status: ResourceSyncStatus,
    target: String,
    targetRevision: Revision
  ): ResourceSyncAttempt = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], initialRevision = initialRevision.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetRevision = targetRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSyncAttempt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceSyncAttempt] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: ResourceSyncEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: ResourceSyncEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setInitialRevision(value: Revision): Self = StObject.set(x, "initialRevision", value.asInstanceOf[js.Any])
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ResourceSyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetRevision(value: Revision): Self = StObject.set(x, "targetRevision", value.asInstanceOf[js.Any])
  }
}
