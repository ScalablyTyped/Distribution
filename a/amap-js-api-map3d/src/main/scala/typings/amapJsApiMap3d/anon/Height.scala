package typings.amapJsApiMap3d.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var scene: js.UndefOr[Double] = js.undefined
}

object Height {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    position: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    scene: js.UndefOr[Double] = js.undefined
  ): Height = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scene)) __obj.updateDynamic("scene")(scene.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

