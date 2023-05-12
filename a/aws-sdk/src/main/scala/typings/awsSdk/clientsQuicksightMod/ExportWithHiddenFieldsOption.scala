package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportWithHiddenFieldsOption extends StObject {
  
  /**
    * The status of the export with hidden fields options.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
}
object ExportWithHiddenFieldsOption {
  
  inline def apply(): ExportWithHiddenFieldsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportWithHiddenFieldsOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportWithHiddenFieldsOption] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
