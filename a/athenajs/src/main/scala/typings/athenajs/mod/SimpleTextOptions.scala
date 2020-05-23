package typings.athenajs.mod

import typings.athenajs.anon.Instantiable
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
    behavior: Instantiable = null,
    canCollide: js.UndefOr[Boolean] = js.undefined,
    canCollideFriendBullet: js.UndefOr[Boolean] = js.undefined,
    collideGroup: js.UndefOr[Double] = js.undefined,
    color: String = null,
    fontFace: String = null,
    fontSize: String = null,
    fontStyle: String = null,
    fontWeight: String = null,
    height: js.UndefOr[Double] = js.undefined,
    layer: js.UndefOr[Double] = js.undefined,
    map: Map = null,
    objectId: String = null,
    pool: js.UndefOr[Double] = js.undefined,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): SimpleTextOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollide)) __obj.updateDynamic("canCollide")(canCollide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canCollideFriendBullet)) __obj.updateDynamic("canCollideFriendBullet")(canCollideFriendBullet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collideGroup)) __obj.updateDynamic("collideGroup")(collideGroup.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFace != null) __obj.updateDynamic("fontFace")(fontFace.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(layer)) __obj.updateDynamic("layer")(layer.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (!js.isUndefined(pool)) __obj.updateDynamic("pool")(pool.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleTextOptions]
  }
}

