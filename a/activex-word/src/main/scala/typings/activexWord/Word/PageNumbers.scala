package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageNumbers extends js.Object {
  
  def Add(): PageNumber = js.native
  def Add(PageNumberAlignment: js.UndefOr[scala.Nothing], FirstPage: js.Any): PageNumber = js.native
  def Add(PageNumberAlignment: js.Any): PageNumber = js.native
  def Add(PageNumberAlignment: js.Any, FirstPage: js.Any): PageNumber = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var ChapterPageSeparator: WdSeparatorType = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var DoubleQuote: Boolean = js.native
  
  var HeadingLevelForChapter: Double = js.native
  
  var IncludeChapterNumber: Boolean = js.native
  
  def Item(Index: Double): PageNumber = js.native
  
  var NumberStyle: WdPageNumberStyle = js.native
  
  val Parent: js.Any = js.native
  
  var RestartNumberingAtSection: Boolean = js.native
  
  var ShowFirstPageNumber: Boolean = js.native
  
  var StartingNumber: Double = js.native
  
  @JSName("Word.PageNumbers_typekey")
  var WordDotPageNumbers_typekey: PageNumbers = js.native
}
