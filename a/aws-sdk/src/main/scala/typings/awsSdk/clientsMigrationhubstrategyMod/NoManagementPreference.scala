package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoManagementPreference extends StObject {
  
  /**
    *  The choice of application destination that you specify. 
    */
  var targetDestination: NoPreferenceTargetDestinations
}
object NoManagementPreference {
  
  inline def apply(targetDestination: NoPreferenceTargetDestinations): NoManagementPreference = {
    val __obj = js.Dynamic.literal(targetDestination = targetDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoManagementPreference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoManagementPreference] (val x: Self) extends AnyVal {
    
    inline def setTargetDestination(value: NoPreferenceTargetDestinations): Self = StObject.set(x, "targetDestination", value.asInstanceOf[js.Any])
    
    inline def setTargetDestinationVarargs(value: NoPreferenceTargetDestination*): Self = StObject.set(x, "targetDestination", js.Array(value*))
  }
}
