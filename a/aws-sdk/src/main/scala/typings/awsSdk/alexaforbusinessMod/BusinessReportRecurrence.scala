package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessReportRecurrence extends StObject {
  
  /**
    * The start date.
    */
  var StartDate: js.UndefOr[Date] = js.native
}
object BusinessReportRecurrence {
  
  @scala.inline
  def apply(): BusinessReportRecurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReportRecurrence]
  }
  
  @scala.inline
  implicit class BusinessReportRecurrenceMutableBuilder[Self <: BusinessReportRecurrence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
  }
}
