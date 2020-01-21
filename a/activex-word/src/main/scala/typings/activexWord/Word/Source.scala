package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Source")
@js.native
class Source protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Cited: Boolean = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val Tag: String = js.native
  @JSName("Word.Source_typekey")
  var WordDotSource_typekey: Source = js.native
  val XML: String = js.native
  def Delete(): Unit = js.native
  def Field(Name: String): String = js.native
}

