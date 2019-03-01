package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteResult extends js.Object {
  var count: scala.Double
  var info: java.lang.String
  var tips: js.Array[Tip]
}

object AutocompleteResult {
  @scala.inline
  def apply(count: scala.Double, info: java.lang.String, tips: js.Array[Tip]): AutocompleteResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("tips")(tips)
    __obj.asInstanceOf[AutocompleteResult]
  }
}

