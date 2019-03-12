package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.FormFields")
@js.native
class FormFields protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var Shaded: scala.Boolean = js.native
  var `Word.FormFields_typekey`: FormFields = js.native
  def Add(Range: Range, Type: WdFieldType): FormField = js.native
  def Item(Index: js.Any): FormField = js.native
}

