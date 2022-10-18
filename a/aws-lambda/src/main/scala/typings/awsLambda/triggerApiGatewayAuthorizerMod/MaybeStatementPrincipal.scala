package typings.awsLambda.triggerApiGatewayAuthorizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaybeStatementPrincipal extends StObject {
  
  var NotPrincipal: js.UndefOr[PrincipalValue] = js.undefined
  
  var Principal: js.UndefOr[PrincipalValue] = js.undefined
}
object MaybeStatementPrincipal {
  
  inline def apply(): MaybeStatementPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeStatementPrincipal]
  }
  
  extension [Self <: MaybeStatementPrincipal](x: Self) {
    
    inline def setNotPrincipal(value: PrincipalValue): Self = StObject.set(x, "NotPrincipal", value.asInstanceOf[js.Any])
    
    inline def setNotPrincipalUndefined: Self = StObject.set(x, "NotPrincipal", js.undefined)
    
    inline def setNotPrincipalVarargs(value: String*): Self = StObject.set(x, "NotPrincipal", js.Array(value*))
    
    inline def setPrincipal(value: PrincipalValue): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    inline def setPrincipalVarargs(value: String*): Self = StObject.set(x, "Principal", js.Array(value*))
  }
}
