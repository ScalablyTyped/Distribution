package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLabels extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.CustomLabels_typekey")
  var WordDotCustomLabels_typekey: CustomLabels = js.native
  def Add(Name: String): CustomLabel = js.native
  def Add(Name: String, DotMatrix: js.Any): CustomLabel = js.native
  def Item(Index: js.Any): CustomLabel = js.native
}

