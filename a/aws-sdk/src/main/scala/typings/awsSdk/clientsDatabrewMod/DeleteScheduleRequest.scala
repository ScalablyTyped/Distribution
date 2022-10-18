package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScheduleRequest extends StObject {
  
  /**
    * The name of the schedule to be deleted.
    */
  var Name: ScheduleName
}
object DeleteScheduleRequest {
  
  inline def apply(Name: ScheduleName): DeleteScheduleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduleRequest]
  }
  
  extension [Self <: DeleteScheduleRequest](x: Self) {
    
    inline def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
