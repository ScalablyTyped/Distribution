package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Conflict")
@js.native
class Conflict protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  val Type: WdRevisionType = js.native
  @JSName("Word.Conflict_typekey")
  var WordDotConflict_typekey: Conflict = js.native
  def Accept(): Unit = js.native
  def Reject(): Unit = js.native
}

