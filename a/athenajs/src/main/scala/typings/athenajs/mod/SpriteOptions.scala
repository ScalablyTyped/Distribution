package typings.athenajs.mod

import typings.athenajs.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteOptions extends DrawableOptions {
  var animations: js.UndefOr[Animations] = js.undefined
  var data: js.UndefOr[JSObject] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var imageId: js.UndefOr[String] = js.undefined
}

object SpriteOptions {
  @scala.inline
  def apply(
    animations: Animations = null,
    behavior: AnonInstantiable = null,
    canCollide: js.UndefOr[Boolean] = js.undefined,
    canCollideFriendBullet: js.UndefOr[Boolean] = js.undefined,
    collideGroup: Int | Double = null,
    data: JSObject = null,
    easing: String = null,
    imageId: String = null,
    layer: Int | Double = null,
    map: Map = null,
    objectId: String = null,
    pool: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
  ): SpriteOptions = {
    val __obj = js.Dynamic.literal()
    if (animations != null) __obj.updateDynamic("animations")(animations.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollide)) __obj.updateDynamic("canCollide")(canCollide.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollideFriendBullet)) __obj.updateDynamic("canCollideFriendBullet")(canCollideFriendBullet.asInstanceOf[js.Any])
    if (collideGroup != null) __obj.updateDynamic("collideGroup")(collideGroup.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteOptions]
  }
}

