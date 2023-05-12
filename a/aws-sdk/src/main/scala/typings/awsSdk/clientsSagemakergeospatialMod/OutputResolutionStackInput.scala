package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputResolutionStackInput extends StObject {
  
  /**
    * A string value representing Predefined Output Resolution for a stacking operation. Allowed values are HIGHEST, LOWEST, and AVERAGE.
    */
  var Predefined: js.UndefOr[PredefinedResolution] = js.undefined
  
  /**
    * The structure representing User Output Resolution for a Stacking operation defined as a value and unit.
    */
  var UserDefined: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.UserDefined] = js.undefined
}
object OutputResolutionStackInput {
  
  inline def apply(): OutputResolutionStackInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputResolutionStackInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputResolutionStackInput] (val x: Self) extends AnyVal {
    
    inline def setPredefined(value: PredefinedResolution): Self = StObject.set(x, "Predefined", value.asInstanceOf[js.Any])
    
    inline def setPredefinedUndefined: Self = StObject.set(x, "Predefined", js.undefined)
    
    inline def setUserDefined(value: UserDefined): Self = StObject.set(x, "UserDefined", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedUndefined: Self = StObject.set(x, "UserDefined", js.undefined)
  }
}
