package typings.activexWord.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.AutoTextEntries")
@js.native
class AutoTextEntries protected ()
  extends StObject
     with typings.activexWord.Word.AutoTextEntries {
  
  /* CompleteClass */
  override def Add(Name: String, Range: typings.activexWord.Word.Range): typings.activexWord.Word.AutoTextEntry = js.native
  
  /* CompleteClass */
  override def AppendToSpike(Range: typings.activexWord.Word.Range): typings.activexWord.Word.AutoTextEntry = js.native
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.AutoTextEntry = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("Word.AutoTextEntries_typekey")
  var WordDotAutoTextEntries_typekey: typings.activexWord.Word.AutoTextEntries = js.native
}
