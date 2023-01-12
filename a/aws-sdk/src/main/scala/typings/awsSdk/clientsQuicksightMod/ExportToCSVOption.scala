package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportToCSVOption extends StObject {
  
  /**
    * Availability status.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
}
object ExportToCSVOption {
  
  inline def apply(): ExportToCSVOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportToCSVOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportToCSVOption] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
