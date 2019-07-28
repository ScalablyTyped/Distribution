package typings.athenajs.athenajsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameOptions extends js.Object {
  var debug: Boolean
  var height: Double
  var name: String
  var scene: js.UndefOr[Scene] = js.undefined
  var showFps: Boolean
  var sound: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[String | HTMLElement] = js.undefined
  var width: Double
}

object GameOptions {
  @scala.inline
  def apply(
    debug: Boolean,
    height: Double,
    name: String,
    showFps: Boolean,
    width: Double,
    scene: Scene = null,
    sound: js.UndefOr[Boolean] = js.undefined,
    target: String | HTMLElement = null
  ): GameOptions = {
    val __obj = js.Dynamic.literal(debug = debug, height = height, name = name, showFps = showFps, width = width)
    if (scene != null) __obj.updateDynamic("scene")(scene)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameOptions]
  }
}

