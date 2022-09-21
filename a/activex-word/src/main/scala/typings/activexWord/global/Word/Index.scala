package typings.activexWord.global.Word

import typings.activexWord.Word.WdHeadingSeparator
import typings.activexWord.Word.WdIndexFilter
import typings.activexWord.Word.WdIndexSortBy
import typings.activexWord.Word.WdIndexType
import typings.activexWord.Word.WdLanguageID
import typings.activexWord.Word.WdTabLeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Index")
@js.native
/* private */ open class Index ()
  extends StObject
     with typings.activexWord.Word.Index {
  
  /* CompleteClass */
  var AccentedLetters: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Filter: WdIndexFilter = js.native
  
  /* CompleteClass */
  var HeadingSeparator: WdHeadingSeparator = js.native
  
  /* CompleteClass */
  var IndexLanguage: WdLanguageID = js.native
  
  /* CompleteClass */
  var NumberOfColumns: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Range: typings.activexWord.Word.Range = js.native
  
  /* CompleteClass */
  var RightAlignPageNumbers: Boolean = js.native
  
  /* CompleteClass */
  var SortBy: WdIndexSortBy = js.native
  
  /* CompleteClass */
  var TabLeader: WdTabLeader = js.native
  
  /* CompleteClass */
  var Type: WdIndexType = js.native
  
  /* CompleteClass */
  override def Update(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.Index_typekey")
  var WordDotIndex_typekey: typings.activexWord.Word.Index = js.native
}
