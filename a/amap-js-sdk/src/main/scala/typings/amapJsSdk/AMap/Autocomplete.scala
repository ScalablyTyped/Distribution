package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autocomplete extends js.Object {
  def search(
    keyword: String,
    callback: js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]
  ): Unit
}

object Autocomplete {
  @scala.inline
  def apply(
    search: (String, js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]) => Unit
  ): Autocomplete = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction2(search))
    __obj.asInstanceOf[Autocomplete]
  }
}

