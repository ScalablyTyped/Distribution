package typings.awsLambda.apiGatewayAuthorizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaybeStatementResource extends js.Object {
  var NotResource: js.UndefOr[String | js.Array[String]] = js.native
  var Resource: js.UndefOr[String | js.Array[String]] = js.native
}

object MaybeStatementResource {
  @scala.inline
  def apply(): MaybeStatementResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeStatementResource]
  }
  @scala.inline
  implicit class MaybeStatementResourceOps[Self <: MaybeStatementResource] (val x: Self) extends AnyVal {
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
    def setNotResourceVarargs(value: String*): Self = this.set("NotResource", js.Array(value :_*))
    @scala.inline
    def setNotResource(value: String | js.Array[String]): Self = this.set("NotResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotResource: Self = this.set("NotResource", js.undefined)
    @scala.inline
    def setResourceVarargs(value: String*): Self = this.set("Resource", js.Array(value :_*))
    @scala.inline
    def setResource(value: String | js.Array[String]): Self = this.set("Resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("Resource", js.undefined)
  }
  
}

