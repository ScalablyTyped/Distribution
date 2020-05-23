package typings.activexWord.global.Word

import typings.activexWord.Word.WdListGalleryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ListGalleries")
@js.native
class ListGalleries protected ()
  extends typings.activexWord.Word.ListGalleries {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.ListGalleries_typekey")
  override var WordDotListGalleries_typekey: typings.activexWord.Word.ListGalleries = js.native
  /* CompleteClass */
  override def Item(Index: WdListGalleryType): typings.activexWord.Word.ListGallery = js.native
}

