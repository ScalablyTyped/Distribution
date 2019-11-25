package typings.athenajs.athenajsMod

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
    layers: Int | Double = null,
    name: String = null,
    opacity: Int | Double = null,
    resources: js.Array[Res] = null
  ): SceneOptions = {
    val __obj = js.Dynamic.literal()
    if (hudScene != null) __obj.updateDynamic("hudScene")(hudScene.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneOptions]
  }
}

