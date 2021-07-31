package typings.activexWord.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.AutoCorrectEntries")
@js.native
class AutoCorrectEntries protected ()
  extends StObject
     with typings.activexWord.Word.AutoCorrectEntries {
  
  /* CompleteClass */
  override def Add(Name: String, Value: String): typings.activexWord.Word.AutoCorrectEntry = js.native
  
  /* CompleteClass */
  override def AddRichText(Name: String, Range: typings.activexWord.Word.Range): typings.activexWord.Word.AutoCorrectEntry = js.native
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.AutoCorrectEntry = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("Word.AutoCorrectEntries_typekey")
  var WordDotAutoCorrectEntries_typekey: typings.activexWord.Word.AutoCorrectEntries = js.native
}
