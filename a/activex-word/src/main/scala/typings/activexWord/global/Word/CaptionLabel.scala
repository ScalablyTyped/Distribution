package typings.activexWord.global.Word

import typings.activexWord.Word.WdCaptionLabelID
import typings.activexWord.Word.WdCaptionNumberStyle
import typings.activexWord.Word.WdCaptionPosition
import typings.activexWord.Word.WdSeparatorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.CaptionLabel")
@js.native
/* private */ class CaptionLabel ()
  extends StObject
     with typings.activexWord.Word.CaptionLabel {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val BuiltIn: Boolean = js.native
  
  /* CompleteClass */
  var ChapterStyleLevel: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val ID: WdCaptionLabelID = js.native
  
  /* CompleteClass */
  var IncludeChapterNumber: Boolean = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  var NumberStyle: WdCaptionNumberStyle = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Position: WdCaptionPosition = js.native
  
  /* CompleteClass */
  var Separator: WdSeparatorType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.CaptionLabel_typekey")
  var WordDotCaptionLabel_typekey: typings.activexWord.Word.CaptionLabel = js.native
}
