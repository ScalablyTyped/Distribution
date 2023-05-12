package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportHiddenFieldsOption extends StObject {
  
  /**
    * The status of the export hidden fields options of a dashbaord.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
}
object ExportHiddenFieldsOption {
  
  inline def apply(): ExportHiddenFieldsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportHiddenFieldsOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportHiddenFieldsOption] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
