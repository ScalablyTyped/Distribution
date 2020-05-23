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
    channels: js.UndefOr[Double] = js.undefined,
    contextAttributes: js.Object = null,
    latencyHint: String | Double = null,
    length: js.UndefOr[Double] = js.undefined,
    offline: js.UndefOr[Boolean] = js.undefined,
    sampleRate: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channels)) __obj.updateDynamic("channels")(channels.get.asInstanceOf[js.Any])
    if (contextAttributes != null) __obj.updateDynamic("contextAttributes")(contextAttributes.asInstanceOf[js.Any])
    if (latencyHint != null) __obj.updateDynamic("latencyHint")(latencyHint.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offline)) __obj.updateDynamic("offline")(offline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

