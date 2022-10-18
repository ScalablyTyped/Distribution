package typings.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentMembershipResult extends StObject {
  
  /**
    * Information about the environment member whose settings were changed.
    */
  var membership: js.UndefOr[EnvironmentMember] = js.undefined
}
object UpdateEnvironmentMembershipResult {
  
  inline def apply(): UpdateEnvironmentMembershipResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEnvironmentMembershipResult]
  }
  
  extension [Self <: UpdateEnvironmentMembershipResult](x: Self) {
    
    inline def setMembership(value: EnvironmentMember): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
  }
}
