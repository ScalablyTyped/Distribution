package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CustomProperties")
@js.native
class CustomProperties protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.CustomProperties_typekey")
  var WordDotCustomProperties_typekey: CustomProperties = js.native
  def Add(Name: String, Value: String): CustomProperty = js.native
  def Item(Index: js.Any): CustomProperty = js.native
}

