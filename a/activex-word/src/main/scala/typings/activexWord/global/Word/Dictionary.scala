package typings.activexWord.global.Word

import typings.activexWord.Word.WdDictionaryType
import typings.activexWord.Word.WdLanguageID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Dictionary")
@js.native
class Dictionary protected ()
  extends StObject
     with typings.activexWord.Word.Dictionary {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var LanguageID: WdLanguageID = js.native
  
  /* CompleteClass */
  var LanguageSpecific: Boolean = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val Path: String = js.native
  
  /* CompleteClass */
  override val ReadOnly: Boolean = js.native
  
  /* CompleteClass */
  override val Type: WdDictionaryType = js.native
  
  /* CompleteClass */
  @JSName("Word.Dictionary_typekey")
  var WordDotDictionary_typekey: typings.activexWord.Word.Dictionary = js.native
}
