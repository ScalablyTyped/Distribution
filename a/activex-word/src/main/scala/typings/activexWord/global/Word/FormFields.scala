package typings.activexWord.global.Word

import typings.activexWord.Word.WdFieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.FormFields")
@js.native
/* private */ open class FormFields ()
  extends StObject
     with typings.activexWord.Word.FormFields {
  
  /* CompleteClass */
  override def Add(Range: typings.activexWord.Word.Range, Type: WdFieldType): typings.activexWord.Word.FormField = js.native
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typings.activexWord.Word.FormField = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Shaded: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.FormFields_typekey")
  var WordDotFormFields_typekey: typings.activexWord.Word.FormFields = js.native
}
