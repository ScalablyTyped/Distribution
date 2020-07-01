package typings.appleMusicApi.anon

import typings.appleMusicApi.AppleMusicApi.Relationship
import typings.appleMusicApi.AppleMusicApi.Song
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Curator extends js.Object {
  var curator: Relationship[typings.appleMusicApi.AppleMusicApi.Curator]
  var tracks: js.UndefOr[Relationship[Song]] = js.undefined
}

object Curator {
  @scala.inline
  def apply(
    curator: Relationship[typings.appleMusicApi.AppleMusicApi.Curator],
    tracks: Relationship[Song] = null
  ): Curator = {
    val __obj = js.Dynamic.literal(curator = curator.asInstanceOf[js.Any])
    if (tracks != null) __obj.updateDynamic("tracks")(tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curator]
  }
}

