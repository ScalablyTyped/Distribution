package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScheduleRequest extends StObject {
  
  /**
    * The name of the schedule to be described.
    */
  var Name: ScheduleName
}
object DescribeScheduleRequest {
  
  inline def apply(Name: ScheduleName): DescribeScheduleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeScheduleRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
