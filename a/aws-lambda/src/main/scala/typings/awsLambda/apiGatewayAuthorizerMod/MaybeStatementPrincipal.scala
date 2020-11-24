package typings.awsLambda.apiGatewayAuthorizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaybeStatementPrincipal extends js.Object {
  
  var NotPrincipal: js.UndefOr[PrincipalValue] = js.native
  
  var Principal: js.UndefOr[PrincipalValue] = js.native
}
object MaybeStatementPrincipal {
  
  @scala.inline
  def apply(): MaybeStatementPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeStatementPrincipal]
  }
  
  @scala.inline
  implicit class MaybeStatementPrincipalOps[Self <: MaybeStatementPrincipal] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteNotPrincipal: Self = this.set("NotPrincipal", js.undefined)
    
    @scala.inline
    def setPrincipalVarargs(value: String*): Self = this.set("Principal", js.Array(value :_*))
    
    @scala.inline
    def setPrincipal(value: PrincipalValue): Self = this.set("Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipal: Self = this.set("Principal", js.undefined)
  }
}
