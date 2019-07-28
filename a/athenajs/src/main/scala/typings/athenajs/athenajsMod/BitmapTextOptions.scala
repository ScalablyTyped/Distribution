package typings.athenajs.athenajsMod

import typings.athenajs.Anon_Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitmapTextOptions extends DrawableOptions {
  var charHeight: Double
  var charWidth: Double
  var height: js.UndefOr[Double] = js.undefined
  var imageId: js.UndefOr[String] = js.undefined
  var imageSrc: js.UndefOr[String] = js.undefined
  var offsetX: Double
  var scrollOffsetX: js.UndefOr[Double] = js.undefined
  var scrollOffsetY: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var startY: Double
  var text: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object BitmapTextOptions {
  @scala.inline
  def apply(
    charHeight: Double,
    charWidth: Double,
    offsetX: Double,
    startY: Double,
    behavior: Anon_Options = null,
    canCollide: js.UndefOr[Boolean] = js.undefined,
    canCollideFriendBullet: js.UndefOr[Boolean] = js.undefined,
    collideGroup: Int | Double = null,
    height: Int | Double = null,
    imageId: String = null,
    imageSrc: String = null,
    layer: Int | Double = null,
    map: Map = null,
    objectId: String = null,
    pool: Int | Double = null,
    scrollOffsetX: Int | Double = null,
    scrollOffsetY: Int | Double = null,
    size: String = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): BitmapTextOptions = {
    val __obj = js.Dynamic.literal(charHeight = charHeight, charWidth = charWidth, offsetX = offsetX, startY = startY)
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

