package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Fields")
@js.native
class Fields protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var Locked: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.Fields_typekey`: Fields = js.native
  def Add(Range: Range): Field = js.native
  def Add(Range: Range, Type: js.Any): Field = js.native
  def Add(Range: Range, Type: js.Any, Text: js.Any): Field = js.native
  def Add(Range: Range, Type: js.Any, Text: js.Any, PreserveFormatting: js.Any): Field = js.native
  def Item(Index: scala.Double): Field = js.native
  def ToggleShowCodes(): scala.Unit = js.native
  def Unlink(): scala.Unit = js.native
  def Update(): scala.Double = js.native
  def UpdateSource(): scala.Unit = js.native
}

