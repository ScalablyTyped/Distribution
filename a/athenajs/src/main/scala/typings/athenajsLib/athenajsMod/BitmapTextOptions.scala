package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitmapTextOptions extends DrawableOptions {
  var charHeight: scala.Double
  var charWidth: scala.Double
  var height: js.UndefOr[scala.Double] = js.undefined
  var imageId: js.UndefOr[java.lang.String] = js.undefined
  var imageSrc: js.UndefOr[java.lang.String] = js.undefined
  var offsetX: scala.Double
  var scrollOffsetX: js.UndefOr[scala.Double] = js.undefined
  var scrollOffsetY: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var startY: scala.Double
  var text: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object BitmapTextOptions {
  @scala.inline
  def apply(
    charHeight: scala.Double,
    charWidth: scala.Double,
    offsetX: scala.Double,
    startY: scala.Double,
    behavior: athenajsLib.Anon_Options = null,
    canCollide: js.UndefOr[scala.Boolean] = js.undefined,
    canCollideFriendBullet: js.UndefOr[scala.Boolean] = js.undefined,
    collideGroup: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    imageId: java.lang.String = null,
    imageSrc: java.lang.String = null,
    layer: scala.Int | scala.Double = null,
    map: Map = null,
    objectId: java.lang.String = null,
    pool: scala.Int | scala.Double = null,
    scrollOffsetX: scala.Int | scala.Double = null,
    scrollOffsetY: scala.Int | scala.Double = null,
    size: java.lang.String = null,
    text: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): BitmapTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("charHeight")(charHeight)
    __obj.updateDynamic("charWidth")(charWidth)
    __obj.updateDynamic("offsetX")(offsetX)
    __obj.updateDynamic("startY")(startY)
    if (behavior != null) __obj.updateDynamic("behavior")(behavior)
    if (!js.isUndefined(canCollide)) __obj.updateDynamic("canCollide")(canCollide)
    if (!js.isUndefined(canCollideFriendBullet)) __obj.updateDynamic("canCollideFriendBullet")(canCollideFriendBullet)
    if (collideGroup != null) __obj.updateDynamic("collideGroup")(collideGroup.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId)
    if (imageSrc != null) __obj.updateDynamic("imageSrc")(imageSrc)
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (scrollOffsetX != null) __obj.updateDynamic("scrollOffsetX")(scrollOffsetX.asInstanceOf[js.Any])
    if (scrollOffsetY != null) __obj.updateDynamic("scrollOffsetY")(scrollOffsetY.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTextOptions]
  }
}

