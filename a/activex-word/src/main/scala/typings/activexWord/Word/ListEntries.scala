package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ListEntries")
@js.native
class ListEntries protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.ListEntries_typekey")
  var WordDotListEntries_typekey: ListEntries = js.native
  def Add(Name: String): ListEntry = js.native
  def Add(Name: String, Index: js.Any): ListEntry = js.native
  def Clear(): Unit = js.native
  def Item(Index: js.Any): ListEntry = js.native
}

