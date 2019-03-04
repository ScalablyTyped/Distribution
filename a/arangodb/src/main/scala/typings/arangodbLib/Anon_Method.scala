package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: js.UndefOr[arangodbLib.ArangoDBNs.HttpMethod] = js.undefined
  var url: java.lang.String
}

object Anon_Method {
  @scala.inline
  def apply(url: java.lang.String, method: arangodbLib.ArangoDBNs.HttpMethod = null): Anon_Method = {
    val __obj = js.Dynamic.literal(url = url)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[Anon_Method]
  }
}

