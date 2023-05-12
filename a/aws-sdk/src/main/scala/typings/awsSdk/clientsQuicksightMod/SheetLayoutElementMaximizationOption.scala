package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetLayoutElementMaximizationOption extends StObject {
  
  /**
    * The status of the sheet layout maximization options of a dashbaord.
    */
  var AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
}
object SheetLayoutElementMaximizationOption {
  
  inline def apply(): SheetLayoutElementMaximizationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetLayoutElementMaximizationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetLayoutElementMaximizationOption] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityStatus(value: DashboardBehavior): Self = StObject.set(x, "AvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityStatusUndefined: Self = StObject.set(x, "AvailabilityStatus", js.undefined)
  }
}
