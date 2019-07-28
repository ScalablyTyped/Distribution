package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteResult extends js.Object {
  var count: Double
  var info: String
  var tips: js.Array[Tip]
}

object AutocompleteResult {
  @scala.inline
  def apply(count: Double, info: String, tips: js.Array[Tip]): AutocompleteResult = {
    val __obj = js.Dynamic.literal(count = count, info = info, tips = tips)
  
    __obj.asInstanceOf[AutocompleteResult]
  }
}

