package typings.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentMembershipResult extends StObject {
  
  /**
    * Information about the environment member that was added.
    */
  var membership: EnvironmentMember
}
object CreateEnvironmentMembershipResult {
  
  inline def apply(membership: EnvironmentMember): CreateEnvironmentMembershipResult = {
    val __obj = js.Dynamic.literal(membership = membership.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentMembershipResult]
  }
  
  extension [Self <: CreateEnvironmentMembershipResult](x: Self) {
    
    inline def setMembership(value: EnvironmentMember): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
  }
}
