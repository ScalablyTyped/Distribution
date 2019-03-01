package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawableOptions extends js.Object {
  var behavior: js.UndefOr[athenajsLib.Anon_Options] = js.undefined
  var canCollide: js.UndefOr[scala.Boolean] = js.undefined
  var canCollideFriendBullet: js.UndefOr[scala.Boolean] = js.undefined
  var collideGroup: js.UndefOr[scala.Double] = js.undefined
  var layer: js.UndefOr[scala.Double] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var pool: js.UndefOr[scala.Double] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object DrawableOptions {
  @scala.inline
  def apply(
    behavior: athenajsLib.Anon_Options = null,
    canCollide: js.UndefOr[scala.Boolean] = js.undefined,
    canCollideFriendBullet: js.UndefOr[scala.Boolean] = js.undefined,
    collideGroup: scala.Int | scala.Double = null,
    layer: scala.Int | scala.Double = null,
    map: Map = null,
    objectId: java.lang.String = null,
    pool: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): DrawableOptions = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior)
    if (!js.isUndefined(canCollide)) __obj.updateDynamic("canCollide")(canCollide)
    if (!js.isUndefined(canCollideFriendBullet)) __obj.updateDynamic("canCollideFriendBullet")(canCollideFriendBullet)
    if (collideGroup != null) __obj.updateDynamic("collideGroup")(collideGroup.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawableOptions]
  }
}

