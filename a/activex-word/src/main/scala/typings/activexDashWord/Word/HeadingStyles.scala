package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.HeadingStyles")
@js.native
class HeadingStyles protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.HeadingStyles_typekey")
  var WordDotHeadingStyles_typekey: HeadingStyles = js.native
  def Add(Style: js.Any, Level: Double): HeadingStyle = js.native
  def Item(Index: Double): HeadingStyle = js.native
}

