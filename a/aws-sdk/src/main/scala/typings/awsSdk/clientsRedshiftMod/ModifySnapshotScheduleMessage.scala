package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifySnapshotScheduleMessage extends StObject {
  
  /**
    * An updated list of schedule definitions. A schedule definition is made up of schedule expressions, for example, "cron(30 12 *)" or "rate(12 hours)".
    */
  var ScheduleDefinitions: ScheduleDefinitionList
  
  /**
    * A unique alphanumeric identifier of the schedule to modify.
    */
  var ScheduleIdentifier: String
}
object ModifySnapshotScheduleMessage {
  
  inline def apply(ScheduleDefinitions: ScheduleDefinitionList, ScheduleIdentifier: String): ModifySnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ScheduleDefinitions = ScheduleDefinitions.asInstanceOf[js.Any], ScheduleIdentifier = ScheduleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySnapshotScheduleMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifySnapshotScheduleMessage] (val x: Self) extends AnyVal {
    
    inline def setScheduleDefinitions(value: ScheduleDefinitionList): Self = StObject.set(x, "ScheduleDefinitions", value.asInstanceOf[js.Any])
    
    inline def setScheduleDefinitionsVarargs(value: String*): Self = StObject.set(x, "ScheduleDefinitions", js.Array(value*))
    
    inline def setScheduleIdentifier(value: String): Self = StObject.set(x, "ScheduleIdentifier", value.asInstanceOf[js.Any])
  }
}
