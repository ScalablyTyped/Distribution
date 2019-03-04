package typings
package activexDashShdocvwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BstrUrl extends js.Object {
  var Cancel: scala.Boolean
  val bstrUrl: java.lang.String
  val bstrUrlContext: java.lang.String
  val dwFlags: scala.Double
  var ppDisp: js.Any
}

object Anon_BstrUrl {
  @scala.inline
  def apply(
    Cancel: scala.Boolean,
    bstrUrl: java.lang.String,
    bstrUrlContext: java.lang.String,
    dwFlags: scala.Double,
    ppDisp: js.Any
  ): Anon_BstrUrl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, bstrUrl = bstrUrl, bstrUrlContext = bstrUrlContext, dwFlags = dwFlags, ppDisp = ppDisp)
  
    __obj.asInstanceOf[Anon_BstrUrl]
  }
}

