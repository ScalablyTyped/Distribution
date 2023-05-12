package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRange extends StObject {
  
  /**
    * This value is the beginning date, inclusive. The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to milliseconds (milliseconds are optional).
    */
  var FromDate: js.Date
  
  /**
    * This value is the end date, inclusive. The date and time are in Unix format and Coordinated Universal Time (UTC), and it is accurate to milliseconds (milliseconds are optional).
    */
  var ToDate: js.Date
}
object DateRange {
  
  inline def apply(FromDate: js.Date, ToDate: js.Date): DateRange = {
    val __obj = js.Dynamic.literal(FromDate = FromDate.asInstanceOf[js.Any], ToDate = ToDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateRange] (val x: Self) extends AnyVal {
    
    inline def setFromDate(value: js.Date): Self = StObject.set(x, "FromDate", value.asInstanceOf[js.Any])
    
    inline def setToDate(value: js.Date): Self = StObject.set(x, "ToDate", value.asInstanceOf[js.Any])
  }
}
