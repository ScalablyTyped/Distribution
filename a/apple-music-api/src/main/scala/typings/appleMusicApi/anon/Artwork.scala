package typings.appleMusicApi.anon

import typings.appleMusicApi.AppleMusicApi.PlayParameters
import typings.appleMusicApi.appleMusicApiStrings.`personal-mix`
import typings.appleMusicApi.appleMusicApiStrings.`user-shared`
import typings.appleMusicApi.appleMusicApiStrings.editorial
import typings.appleMusicApi.appleMusicApiStrings.external
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artwork extends js.Object {
  var artwork: js.UndefOr[typings.appleMusicApi.AppleMusicApi.Artwork] = js.undefined
  var curatorName: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[typings.appleMusicApi.AppleMusicApi.EditorialNotes] = js.undefined
  // `isChart` is not currently mentioned in the apple music api documentation:
  var isChart: js.UndefOr[Boolean] = js.undefined
  var lastModifiedDate: String
  var name: String
  var playParams: js.UndefOr[PlayParameters] = js.undefined
  var playlistType: `user-shared` | editorial | external | `personal-mix`
  var url: String
}

object Artwork {
  @scala.inline
  def apply(
    lastModifiedDate: String,
    name: String,
    playlistType: `user-shared` | editorial | external | `personal-mix`,
    url: String,
    artwork: typings.appleMusicApi.AppleMusicApi.Artwork = null,
    curatorName: String = null,
    description: typings.appleMusicApi.AppleMusicApi.EditorialNotes = null,
    isChart: js.UndefOr[Boolean] = js.undefined,
    playParams: PlayParameters = null
  ): Artwork = {
    val __obj = js.Dynamic.literal(lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], playlistType = playlistType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (curatorName != null) __obj.updateDynamic("curatorName")(curatorName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isChart)) __obj.updateDynamic("isChart")(isChart.get.asInstanceOf[js.Any])
    if (playParams != null) __obj.updateDynamic("playParams")(playParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artwork]
  }
}

