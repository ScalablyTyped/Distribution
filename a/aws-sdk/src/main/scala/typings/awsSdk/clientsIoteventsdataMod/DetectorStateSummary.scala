package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorStateSummary extends StObject {
  
  /**
    * The name of the state.
    */
  var stateName: js.UndefOr[StateName] = js.undefined
}
object DetectorStateSummary {
  
  inline def apply(): DetectorStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorStateSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectorStateSummary] (val x: Self) extends AnyVal {
    
    inline def setStateName(value: StateName): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
    
    inline def setStateNameUndefined: Self = StObject.set(x, "stateName", js.undefined)
  }
}
