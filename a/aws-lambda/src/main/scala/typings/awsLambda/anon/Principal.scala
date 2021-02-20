package typings.awsLambda.anon

import typings.awsLambda.apiGatewayAuthorizerMod.PrincipalValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Principal extends StObject {
  
  var Principal: PrincipalValue = js.native
}
object Principal {
  
  @scala.inline
  def apply(Principal: PrincipalValue): Principal = {
    val __obj = js.Dynamic.literal(Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Principal]
  }
  
  @scala.inline
  implicit class PrincipalMutableBuilder[Self <: Principal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrincipal(value: PrincipalValue): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalVarargs(value: String*): Self = StObject.set(x, "Principal", js.Array(value :_*))
  }
}
