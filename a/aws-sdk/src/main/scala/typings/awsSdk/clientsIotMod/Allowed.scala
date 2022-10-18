package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowed extends StObject {
  
  /**
    * A list of policies that allowed the authentication.
    */
  var policies: js.UndefOr[Policies] = js.undefined
}
object Allowed {
  
  inline def apply(): Allowed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowed]
  }
  
  extension [Self <: Allowed](x: Self) {
    
    inline def setPolicies(value: Policies): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: Policy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
