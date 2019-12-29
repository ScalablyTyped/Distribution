package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.SmartTags")
@js.native
class SmartTags protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.SmartTags_typekey")
  var WordDotSmartTags_typekey: SmartTags = js.native
  def Add(Name: String): SmartTag = js.native
  def Add(Name: String, Range: js.Any): SmartTag = js.native
  def Add(Name: String, Range: js.Any, Properties: js.Any): SmartTag = js.native
  def Item(Index: js.Any): SmartTag = js.native
  def SmartTagsByType(Name: String): SmartTags = js.native
}

