package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionGroupArbitraryPatternLimits extends StObject {
  
  /**
    * The maximum number of resources you can specify for a single arbitrary pattern in a protection group.
    */
  var MaxMembers: Long
}
object ProtectionGroupArbitraryPatternLimits {
  
  inline def apply(MaxMembers: Long): ProtectionGroupArbitraryPatternLimits = {
    val __obj = js.Dynamic.literal(MaxMembers = MaxMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionGroupArbitraryPatternLimits]
  }
  
  extension [Self <: ProtectionGroupArbitraryPatternLimits](x: Self) {
    
    inline def setMaxMembers(value: Long): Self = StObject.set(x, "MaxMembers", value.asInstanceOf[js.Any])
  }
}
