package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCodeBindingSourceResponse extends js.Object {
  var Body: js.UndefOr[typings.awsDashSdk.clientsSchemasMod.Body] = js.native
}

object GetCodeBindingSourceResponse {
  @scala.inline
  def apply(Body: Body = null): GetCodeBindingSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCodeBindingSourceResponse]
  }
}

