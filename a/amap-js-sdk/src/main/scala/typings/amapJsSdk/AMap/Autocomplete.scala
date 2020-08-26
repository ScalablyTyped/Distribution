package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autocomplete extends js.Object {
  def search(
    keyword: String,
    callback: js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]
  ): Unit = js.native
}

object Autocomplete {
  @scala.inline
  def apply(
    search: (String, js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]) => Unit
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction2(search))
    __obj.asInstanceOf[Autocomplete]
  }
  @scala.inline
  implicit class AutocompleteOps[Self <: Autocomplete] (val x: Self) extends AnyVal {
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
    def setSearch(
      value: (String, js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]) => Unit
    ): Self = this.set("search", js.Any.fromFunction2(value))
  }
  
}

