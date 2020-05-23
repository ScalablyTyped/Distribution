package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportApiResponse extends js.Object {
  var body: js.UndefOr[ExportedApi] = js.native
}

object ExportApiResponse {
  @scala.inline
  def apply(body: ExportedApi = null): ExportApiResponse = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportApiResponse]
  }
}

