package typings.appleMusicApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorialNotes extends js.Object {
  var editorialNotes: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.undefined
  var genreNames: js.Array[String]
  var name: String
  var url: String
}

object EditorialNotes {
  @scala.inline
  def apply(
    genreNames: js.Array[String],
    name: String,
    url: String,
    editorialNotes: typings.appleMusicApi.AppleMusicApi.EditorialNotes = null
  ): EditorialNotes = {
    val __obj = js.Dynamic.literal(genreNames = genreNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (editorialNotes != null) __obj.updateDynamic("editorialNotes")(editorialNotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorialNotes]
  }
}

