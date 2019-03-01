package typings
package apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var variables: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object Body {
  @scala.inline
  def apply(
    extensions: stdLib.Record[java.lang.String, _] = null,
    operationName: java.lang.String = null,
    query: java.lang.String = null,
    variables: stdLib.Record[java.lang.String, _] = null
  ): Body = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (query != null) __obj.updateDynamic("query")(query)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Body]
  }
}

