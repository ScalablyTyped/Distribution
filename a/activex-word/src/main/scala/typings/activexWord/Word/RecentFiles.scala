package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecentFiles extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var Maximum: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.RecentFiles_typekey")
  var WordDotRecentFiles_typekey: RecentFiles = js.native
  def Add(Document: js.Any): RecentFile = js.native
  def Add(Document: js.Any, ReadOnly: js.Any): RecentFile = js.native
  def Item(Index: Double): RecentFile = js.native
}

