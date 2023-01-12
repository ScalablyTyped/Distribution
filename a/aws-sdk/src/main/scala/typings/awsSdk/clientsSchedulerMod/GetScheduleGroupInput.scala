package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScheduleGroupInput extends StObject {
  
  /**
    * The name of the schedule group to retrieve.
    */
  var Name: ScheduleGroupName
}
object GetScheduleGroupInput {
  
  inline def apply(Name: ScheduleGroupName): GetScheduleGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScheduleGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetScheduleGroupInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: ScheduleGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
