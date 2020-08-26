package typings.awsLambda.apiGatewayAuthorizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseStatement extends js.Object {
  var Condition: js.UndefOr[ConditionBlock] = js.native
  var Effect: String = js.native
  var Sid: js.UndefOr[String] = js.native
}

object BaseStatement {
  @scala.inline
  def apply(Effect: String): BaseStatement = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseStatement]
  }
  @scala.inline
  implicit class BaseStatementOps[Self <: BaseStatement] (val x: Self) extends AnyVal {
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
    def setEffect(value: String): Self = this.set("Effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: ConditionBlock): Self = this.set("Condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
    @scala.inline
    def setSid(value: String): Self = this.set("Sid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSid: Self = this.set("Sid", js.undefined)
  }
  
}

