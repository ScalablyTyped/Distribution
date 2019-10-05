package typings.amapDashJsDashSdk.AMap

import typings.amapDashJsDashSdk.Anon_CityCitylimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Autocomplete")
@js.native
class Autocomplete protected () extends js.Object {
  def this(opts: Anon_CityCitylimit) = this()
  def search(
    keyword: String,
    callback: js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]
  ): Unit = js.native
}

