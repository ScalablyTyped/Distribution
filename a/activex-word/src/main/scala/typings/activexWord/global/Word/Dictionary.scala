package typings.activexWord.global.Word

import typings.activexWord.Word.WdDictionaryType
import typings.activexWord.Word.WdLanguageID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Dictionary")
@js.native
class Dictionary protected ()
  extends typings.activexWord.Word.Dictionary {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var LanguageID: WdLanguageID = js.native
  /* CompleteClass */
  override var LanguageSpecific: Boolean = js.native
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
  override var WordDotDictionary_typekey: typings.activexWord.Word.Dictionary = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

