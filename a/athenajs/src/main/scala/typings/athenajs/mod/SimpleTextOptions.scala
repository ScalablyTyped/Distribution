package typings.athenajs.mod

import typings.athenajs.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTextOptions extends DrawableOptions {
  var align: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fontFace: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var fontWeight: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SimpleTextOptions {
  @scala.inline
  def apply(
    align: String = null,
    behavior: AnonInstantiable = null,
    canCollide: js.UndefOr[Boolean] = js.undefined,
    canCollideFriendBullet: js.UndefOr[Boolean] = js.undefined,
    collideGroup: Int | Double = null,
    color: String = null,
    fontFace: String = null,
    fontSize: String = null,
    fontStyle: String = null,
    fontWeight: String = null,
    height: Int | Double = null,
    layer: Int | Double = null,
    map: Map = null,
    objectId: String = null,
    pool: Int | Double = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): SimpleTextOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollide)) __obj.updateDynamic("canCollide")(canCollide.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollideFriendBullet)) __obj.updateDynamic("canCollideFriendBullet")(canCollideFriendBullet.asInstanceOf[js.Any])
    if (collideGroup != null) __obj.updateDynamic("collideGroup")(collideGroup.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFace != null) __obj.updateDynamic("fontFace")(fontFace.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleTextOptions]
  }
}

