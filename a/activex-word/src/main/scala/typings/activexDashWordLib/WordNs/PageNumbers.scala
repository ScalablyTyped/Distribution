package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.PageNumbers")
@js.native
class PageNumbers protected () extends js.Object {
  val Application: Application = js.native
  var ChapterPageSeparator: WdSeparatorType = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var DoubleQuote: scala.Boolean = js.native
  var HeadingLevelForChapter: scala.Double = js.native
  var IncludeChapterNumber: scala.Boolean = js.native
  var NumberStyle: WdPageNumberStyle = js.native
  val Parent: js.Any = js.native
  var RestartNumberingAtSection: scala.Boolean = js.native
  var ShowFirstPageNumber: scala.Boolean = js.native
  var StartingNumber: scala.Double = js.native
  var `Word.PageNumbers_typekey`: PageNumbers = js.native
  def Add(): PageNumber = js.native
  def Add(PageNumberAlignment: js.Any): PageNumber = js.native
  def Add(PageNumberAlignment: js.Any, FirstPage: js.Any): PageNumber = js.native
  def Item(Index: scala.Double): PageNumber = js.native
}

