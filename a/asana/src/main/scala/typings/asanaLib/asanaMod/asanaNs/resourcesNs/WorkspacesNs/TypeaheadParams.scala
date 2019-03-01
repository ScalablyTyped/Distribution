package typings
package asanaLib.asanaMod.asanaNs.resourcesNs.WorkspacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadParams extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object TypeaheadParams {
  @scala.inline
  def apply(`type`: java.lang.String, count: scala.Int | scala.Double = null, query: java.lang.String = null): TypeaheadParams = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[TypeaheadParams]
  }
}

