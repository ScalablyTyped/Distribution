package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Revisions")
@js.native
class Revisions protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Revisions_typekey")
  var WordDotRevisions_typekey: Revisions = js.native
  def AcceptAll(): Unit = js.native
  def Item(Index: Double): Revision = js.native
  def RejectAll(): Unit = js.native
}

