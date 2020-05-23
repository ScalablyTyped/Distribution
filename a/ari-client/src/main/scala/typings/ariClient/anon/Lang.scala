package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lang extends js.Object {
  var bridgeId: String
  var lang: js.UndefOr[String] = js.undefined
  var media: String | js.Array[String]
  var offsetms: js.UndefOr[Double] = js.undefined
  var playbackId: js.UndefOr[String] = js.undefined
  var skipms: js.UndefOr[Double] = js.undefined
}

object Lang {
  @scala.inline
  def apply(
    bridgeId: String,
    media: String | js.Array[String],
    lang: String = null,
    offsetms: js.UndefOr[Double] = js.undefined,
    playbackId: String = null,
    skipms: js.UndefOr[Double] = js.undefined
  ): Lang = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetms)) __obj.updateDynamic("offsetms")(offsetms.get.asInstanceOf[js.Any])
    if (playbackId != null) __obj.updateDynamic("playbackId")(playbackId.asInstanceOf[js.Any])
    if (!js.isUndefined(skipms)) __obj.updateDynamic("skipms")(skipms.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lang]
  }
}

