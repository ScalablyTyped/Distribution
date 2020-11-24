package typings.awsLambda.anon

import typings.awsLambda.apiGatewayAuthorizerMod.PrincipalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotPrincipal extends js.Object {
  
  var NotPrincipal: PrincipalValue = js.native
}
object NotPrincipal {
  
  @scala.inline
  def apply(NotPrincipal: PrincipalValue): NotPrincipal = {
    val __obj = js.Dynamic.literal(NotPrincipal = NotPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotPrincipal]
  }
  
  @scala.inline
  implicit class NotPrincipalOps[Self <: NotPrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNotPrincipalVarargs(value: String*): Self = this.set("NotPrincipal", js.Array(value :_*))
    
    @scala.inline
    def setNotPrincipal(value: PrincipalValue): Self = this.set("NotPrincipal", value.asInstanceOf[js.Any])
  }
}
