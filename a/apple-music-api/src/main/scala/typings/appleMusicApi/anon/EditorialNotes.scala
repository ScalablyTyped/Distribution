package typings.appleMusicApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorialNotes extends js.Object {
  var editorialNotes: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.native
  var genreNames: js.Array[String] = js.native
  var name: String = js.native
  var url: String = js.native
}

object EditorialNotes {
  @scala.inline
  def apply(genreNames: js.Array[String], name: String, url: String): EditorialNotes = {
    val __obj = js.Dynamic.literal(genreNames = genreNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorialNotes]
  }
  @scala.inline
  implicit class EditorialNotesOps[Self <: EditorialNotes] (val x: Self) extends AnyVal {
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
    def setGenreNamesVarargs(value: String*): Self = this.set("genreNames", js.Array(value :_*))
    @scala.inline
    def setGenreNames(value: js.Array[String]): Self = this.set("genreNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditorialNotes(value: typings.appleMusicApi.AppleMusicApi.EditorialNotes): Self = this.set("editorialNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorialNotes: Self = this.set("editorialNotes", js.undefined)
  }
  
}

