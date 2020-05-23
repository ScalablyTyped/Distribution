package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackId extends js.Object {
  var lang: js.UndefOr[String] = js.undefined
  var media: String | js.Array[String]
  var offsetms: js.UndefOr[Double] = js.undefined
  var playbackId: String
  var skipms: js.UndefOr[Double] = js.undefined
}

object PlaybackId {
  @scala.inline
  def apply(
    media: String | js.Array[String],
    playbackId: String,
    lang: String = null,
    offsetms: js.UndefOr[Double] = js.undefined,
    skipms: js.UndefOr[Double] = js.undefined
  ): PlaybackId = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], playbackId = playbackId.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetms)) __obj.updateDynamic("offsetms")(offsetms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipms)) __obj.updateDynamic("skipms")(skipms.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackId]
  }
}

