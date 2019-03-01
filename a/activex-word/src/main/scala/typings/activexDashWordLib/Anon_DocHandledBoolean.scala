package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocHandledBoolean extends js.Object {
  val Doc: activexDashWordLib.WordNs.Document
  var Handled: scala.Boolean
}

object Anon_DocHandledBoolean {
  @scala.inline
  def apply(Doc: activexDashWordLib.WordNs.Document, Handled: scala.Boolean): Anon_DocHandledBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Doc")(Doc)
    __obj.updateDynamic("Handled")(Handled)
    __obj.asInstanceOf[Anon_DocHandledBoolean]
  }
}

