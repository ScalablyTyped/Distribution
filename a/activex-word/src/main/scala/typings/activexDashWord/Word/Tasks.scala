package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Tasks")
@js.native
class Tasks protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Tasks_typekey")
  var WordDotTasks_typekey: Tasks = js.native
  def Exists(Name: String): Boolean = js.native
  def ExitWindows(): Unit = js.native
  def Item(Index: js.Any): Task = js.native
}

