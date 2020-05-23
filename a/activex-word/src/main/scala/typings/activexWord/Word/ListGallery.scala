package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGallery extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val ListTemplates: typings.activexWord.Word.ListTemplates
  val Parent: js.Any
  @JSName("Word.ListGallery_typekey")
  var WordDotListGallery_typekey: ListGallery
  def Modified(Index: Double): Boolean
  def Reset(Index: Double): Unit
}

object ListGallery {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    ListTemplates: ListTemplates,
    Modified: Double => Boolean,
    Parent: js.Any,
    Reset: Double => Unit,
    WordDotListGallery_typekey: ListGallery
  ): ListGallery = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ListTemplates = ListTemplates.asInstanceOf[js.Any], Modified = js.Any.fromFunction1(Modified), Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction1(Reset))
    __obj.updateDynamic("Word.ListGallery_typekey")(WordDotListGallery_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGallery]
  }
}

