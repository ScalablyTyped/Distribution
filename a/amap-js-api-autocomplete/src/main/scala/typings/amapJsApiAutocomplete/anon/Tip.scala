package typings.amapJsApiAutocomplete.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tip extends js.Object {
  var tip: typings.amapJsApiAutocomplete.AMap.Autocomplete.Tip = js.native
}

object Tip {
  @scala.inline
  def apply(tip: typings.amapJsApiAutocomplete.AMap.Autocomplete.Tip): Tip = {
    val __obj = js.Dynamic.literal(tip = tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tip]
  }
  @scala.inline
  implicit class TipOps[Self <: Tip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTip(value: typings.amapJsApiAutocomplete.AMap.Autocomplete.Tip): Self = this.set("tip", value.asInstanceOf[js.Any])
  }
  
}

