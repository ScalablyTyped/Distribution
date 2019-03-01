package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocHandled extends js.Object {
  val Doc: activexDashWordLib.WordNs.Document
  val Handled: scala.Boolean
}

object Anon_DocHandled {
  @scala.inline
  def apply(Doc: activexDashWordLib.WordNs.Document, Handled: scala.Boolean): Anon_DocHandled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Doc")(Doc)
    __obj.updateDynamic("Handled")(Handled)
    __obj.asInstanceOf[Anon_DocHandled]
  }
}

