package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGallery extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val ListTemplates: typings.activexWord.Word.ListTemplates = js.native
  val Parent: js.Any = js.native
  @JSName("Word.ListGallery_typekey")
  var WordDotListGallery_typekey: ListGallery = js.native
  def Modified(Index: Double): Boolean = js.native
  def Reset(Index: Double): Unit = js.native
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
  @scala.inline
  implicit class ListGalleryOps[Self <: ListGallery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setListTemplates(value: ListTemplates): Self = this.set("ListTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: Double => Boolean): Self = this.set("Modified", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: Double => Unit): Self = this.set("Reset", js.Any.fromFunction1(value))
    @scala.inline
    def setWordDotListGallery_typekey(value: ListGallery): Self = this.set("Word.ListGallery_typekey", value.asInstanceOf[js.Any])
  }
  
}

