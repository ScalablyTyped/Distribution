package typings.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var operationName: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var variables: js.UndefOr[Record[String, _]] = js.undefined
}

object Body {
  @scala.inline
  def apply(
    extensions: Record[String, _] = null,
    operationName: String = null,
    query: String = null,
    variables: Record[String, _] = null
  ): Body = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (query != null) __obj.updateDynamic("query")(query)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Body]
  }
}

