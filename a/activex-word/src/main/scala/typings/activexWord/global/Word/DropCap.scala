package typings.activexWord.global.Word

import typings.activexWord.Word.WdDropPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.DropCap")
@js.native
/* private */ open class DropCap ()
  extends StObject
     with typings.activexWord.Word.DropCap {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var DistanceFromText: Double = js.native
  
  /* CompleteClass */
  override def Enable(): Unit = js.native
  
  /* CompleteClass */
  var FontName: String = js.native
  
  /* CompleteClass */
  var LinesToDrop: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Position: WdDropPosition = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.DropCap_typekey")
  var WordDotDropCap_typekey: typings.activexWord.Word.DropCap = js.native
}
