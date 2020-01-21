package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ListGalleries")
@js.native
class ListGalleries protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.ListGalleries_typekey")
  var WordDotListGalleries_typekey: ListGalleries = js.native
  def Item(Index: WdListGalleryType): ListGallery = js.native
}

