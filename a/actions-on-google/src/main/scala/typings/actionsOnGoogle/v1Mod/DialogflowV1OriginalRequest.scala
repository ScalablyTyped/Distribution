package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2AppRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1OriginalRequest extends js.Object {
  var data: js.UndefOr[GoogleActionsV2AppRequest] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object DialogflowV1OriginalRequest {
  @scala.inline
  def apply(data: GoogleActionsV2AppRequest = null, source: String = null, version: String = null): DialogflowV1OriginalRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1OriginalRequest]
  }
}

