package typings.awsLambda.apiGatewayAuthorizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDocument extends js.Object {
  var Id: js.UndefOr[String] = js.native
  var Statement: js.Array[typings.awsLambda.apiGatewayAuthorizerMod.Statement] = js.native
  var Version: String = js.native
}

object PolicyDocument {
  @scala.inline
  def apply(Statement: js.Array[Statement], Version: String): PolicyDocument = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDocument]
  }
  @scala.inline
  implicit class PolicyDocumentOps[Self <: PolicyDocument] (val x: Self) extends AnyVal {
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
    def setStatementVarargs(value: Statement*): Self = this.set("Statement", js.Array(value :_*))
    @scala.inline
    def setStatement(value: js.Array[Statement]): Self = this.set("Statement", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

