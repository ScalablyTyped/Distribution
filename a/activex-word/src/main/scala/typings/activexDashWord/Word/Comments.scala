package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Comments")
@js.native
class Comments protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var ShowBy: String = js.native
  @JSName("Word.Comments_typekey")
  var WordDotComments_typekey: Comments = js.native
  def Add(Range: Range): Comment = js.native
  def Add(Range: Range, Text: js.Any): Comment = js.native
  def Item(Index: Double): Comment = js.native
}

