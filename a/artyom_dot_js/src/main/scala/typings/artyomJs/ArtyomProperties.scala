package typings.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtyomProperties extends js.Object {
  var continuous: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var executionKeyword: js.UndefOr[String] = js.undefined
  var helpers: js.UndefOr[AnonFatalityPromiseCallback] = js.undefined
  var lang: String
  var listen: Boolean
  var mode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var obeyKeyword: js.UndefOr[String] = js.undefined
  var obeying: js.UndefOr[Boolean] = js.undefined
  var recognizing: js.UndefOr[Boolean] = js.undefined
  var soundex: js.UndefOr[Boolean] = js.undefined
  var speaking: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object ArtyomProperties {
  @scala.inline
  def apply(
    lang: String,
    listen: Boolean,
    continuous: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    executionKeyword: String = null,
    helpers: AnonFatalityPromiseCallback = null,
    mode: String = null,
    name: String = null,
    obeyKeyword: String = null,
    obeying: js.UndefOr[Boolean] = js.undefined,
    recognizing: js.UndefOr[Boolean] = js.undefined,
    soundex: js.UndefOr[Boolean] = js.undefined,
    speaking: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    volume: Int | Double = null
  ): ArtyomProperties = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any])
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (executionKeyword != null) __obj.updateDynamic("executionKeyword")(executionKeyword.asInstanceOf[js.Any])
    if (helpers != null) __obj.updateDynamic("helpers")(helpers.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (obeyKeyword != null) __obj.updateDynamic("obeyKeyword")(obeyKeyword.asInstanceOf[js.Any])
    if (!js.isUndefined(obeying)) __obj.updateDynamic("obeying")(obeying.asInstanceOf[js.Any])
    if (!js.isUndefined(recognizing)) __obj.updateDynamic("recognizing")(recognizing.asInstanceOf[js.Any])
    if (!js.isUndefined(soundex)) __obj.updateDynamic("soundex")(soundex.asInstanceOf[js.Any])
    if (!js.isUndefined(speaking)) __obj.updateDynamic("speaking")(speaking.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomProperties]
  }
}

