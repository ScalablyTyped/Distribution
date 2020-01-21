package typings.audioContext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var channels: js.UndefOr[Double] = js.undefined
  var contextAttributes: js.UndefOr[js.Object] = js.undefined
  var latencyHint: js.UndefOr[String | Double] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var offline: js.UndefOr[Boolean] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    channels: Int | Double = null,
    contextAttributes: js.Object = null,
    latencyHint: String | Double = null,
    length: Int | Double = null,
    offline: js.UndefOr[Boolean] = js.undefined,
    sampleRate: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (contextAttributes != null) __obj.updateDynamic("contextAttributes")(contextAttributes.asInstanceOf[js.Any])
    if (latencyHint != null) __obj.updateDynamic("latencyHint")(latencyHint.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(offline)) __obj.updateDynamic("offline")(offline.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

