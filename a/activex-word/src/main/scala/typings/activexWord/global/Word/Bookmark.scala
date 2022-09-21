package typings.activexWord.global.Word

import typings.activexWord.Word.WdStoryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Bookmark")
@js.native
/* private */ open class Bookmark ()
  extends StObject
     with typings.activexWord.Word.Bookmark {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Column: Boolean = js.native
  
  /* CompleteClass */
  override def Copy(Name: String): typings.activexWord.Word.Bookmark = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val Empty: Boolean = js.native
  
  /* CompleteClass */
  var End: Double = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Range: typings.activexWord.Word.Range = js.native
  
  /* CompleteClass */
  override def Select(): Unit = js.native
  
  /* CompleteClass */
  var Start: Double = js.native
  
  /* CompleteClass */
  override val StoryType: WdStoryType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.Bookmark_typekey")
  var WordDotBookmark_typekey: typings.activexWord.Word.Bookmark = js.native
}
