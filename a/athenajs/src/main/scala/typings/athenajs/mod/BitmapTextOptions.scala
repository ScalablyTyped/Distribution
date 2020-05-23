package typings.athenajs.mod

import typings.athenajs.anon.Instantiable
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
    behavior: Instantiable = null,
    canCollide: js.UndefOr[Boolean] = js.undefined,
    canCollideFriendBullet: js.UndefOr[Boolean] = js.undefined,
    collideGroup: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    imageId: String = null,
    imageSrc: String = null,
    layer: js.UndefOr[Double] = js.undefined,
    map: Map = null,
    objectId: String = null,
    pool: js.UndefOr[Double] = js.undefined,
    scrollOffsetX: js.UndefOr[Double] = js.undefined,
    scrollOffsetY: js.UndefOr[Double] = js.undefined,
    size: String = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): BitmapTextOptions = {
    val __obj = js.Dynamic.literal(charHeight = charHeight.asInstanceOf[js.Any], charWidth = charWidth.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollide)) __obj.updateDynamic("canCollide")(canCollide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollideFriendBullet)) __obj.updateDynamic("canCollideFriendBullet")(canCollideFriendBullet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collideGroup)) __obj.updateDynamic("collideGroup")(collideGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (imageSrc != null) __obj.updateDynamic("imageSrc")(imageSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(layer)) __obj.updateDynamic("layer")(layer.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (!js.isUndefined(pool)) __obj.updateDynamic("pool")(pool.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollOffsetX)) __obj.updateDynamic("scrollOffsetX")(scrollOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollOffsetY)) __obj.updateDynamic("scrollOffsetY")(scrollOffsetY.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTextOptions]
  }
}

