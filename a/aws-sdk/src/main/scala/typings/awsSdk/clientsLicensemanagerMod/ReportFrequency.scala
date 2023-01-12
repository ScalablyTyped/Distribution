package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportFrequency extends StObject {
  
  /**
    * Time period between each report. The period can be daily, weekly, or monthly.
    */
  var period: js.UndefOr[ReportFrequencyType] = js.undefined
  
  /**
    * Number of times within the frequency period that a report is generated. The only supported value is 1.
    */
  var value: js.UndefOr[Integer] = js.undefined
}
object ReportFrequency {
  
  inline def apply(): ReportFrequency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportFrequency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportFrequency] (val x: Self) extends AnyVal {
    
    inline def setPeriod(value: ReportFrequencyType): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setValue(value: Integer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
