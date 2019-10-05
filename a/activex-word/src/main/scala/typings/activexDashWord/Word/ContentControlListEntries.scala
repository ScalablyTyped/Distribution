package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ContentControlListEntries")
@js.native
class ContentControlListEntries protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var `Word.ContentControlListEntries_typekey`: ContentControlListEntries = js.native
  /**
    * @param string [Value='']
    * @param number [Index=0]
    */
  def Add(Text: String): ContentControlListEntry = js.native
  def Add(Text: String, Value: String): ContentControlListEntry = js.native
  def Add(Text: String, Value: String, Index: Double): ContentControlListEntry = js.native
  def Clear(): Unit = js.native
  def Item(Index: Double): ContentControlListEntry = js.native
}

