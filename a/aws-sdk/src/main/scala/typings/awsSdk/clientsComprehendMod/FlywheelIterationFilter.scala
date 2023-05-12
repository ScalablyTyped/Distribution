package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlywheelIterationFilter extends StObject {
  
  /**
    * Filter the flywheel iterations to include iterations created after the specified time.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter the flywheel iterations to include iterations created before the specified time.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
}
object FlywheelIterationFilter {
  
  inline def apply(): FlywheelIterationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlywheelIterationFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlywheelIterationFilter] (val x: Self) extends AnyVal {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
  }
}
