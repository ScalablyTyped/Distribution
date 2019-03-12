package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ContentControlListEntries")
@js.native
class ContentControlListEntries protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.ContentControlListEntries_typekey`: ContentControlListEntries = js.native
  /**
    * @param string [Value='']
    * @param number [Index=0]
    */
  def Add(Text: java.lang.String): ContentControlListEntry = js.native
  def Add(Text: java.lang.String, Value: java.lang.String): ContentControlListEntry = js.native
  def Add(Text: java.lang.String, Value: java.lang.String, Index: scala.Double): ContentControlListEntry = js.native
  def Clear(): scala.Unit = js.native
  def Item(Index: scala.Double): ContentControlListEntry = js.native
}

