package typings.awsLambda.anon

import typings.awsLambda.triggerApiGatewayAuthorizerMod.PrincipalValue
import typings.awsLambda.triggerApiGatewayAuthorizerMod.StatementPrincipal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  NotPrincipal :aws-lambda.aws-lambda/trigger/api-gateway-authorizer.PrincipalValue} & aws-lambda.aws-lambda/trigger/api-gateway-authorizer.MaybeStatementResource */
trait NotPrincipalPrincipalValu
  extends StObject
     with StatementPrincipal {
  
  var NotPrincipal: PrincipalValue
  
  var NotResource: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var Resource: js.UndefOr[String | js.Array[String]] = js.undefined
}
object NotPrincipalPrincipalValu {
  
  inline def apply(NotPrincipal: PrincipalValue): NotPrincipalPrincipalValu = {
    val __obj = js.Dynamic.literal(NotPrincipal = NotPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotPrincipalPrincipalValu]
  }
  
  extension [Self <: NotPrincipalPrincipalValu](x: Self) {
    
    inline def setNotPrincipal(value: PrincipalValue): Self = StObject.set(x, "NotPrincipal", value.asInstanceOf[js.Any])
    
    inline def setNotPrincipalVarargs(value: String*): Self = StObject.set(x, "NotPrincipal", js.Array(value*))
    
    inline def setNotResource(value: String | js.Array[String]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
    
    inline def setNotResourceUndefined: Self = StObject.set(x, "NotResource", js.undefined)
    
    inline def setNotResourceVarargs(value: String*): Self = StObject.set(x, "NotResource", js.Array(value*))
    
    inline def setResource(value: String | js.Array[String]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    inline def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value*))
  }
}
