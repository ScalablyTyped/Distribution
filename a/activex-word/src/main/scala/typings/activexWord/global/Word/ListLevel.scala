package typings.activexWord.global.Word

import typings.activexWord.Word.WdListLevelAlignment
import typings.activexWord.Word.WdListNumberStyle
import typings.activexWord.Word.WdTrailingCharacter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.ListLevel")
@js.native
class ListLevel protected ()
  extends StObject
     with typings.activexWord.Word.ListLevel {
  
  /* CompleteClass */
  var Alignment: WdListLevelAlignment = js.native
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override def ApplyPictureBullet(FileName: String): typings.activexWord.Word.InlineShape = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var Font: typings.activexWord.Word.Font = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  var LinkedStyle: String = js.native
  
  /* CompleteClass */
  var NumberFormat: String = js.native
  
  /* CompleteClass */
  var NumberPosition: Double = js.native
  
  /* CompleteClass */
  var NumberStyle: WdListNumberStyle = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val PictureBullet: typings.activexWord.Word.InlineShape = js.native
  
  /* CompleteClass */
  var ResetOnHigher: Double = js.native
  
  /* CompleteClass */
  var ResetOnHigherOld: Boolean = js.native
  
  /* CompleteClass */
  var StartAt: Double = js.native
  
  /* CompleteClass */
  var TabPosition: Double = js.native
  
  /* CompleteClass */
  var TextPosition: Double = js.native
  
  /* CompleteClass */
  var TrailingCharacter: WdTrailingCharacter = js.native
  
  /* CompleteClass */
  @JSName("Word.ListLevel_typekey")
  var WordDotListLevel_typekey: typings.activexWord.Word.ListLevel = js.native
}
