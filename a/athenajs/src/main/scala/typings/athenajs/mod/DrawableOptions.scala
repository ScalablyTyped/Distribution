package typings.athenajs.mod

import typings.athenajs.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawableOptions extends js.Object {
  var behavior: js.UndefOr[Instantiable] = js.undefined
  var canCollide: js.UndefOr[Boolean] = js.undefined
  var canCollideFriendBullet: js.UndefOr[Boolean] = js.undefined
  var collideGroup: js.UndefOr[Double] = js.undefined
  var layer: js.UndefOr[Double] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var objectId: js.UndefOr[String] = js.undefined
  var pool: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object DrawableOptions {
  @scala.inline
  def apply(
    behavior: Instantiable = null,
    canCollide: js.UndefOr[Boolean] = js.undefined,
    canCollideFriendBullet: js.UndefOr[Boolean] = js.undefined,
    collideGroup: js.UndefOr[Double] = js.undefined,
    layer: js.UndefOr[Double] = js.undefined,
    map: Map = null,
    objectId: String = null,
    pool: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): DrawableOptions = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollide)) __obj.updateDynamic("canCollide")(canCollide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollideFriendBullet)) __obj.updateDynamic("canCollideFriendBullet")(canCollideFriendBullet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collideGroup)) __obj.updateDynamic("collideGroup")(collideGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(layer)) __obj.updateDynamic("layer")(layer.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (!js.isUndefined(pool)) __obj.updateDynamic("pool")(pool.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawableOptions]
  }
}

