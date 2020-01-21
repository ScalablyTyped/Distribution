package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ContentControlListEntry")
@js.native
class ContentControlListEntry protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Index: Double = js.native
  val Parent: js.Any = js.native
  var Text: String = js.native
  var Value: String = js.native
  @JSName("Word.ContentControlListEntry_typekey")
  var WordDotContentControlListEntry_typekey: ContentControlListEntry = js.native
  def Delete(): Unit = js.native
  def MoveDown(): Unit = js.native
  def MoveUp(): Unit = js.native
  def Select(): Unit = js.native
}

