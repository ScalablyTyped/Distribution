package typings.activexWord.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CustomProperties")
@js.native
class CustomProperties protected ()
  extends typings.activexWord.Word.CustomProperties {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.CustomProperties_typekey")
  override var WordDotCustomProperties_typekey: typings.activexWord.Word.CustomProperties = js.native
  /* CompleteClass */
  override def Add(Name: String, Value: String): typings.activexWord.Word.CustomProperty = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.CustomProperty = js.native
}

