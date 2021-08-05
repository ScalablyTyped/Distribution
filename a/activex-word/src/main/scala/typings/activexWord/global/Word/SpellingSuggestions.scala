package typings.activexWord.global.Word

import typings.activexWord.Word.WdSpellingErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.SpellingSuggestions")
@js.native
/* private */ class SpellingSuggestions ()
  extends StObject
     with typings.activexWord.Word.SpellingSuggestions {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): typings.activexWord.Word.SpellingSuggestion = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val SpellingErrorType: WdSpellingErrorType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.SpellingSuggestions_typekey")
  var WordDotSpellingSuggestions_typekey: typings.activexWord.Word.SpellingSuggestions = js.native
}
