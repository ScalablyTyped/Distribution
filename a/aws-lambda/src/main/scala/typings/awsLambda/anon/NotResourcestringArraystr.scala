package typings.awsLambda.anon

import typings.awsLambda.triggerApiGatewayAuthorizerMod.PrincipalValue
import typings.awsLambda.triggerApiGatewayAuthorizerMod.StatementResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  NotResource :string | std.Array<string>} & aws-lambda.aws-lambda/trigger/api-gateway-authorizer.MaybeStatementPrincipal */
trait NotResourcestringArraystr
  extends StObject
     with StatementResource {
  
  var NotPrincipal: js.UndefOr[PrincipalValue] = js.undefined
  
  var NotResource: String | js.Array[String]
  
  var Principal: js.UndefOr[PrincipalValue] = js.undefined
}
object NotResourcestringArraystr {
  
  inline def apply(NotResource: String | js.Array[String]): NotResourcestringArraystr = {
    val __obj = js.Dynamic.literal(NotResource = NotResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotResourcestringArraystr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotResourcestringArraystr] (val x: Self) extends AnyVal {
    
    inline def setNotPrincipal(value: PrincipalValue): Self = StObject.set(x, "NotPrincipal", value.asInstanceOf[js.Any])
    
    inline def setNotPrincipalUndefined: Self = StObject.set(x, "NotPrincipal", js.undefined)
    
    inline def setNotPrincipalVarargs(value: String*): Self = StObject.set(x, "NotPrincipal", js.Array(value*))
    
    inline def setNotResource(value: String | js.Array[String]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
    
    inline def setNotResourceVarargs(value: String*): Self = StObject.set(x, "NotResource", js.Array(value*))
    
    inline def setPrincipal(value: PrincipalValue): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    inline def setPrincipalVarargs(value: String*): Self = StObject.set(x, "Principal", js.Array(value*))
  }
}
