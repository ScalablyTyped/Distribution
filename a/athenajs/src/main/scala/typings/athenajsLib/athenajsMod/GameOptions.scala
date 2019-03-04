package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameOptions extends js.Object {
  var debug: scala.Boolean
  var height: scala.Double
  var name: java.lang.String
  var scene: js.UndefOr[Scene] = js.undefined
  var showFps: scala.Boolean
  var sound: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var width: scala.Double
}

object GameOptions {
  @scala.inline
  def apply(
    debug: scala.Boolean,
    height: scala.Double,
    name: java.lang.String,
    showFps: scala.Boolean,
    width: scala.Double,
    scene: Scene = null,
    sound: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String | stdLib.HTMLElement = null
  ): GameOptions = {
    val __obj = js.Dynamic.literal(debug = debug, height = height, name = name, showFps = showFps, width = width)
    if (scene != null) __obj.updateDynamic("scene")(scene)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameOptions]
  }
}

