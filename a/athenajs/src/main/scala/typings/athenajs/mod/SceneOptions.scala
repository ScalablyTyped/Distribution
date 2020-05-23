package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneOptions extends js.Object {
  var hudScene: js.UndefOr[Scene] = js.undefined
  var layers: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var resources: js.UndefOr[js.Array[Res]] = js.undefined
}

object SceneOptions {
  @scala.inline
  def apply(
    hudScene: Scene = null,
    layers: js.UndefOr[Double] = js.undefined,
    name: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    resources: js.Array[Res] = null
  ): SceneOptions = {
    val __obj = js.Dynamic.literal()
    if (hudScene != null) __obj.updateDynamic("hudScene")(hudScene.asInstanceOf[js.Any])
    if (!js.isUndefined(layers)) __obj.updateDynamic("layers")(layers.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneOptions]
  }
}

