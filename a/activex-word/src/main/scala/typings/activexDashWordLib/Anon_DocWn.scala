package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocWn extends js.Object {
  val Doc: activexDashWordLib.WordNs.Document
  val Wn: activexDashWordLib.WordNs.Window
}

object Anon_DocWn {
  @scala.inline
  def apply(Doc: activexDashWordLib.WordNs.Document, Wn: activexDashWordLib.WordNs.Window): Anon_DocWn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Doc")(Doc)
    __obj.updateDynamic("Wn")(Wn)
    __obj.asInstanceOf[Anon_DocWn]
  }
}

