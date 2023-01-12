package typings.awsLambda.anon

import typings.awsLambda.triggerApiGatewayAuthorizerMod.PrincipalValue
import typings.awsLambda.triggerApiGatewayAuthorizerMod.StatementResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  Resource :string | std.Array<string>} & aws-lambda.aws-lambda/trigger/api-gateway-authorizer.MaybeStatementPrincipal */
trait ResourcestringArraystring
  extends StObject
     with StatementResource {
  
  var NotPrincipal: js.UndefOr[PrincipalValue] = js.undefined
  
  var Principal: js.UndefOr[PrincipalValue] = js.undefined
  
  var Resource: String | js.Array[String]
}
object ResourcestringArraystring {
  
  inline def apply(Resource: String | js.Array[String]): ResourcestringArraystring = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcestringArraystring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourcestringArraystring] (val x: Self) extends AnyVal {
    
    inline def setNotPrincipal(value: PrincipalValue): Self = StObject.set(x, "NotPrincipal", value.asInstanceOf[js.Any])
    
    inline def setNotPrincipalUndefined: Self = StObject.set(x, "NotPrincipal", js.undefined)
    
    inline def setNotPrincipalVarargs(value: String*): Self = StObject.set(x, "NotPrincipal", js.Array(value*))
    
    inline def setPrincipal(value: PrincipalValue): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    inline def setPrincipalVarargs(value: String*): Self = StObject.set(x, "Principal", js.Array(value*))
    
    inline def setResource(value: String | js.Array[String]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value*))
  }
}
