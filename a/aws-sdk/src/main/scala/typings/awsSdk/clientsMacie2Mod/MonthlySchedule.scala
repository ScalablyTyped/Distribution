package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonthlySchedule extends StObject {
  
  /**
    * The numeric day of the month when Amazon Macie runs the job. This value can be an integer from 1 through 31. If this value exceeds the number of days in a certain month, Macie doesn't run the job that month. Macie runs the job only during months that have the specified day. For example, if this value is 31 and a month has only 30 days, Macie doesn't run the job that month. To run the job every month, specify a value that's less than 29.
    */
  var dayOfMonth: js.UndefOr[integer] = js.undefined
}
object MonthlySchedule {
  
  inline def apply(): MonthlySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthlySchedule]
  }
  
  extension [Self <: MonthlySchedule](x: Self) {
    
    inline def setDayOfMonth(value: integer): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
  }
}
