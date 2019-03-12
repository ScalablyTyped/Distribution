package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TextInput")
@js.native
class TextInput protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Creator: scala.Double = js.native
  var Default: java.lang.String = js.native
  val Format: java.lang.String = js.native
  val Parent: js.Any = js.native
  val Type: WdTextFormFieldType = js.native
  val Valid: scala.Boolean = js.native
  var Width: scala.Double = js.native
  var `Word.TextInput_typekey`: TextInput = js.native
  def Clear(): scala.Unit = js.native
  def EditType(Type: WdTextFormFieldType): scala.Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.Any): scala.Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.Any, Format: js.Any): scala.Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.Any, Format: js.Any, Enabled: js.Any): scala.Unit = js.native
}

