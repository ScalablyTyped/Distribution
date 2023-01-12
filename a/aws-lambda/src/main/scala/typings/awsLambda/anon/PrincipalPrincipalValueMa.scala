package typings.awsLambda.anon

import typings.awsLambda.triggerApiGatewayAuthorizerMod.PrincipalValue
import typings.awsLambda.triggerApiGatewayAuthorizerMod.StatementPrincipal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  Principal :aws-lambda.aws-lambda/trigger/api-gateway-authorizer.PrincipalValue} & aws-lambda.aws-lambda/trigger/api-gateway-authorizer.MaybeStatementResource */
trait PrincipalPrincipalValueMa
  extends StObject
     with StatementPrincipal {
  
  var NotResource: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var Principal: PrincipalValue
  
  var Resource: js.UndefOr[String | js.Array[String]] = js.undefined
}
object PrincipalPrincipalValueMa {
  
  inline def apply(Principal: PrincipalValue): PrincipalPrincipalValueMa = {
    val __obj = js.Dynamic.literal(Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrincipalPrincipalValueMa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrincipalPrincipalValueMa] (val x: Self) extends AnyVal {
    
    inline def setNotResource(value: String | js.Array[String]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
    
    inline def setNotResourceUndefined: Self = StObject.set(x, "NotResource", js.undefined)
    
    inline def setNotResourceVarargs(value: String*): Self = StObject.set(x, "NotResource", js.Array(value*))
    
    inline def setPrincipal(value: PrincipalValue): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalVarargs(value: String*): Self = StObject.set(x, "Principal", js.Array(value*))
    
    inline def setResource(value: String | js.Array[String]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    inline def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value*))
  }
}
