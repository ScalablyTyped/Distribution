package typings.activexWord.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.AutoTextEntries")
@js.native
/* private */ open class AutoTextEntries ()
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
  override def Item(Index: Any): typings.activexWord.Word.AutoTextEntry = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.AutoTextEntries_typekey")
  var WordDotAutoTextEntries_typekey: typings.activexWord.Word.AutoTextEntries = js.native
}
