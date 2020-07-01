package typings.appleMusicApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var artwork: js.UndefOr[typings.appleMusicApi.AppleMusicApi.Artwork] = js.undefined
  var editorialNotes: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.undefined
  var name: String
  var url: String
}

object Url {
  @scala.inline
  def apply(
    name: String,
    url: String,
    artwork: typings.appleMusicApi.AppleMusicApi.Artwork = null,
    editorialNotes: typings.appleMusicApi.AppleMusicApi.EditorialNotes = null
  ): Url = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (editorialNotes != null) __obj.updateDynamic("editorialNotes")(editorialNotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
}

