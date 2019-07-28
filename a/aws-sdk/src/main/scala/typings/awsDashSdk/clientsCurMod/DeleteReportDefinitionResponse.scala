package typings.awsDashSdk.clientsCurMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReportDefinitionResponse extends js.Object {
  var ResponseMessage: js.UndefOr[DeleteResponseMessage] = js.undefined
}

object DeleteReportDefinitionResponse {
  @scala.inline
  def apply(ResponseMessage: DeleteResponseMessage = null): DeleteReportDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (ResponseMessage != null) __obj.updateDynamic("ResponseMessage")(ResponseMessage)
    __obj.asInstanceOf[DeleteReportDefinitionResponse]
  }
}

