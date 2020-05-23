package typings.athenajs.mod

import typings.athenajs.anon.Instantiable
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
    behavior: Instantiable = null,
    canCollide: js.UndefOr[Boolean] = js.undefined,
    canCollideFriendBullet: js.UndefOr[Boolean] = js.undefined,
    collideGroup: js.UndefOr[Double] = js.undefined,
    data: JSObject = null,
    easing: String = null,
    imageId: String = null,
    layer: js.UndefOr[Double] = js.undefined,
    map: Map = null,
    objectId: String = null,
    pool: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): SpriteOptions = {
    val __obj = js.Dynamic.literal()
    if (animations != null) __obj.updateDynamic("animations")(animations.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollide)) __obj.updateDynamic("canCollide")(canCollide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollideFriendBullet)) __obj.updateDynamic("canCollideFriendBullet")(canCollideFriendBullet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collideGroup)) __obj.updateDynamic("collideGroup")(collideGroup.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (!js.isUndefined(layer)) __obj.updateDynamic("layer")(layer.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (!js.isUndefined(pool)) __obj.updateDynamic("pool")(pool.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteOptions]
  }
}

