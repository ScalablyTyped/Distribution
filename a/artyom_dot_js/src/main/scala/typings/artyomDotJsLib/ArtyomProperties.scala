package typings
package artyomDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtyomProperties extends js.Object {
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var executionKeyword: js.UndefOr[java.lang.String] = js.undefined
  var helpers: js.UndefOr[Anon_FatalityPromiseCallback] = js.undefined
  var lang: java.lang.String
  var listen: scala.Boolean
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var obeyKeyword: js.UndefOr[java.lang.String] = js.undefined
  var obeying: js.UndefOr[scala.Boolean] = js.undefined
  var recognizing: js.UndefOr[scala.Boolean] = js.undefined
  var soundex: js.UndefOr[scala.Boolean] = js.undefined
  var speaking: js.UndefOr[scala.Boolean] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object ArtyomProperties {
  @scala.inline
  def apply(
    lang: java.lang.String,
    listen: scala.Boolean,
    continuous: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    executionKeyword: java.lang.String = null,
    helpers: Anon_FatalityPromiseCallback = null,
    mode: java.lang.String = null,
    name: java.lang.String = null,
    obeyKeyword: java.lang.String = null,
    obeying: js.UndefOr[scala.Boolean] = js.undefined,
    recognizing: js.UndefOr[scala.Boolean] = js.undefined,
    soundex: js.UndefOr[scala.Boolean] = js.undefined,
    speaking: js.UndefOr[scala.Boolean] = js.undefined,
    speed: scala.Int | scala.Double = null,
    volume: scala.Int | scala.Double = null
  ): ArtyomProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("listen")(listen)
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

