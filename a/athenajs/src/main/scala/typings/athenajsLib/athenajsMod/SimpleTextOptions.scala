package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTextOptions extends DrawableOptions {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontFace: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SimpleTextOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    behavior: athenajsLib.Anon_Options = null,
    canCollide: js.UndefOr[scala.Boolean] = js.undefined,
    canCollideFriendBullet: js.UndefOr[scala.Boolean] = js.undefined,
    collideGroup: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    fontFace: java.lang.String = null,
    fontSize: java.lang.String = null,
    fontStyle: java.lang.String = null,
    fontWeight: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    layer: scala.Int | scala.Double = null,
    map: Map = null,
    objectId: java.lang.String = null,
    pool: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): SimpleTextOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (behavior != null) __obj.updateDynamic("behavior")(behavior)
    if (!js.isUndefined(canCollide)) __obj.updateDynamic("canCollide")(canCollide)
    if (!js.isUndefined(canCollideFriendBullet)) __obj.updateDynamic("canCollideFriendBullet")(canCollideFriendBullet)
    if (collideGroup != null) __obj.updateDynamic("collideGroup")(collideGroup.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFace != null) __obj.updateDynamic("fontFace")(fontFace)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleTextOptions]
  }
}

