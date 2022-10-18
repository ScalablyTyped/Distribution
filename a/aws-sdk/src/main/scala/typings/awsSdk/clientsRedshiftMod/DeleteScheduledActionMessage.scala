package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScheduledActionMessage extends StObject {
  
  /**
    * The name of the scheduled action to delete. 
    */
  var ScheduledActionName: String
}
object DeleteScheduledActionMessage {
  
  inline def apply(ScheduledActionName: String): DeleteScheduledActionMessage = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduledActionMessage]
  }
  
  extension [Self <: DeleteScheduledActionMessage](x: Self) {
    
    inline def setScheduledActionName(value: String): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
  }
}
