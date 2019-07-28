package typings.artyomDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtyomProperties extends js.Object {
  var continuous: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var executionKeyword: js.UndefOr[String] = js.undefined
  var helpers: js.UndefOr[Anon_FatalityPromiseCallback] = js.undefined
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
    helpers: Anon_FatalityPromiseCallback = null,
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
    val __obj = js.Dynamic.literal(lang = lang, listen = listen)
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (executionKeyword != null) __obj.updateDynamic("executionKeyword")(executionKeyword)
    if (helpers != null) __obj.updateDynamic("helpers")(helpers)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (name != null) __obj.updateDynamic("name")(name)
    if (obeyKeyword != null) __obj.updateDynamic("obeyKeyword")(obeyKeyword)
    if (!js.isUndefined(obeying)) __obj.updateDynamic("obeying")(obeying)
    if (!js.isUndefined(recognizing)) __obj.updateDynamic("recognizing")(recognizing)
    if (!js.isUndefined(soundex)) __obj.updateDynamic("soundex")(soundex)
    if (!js.isUndefined(speaking)) __obj.updateDynamic("speaking")(speaking)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomProperties]
  }
}

