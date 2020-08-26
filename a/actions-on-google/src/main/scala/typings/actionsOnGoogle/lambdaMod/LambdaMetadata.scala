package typings.actionsOnGoogle.lambdaMod

import typings.actionsOnGoogle.commonMod.JsonObject
import typings.awsLambda.handlerMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaMetadata extends js.Object {
  /** @public */
  var context: Context = js.native
  /** @public */
  var event: JsonObject = js.native
}

object LambdaMetadata {
  @scala.inline
  def apply(context: Context, event: JsonObject): LambdaMetadata = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaMetadata]
  }
  @scala.inline
  implicit class LambdaMetadataOps[Self <: LambdaMetadata] (val x: Self) extends AnyVal {
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
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: JsonObject): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

