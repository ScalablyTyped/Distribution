package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageNumbers extends StObject {
  
  def Add(): PageNumber = js.native
  def Add(PageNumberAlignment: Any): PageNumber = js.native
  def Add(PageNumberAlignment: Any, FirstPage: Any): PageNumber = js.native
  def Add(PageNumberAlignment: Unit, FirstPage: Any): PageNumber = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var ChapterPageSeparator: WdSeparatorType = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var DoubleQuote: Boolean = js.native
  
  var HeadingLevelForChapter: Double = js.native
  
  var IncludeChapterNumber: Boolean = js.native
  
  def Item(Index: Double): PageNumber = js.native
  
  var NumberStyle: WdPageNumberStyle = js.native
  
  val Parent: Any = js.native
  
  var RestartNumberingAtSection: Boolean = js.native
  
  var ShowFirstPageNumber: Boolean = js.native
  
  var StartingNumber: Double = js.native
  
  /* private */ @JSName("Word.PageNumbers_typekey")
  var WordDotPageNumbers_typekey: PageNumbers = js.native
}
