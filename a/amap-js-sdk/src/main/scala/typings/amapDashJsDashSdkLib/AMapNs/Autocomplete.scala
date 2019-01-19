package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Autocomplete")
@js.native
class Autocomplete protected () extends js.Object {
  def this(opts: amapDashJsDashSdkLib.Anon_CityCitylimit) = this()
  def search(
    keyword: java.lang.String,
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | AutocompleteResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

