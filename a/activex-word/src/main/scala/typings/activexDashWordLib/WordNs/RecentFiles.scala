package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.RecentFiles")
@js.native
class RecentFiles protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var Maximum: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.RecentFiles_typekey`: RecentFiles = js.native
  def Add(Document: js.Any): RecentFile = js.native
  def Add(Document: js.Any, ReadOnly: js.Any): RecentFile = js.native
  def Item(Index: scala.Double): RecentFile = js.native
}

