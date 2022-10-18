package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositorySyncEvent extends StObject {
  
  /**
    * Event detail for a repository sync attempt.
    */
  var event: String
  
  /**
    * The external ID of the sync event.
    */
  var externalId: js.UndefOr[String] = js.undefined
  
  /**
    * The time that the sync event occurred.
    */
  var time: js.Date
  
  /**
    * The type of event.
    */
  var `type`: String
}
object RepositorySyncEvent {
  
  inline def apply(event: String, time: js.Date, `type`: String): RepositorySyncEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositorySyncEvent]
  }
  
  extension [Self <: RepositorySyncEvent](x: Self) {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
