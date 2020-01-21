package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2RawInput extends js.Object {
  /**
    * Indicates how the user provided this input: a typed response, a voice
    * response, unspecified, etc.
    */
  var inputType: js.UndefOr[GoogleActionsV2RawInputInputType] = js.undefined
  /**
    * Typed or spoken input from the end user.
    */
  var query: js.UndefOr[String] = js.undefined
  /**
    * The triggering URL.
    */
  var url: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2RawInput {
  @scala.inline
  def apply(inputType: GoogleActionsV2RawInputInputType = null, query: String = null, url: String = null): GoogleActionsV2RawInput = {
    val __obj = js.Dynamic.literal()
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2RawInput]
  }
}

