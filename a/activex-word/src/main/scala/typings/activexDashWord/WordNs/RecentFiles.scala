package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.RecentFiles")
@js.native
class RecentFiles protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var Maximum: Double = js.native
  val Parent: js.Any = js.native
  var `Word.RecentFiles_typekey`: RecentFiles = js.native
  def Add(Document: js.Any): RecentFile = js.native
  def Add(Document: js.Any, ReadOnly: js.Any): RecentFile = js.native
  def Item(Index: Double): RecentFile = js.native
}

