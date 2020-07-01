package typings.accessibility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  /** @default '#4054b2' */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** @default false */
  var circular: js.UndefOr[Boolean] = js.undefined
  /** @default false */
  var circularBorder: js.UndefOr[Boolean] = js.undefined
  /** @default '#fff' */
  var color: js.UndefOr[String] = js.undefined
  var dimensions: js.UndefOr[Dimensions] = js.undefined
  /** @default 'Material Icons' */
  var fontClass: js.UndefOr[String] = js.undefined
  /** @default ['https://fonts.googleapis.com/icon?family=Material+Icons'] */
  var fontFaceSrc: js.UndefOr[js.Array[String]] = js.undefined
  /** @default 'Material Icons' */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** @default 'accessible' */
  var img: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  /** @default false */
  var useEmojis: js.UndefOr[Boolean] = js.undefined
  /** @default '9999' */
  var zIndex: js.UndefOr[String | Double] = js.undefined
}

object Icon {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    circular: js.UndefOr[Boolean] = js.undefined,
    circularBorder: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dimensions: Dimensions = null,
    fontClass: String = null,
    fontFaceSrc: js.Array[String] = null,
    fontFamily: String = null,
    img: String = null,
    position: Position = null,
    useEmojis: js.UndefOr[Boolean] = js.undefined,
    zIndex: String | Double = null
  ): Icon = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.get.asInstanceOf[js.Any])
    if (!js.isUndefined(circularBorder)) __obj.updateDynamic("circularBorder")(circularBorder.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (fontClass != null) __obj.updateDynamic("fontClass")(fontClass.asInstanceOf[js.Any])
    if (fontFaceSrc != null) __obj.updateDynamic("fontFaceSrc")(fontFaceSrc.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmojis)) __obj.updateDynamic("useEmojis")(useEmojis.get.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

