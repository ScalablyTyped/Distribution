package typings.appleMusicApi

import typings.appleMusicApi.AppleMusicApi.EditorialNotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEditorialNotes extends js.Object {
  var editorialNotes: js.UndefOr[EditorialNotes] = js.undefined
  var genreNames: js.Array[String]
  var name: String
  var url: String
}

object AnonEditorialNotes {
  @scala.inline
  def apply(genreNames: js.Array[String], name: String, url: String, editorialNotes: EditorialNotes = null): AnonEditorialNotes = {
    val __obj = js.Dynamic.literal(genreNames = genreNames.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (editorialNotes != null) __obj.updateDynamic("editorialNotes")(editorialNotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEditorialNotes]
  }
}

