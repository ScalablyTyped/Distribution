package typings.activexWord.global.Word

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Comment")
@js.native
class Comment protected ()
  extends StObject
     with typings.activexWord.Word.Comment {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var Author: String = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val Date: VarDate = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override def Edit(): Unit = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  var Initial: String = js.native
  
  /* CompleteClass */
  override val IsInk: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val Range: typings.activexWord.Word.Range = js.native
  
  /* CompleteClass */
  override val Reference: typings.activexWord.Word.Range = js.native
  
  /* CompleteClass */
  override val Scope: typings.activexWord.Word.Range = js.native
  
  /* CompleteClass */
  var ShowTip: Boolean = js.native
  
  /* CompleteClass */
  @JSName("Word.Comment_typekey")
  var WordDotComment_typekey: typings.activexWord.Word.Comment = js.native
}
