package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImplicitDeny extends StObject {
  
  /**
    * Policies that don't contain a matching allow or deny statement for the specified action on the specified resource. 
    */
  var policies: js.UndefOr[Policies] = js.undefined
}
object ImplicitDeny {
  
  inline def apply(): ImplicitDeny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplicitDeny]
  }
  
  extension [Self <: ImplicitDeny](x: Self) {
    
    inline def setPolicies(value: Policies): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: Policy*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
