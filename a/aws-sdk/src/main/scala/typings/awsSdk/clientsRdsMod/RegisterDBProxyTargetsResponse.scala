package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDBProxyTargetsResponse extends StObject {
  
  /**
    * One or more DBProxyTarget objects that are created when you register targets with a target group.
    */
  var DBProxyTargets: js.UndefOr[TargetList] = js.undefined
}
object RegisterDBProxyTargetsResponse {
  
  inline def apply(): RegisterDBProxyTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDBProxyTargetsResponse]
  }
  
  extension [Self <: RegisterDBProxyTargetsResponse](x: Self) {
    
    inline def setDBProxyTargets(value: TargetList): Self = StObject.set(x, "DBProxyTargets", value.asInstanceOf[js.Any])
    
    inline def setDBProxyTargetsUndefined: Self = StObject.set(x, "DBProxyTargets", js.undefined)
    
    inline def setDBProxyTargetsVarargs(value: DBProxyTarget*): Self = StObject.set(x, "DBProxyTargets", js.Array(value*))
  }
}
