package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelDoc extends js.Object {
  var Cancel: scala.Boolean
  val Doc: activexDashWordLib.WordNs.Document
  val SaveAsUI: scala.Boolean
}

object Anon_CancelDoc {
  @scala.inline
  def apply(Cancel: scala.Boolean, Doc: activexDashWordLib.WordNs.Document, SaveAsUI: scala.Boolean): Anon_CancelDoc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Doc")(Doc)
    __obj.updateDynamic("SaveAsUI")(SaveAsUI)
    __obj.asInstanceOf[Anon_CancelDoc]
  }
}

