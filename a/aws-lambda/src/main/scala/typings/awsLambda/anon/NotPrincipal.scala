package typings.awsLambda.anon

import typings.awsLambda.apiGatewayAuthorizerMod.PrincipalValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotPrincipal extends StObject {
  
  var NotPrincipal: PrincipalValue = js.native
}
object NotPrincipal {
  
  @scala.inline
  def apply(NotPrincipal: PrincipalValue): NotPrincipal = {
    val __obj = js.Dynamic.literal(NotPrincipal = NotPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotPrincipal]
  }
  
  @scala.inline
  implicit class NotPrincipalMutableBuilder[Self <: NotPrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotPrincipal(value: PrincipalValue): Self = StObject.set(x, "NotPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotPrincipalVarargs(value: String*): Self = StObject.set(x, "NotPrincipal", js.Array(value :_*))
  }
}
