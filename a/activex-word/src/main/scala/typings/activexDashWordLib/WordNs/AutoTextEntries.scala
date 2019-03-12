package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AutoTextEntries")
@js.native
class AutoTextEntries protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.AutoTextEntries_typekey`: AutoTextEntries = js.native
  def Add(Name: java.lang.String, Range: Range): AutoTextEntry = js.native
  def AppendToSpike(Range: Range): AutoTextEntry = js.native
  def Item(Index: js.Any): AutoTextEntry = js.native
}

