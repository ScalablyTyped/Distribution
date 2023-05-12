package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuardianFactor extends StObject {
  
  var enabled: Boolean
  
  var name: String
  
  var trial_expired: Boolean
}
object GuardianFactor {
  
  inline def apply(enabled: Boolean, name: String, trial_expired: Boolean): GuardianFactor = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], trial_expired = trial_expired.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuardianFactor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GuardianFactor] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTrial_expired(value: Boolean): Self = StObject.set(x, "trial_expired", value.asInstanceOf[js.Any])
  }
}
