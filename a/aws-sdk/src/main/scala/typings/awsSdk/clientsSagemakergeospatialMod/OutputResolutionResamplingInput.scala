package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputResolutionResamplingInput extends StObject {
  
  /**
    * User Defined Resolution for the output of Resampling operation defined by value and unit.
    */
  var UserDefined: typings.awsSdk.clientsSagemakergeospatialMod.UserDefined
}
object OutputResolutionResamplingInput {
  
  inline def apply(UserDefined: UserDefined): OutputResolutionResamplingInput = {
    val __obj = js.Dynamic.literal(UserDefined = UserDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputResolutionResamplingInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputResolutionResamplingInput] (val x: Self) extends AnyVal {
    
    inline def setUserDefined(value: UserDefined): Self = StObject.set(x, "UserDefined", value.asInstanceOf[js.Any])
  }
}
