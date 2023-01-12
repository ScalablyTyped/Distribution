package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchicalPrincipal extends StObject {
  
  /**
    * A list of principal lists that define the hierarchy for which documents users should have access to. Each hierarchical list specifies which user or group has allow or deny access for each document.
    */
  var PrincipalList: typings.awsSdk.clientsKendraMod.PrincipalList
}
object HierarchicalPrincipal {
  
  inline def apply(PrincipalList: PrincipalList): HierarchicalPrincipal = {
    val __obj = js.Dynamic.literal(PrincipalList = PrincipalList.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchicalPrincipal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HierarchicalPrincipal] (val x: Self) extends AnyVal {
    
    inline def setPrincipalList(value: PrincipalList): Self = StObject.set(x, "PrincipalList", value.asInstanceOf[js.Any])
    
    inline def setPrincipalListVarargs(value: Principal*): Self = StObject.set(x, "PrincipalList", js.Array(value*))
  }
}
