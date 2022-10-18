package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositorySyncAttempt extends StObject {
  
  /**
    * Detail data for sync attempt events.
    */
  var events: RepositorySyncEvents
  
  /**
    * The time when the sync attempt started.
    */
  var startedAt: js.Date
  
  /**
    * The sync attempt status.
    */
  var status: RepositorySyncStatus
}
object RepositorySyncAttempt {
  
  inline def apply(events: RepositorySyncEvents, startedAt: js.Date, status: RepositorySyncStatus): RepositorySyncAttempt = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositorySyncAttempt]
  }
  
  extension [Self <: RepositorySyncAttempt](x: Self) {
    
    inline def setEvents(value: RepositorySyncEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: RepositorySyncEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RepositorySyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
