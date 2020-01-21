package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.RecentFile")
@js.native
class RecentFile protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  var ReadOnly: Boolean = js.native
  @JSName("Word.RecentFile_typekey")
  var WordDotRecentFile_typekey: RecentFile = js.native
  def Delete(): Unit = js.native
  def Open(): Document = js.native
}

