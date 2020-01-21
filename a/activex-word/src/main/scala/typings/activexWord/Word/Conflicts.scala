package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Conflicts")
@js.native
class Conflicts protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Conflicts_typekey")
  var WordDotConflicts_typekey: Conflicts = js.native
  def AcceptAll(): Unit = js.native
  def Item(Index: Double): Conflict = js.native
  def RejectAll(): Unit = js.native
}

