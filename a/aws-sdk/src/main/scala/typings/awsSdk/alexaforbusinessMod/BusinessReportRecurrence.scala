package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessReportRecurrence extends StObject {
  
  /**
    * The start date.
    */
  var StartDate: js.UndefOr[Date] = js.undefined
}
object BusinessReportRecurrence {
  
  inline def apply(): BusinessReportRecurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReportRecurrence]
  }
  
  extension [Self <: BusinessReportRecurrence](x: Self) {
    
    inline def setStartDate(value: Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
  }
}
