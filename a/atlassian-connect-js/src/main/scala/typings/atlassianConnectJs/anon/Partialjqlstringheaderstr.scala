package typings.atlassianConnectJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  jql  :string,   header  :string,   descriptionText  :string,   submitText  :string,   cancelText  :string}> */
trait Partialjqlstringheaderstr extends js.Object {
  var cancelText: js.UndefOr[String] = js.undefined
  var descriptionText: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var jql: js.UndefOr[String] = js.undefined
  var submitText: js.UndefOr[String] = js.undefined
}

object Partialjqlstringheaderstr {
  @scala.inline
  def apply(
    cancelText: String = null,
    descriptionText: String = null,
    header: String = null,
    jql: String = null,
    submitText: String = null
  ): Partialjqlstringheaderstr = {
    val __obj = js.Dynamic.literal()
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (descriptionText != null) __obj.updateDynamic("descriptionText")(descriptionText.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (jql != null) __obj.updateDynamic("jql")(jql.asInstanceOf[js.Any])
    if (submitText != null) __obj.updateDynamic("submitText")(submitText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partialjqlstringheaderstr]
  }
}

