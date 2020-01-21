package typings.amapJsApiAutocomplete

import typings.amapJsApiAutocomplete.AMap.Autocomplete.Tip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTip extends js.Object {
  var tip: Tip
}

object AnonTip {
  @scala.inline
  def apply(tip: Tip): AnonTip = {
    val __obj = js.Dynamic.literal(tip = tip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTip]
  }
}

