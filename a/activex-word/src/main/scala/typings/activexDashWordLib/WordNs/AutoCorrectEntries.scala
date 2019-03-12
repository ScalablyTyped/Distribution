package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AutoCorrectEntries")
@js.native
class AutoCorrectEntries protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.AutoCorrectEntries_typekey`: AutoCorrectEntries = js.native
  def Add(Name: java.lang.String, Value: java.lang.String): AutoCorrectEntry = js.native
  def AddRichText(Name: java.lang.String, Range: Range): AutoCorrectEntry = js.native
  def Item(Index: js.Any): AutoCorrectEntry = js.native
}

