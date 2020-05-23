package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGalleries extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.ListGalleries_typekey")
  var WordDotListGalleries_typekey: ListGalleries
  def Item(Index: WdListGalleryType): ListGallery
}

object ListGalleries {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: WdListGalleryType => ListGallery,
    Parent: js.Any,
    WordDotListGalleries_typekey: ListGalleries
  ): ListGalleries = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ListGalleries_typekey")(WordDotListGalleries_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGalleries]
  }
}

