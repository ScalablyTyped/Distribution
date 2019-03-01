package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteOptions extends DrawableOptions {
  var animations: js.UndefOr[Animations] = js.undefined
  var data: js.UndefOr[JSObject] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var imageId: js.UndefOr[java.lang.String] = js.undefined
}

object SpriteOptions {
  @scala.inline
  def apply(
    animations: Animations = null,
    behavior: athenajsLib.Anon_Options = null,
    canCollide: js.UndefOr[scala.Boolean] = js.undefined,
    canCollideFriendBullet: js.UndefOr[scala.Boolean] = js.undefined,
    collideGroup: scala.Int | scala.Double = null,
    data: JSObject = null,
    easing: java.lang.String = null,
    imageId: java.lang.String = null,
    layer: scala.Int | scala.Double = null,
    map: Map = null,
    objectId: java.lang.String = null,
    pool: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): SpriteOptions = {
    val __obj = js.Dynamic.literal()
    if (animations != null) __obj.updateDynamic("animations")(animations)
    if (behavior != null) __obj.updateDynamic("behavior")(behavior)
    if (!js.isUndefined(canCollide)) __obj.updateDynamic("canCollide")(canCollide)
    if (!js.isUndefined(canCollideFriendBullet)) __obj.updateDynamic("canCollideFriendBullet")(canCollideFriendBullet)
    if (collideGroup != null) __obj.updateDynamic("collideGroup")(collideGroup.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (imageId != null) __obj.updateDynamic("imageId")(imageId)
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteOptions]
  }
}

