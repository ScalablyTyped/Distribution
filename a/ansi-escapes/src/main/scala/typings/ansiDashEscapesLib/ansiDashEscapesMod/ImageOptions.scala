package typings
package ansiDashEscapesLib.ansiDashEscapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOptions extends js.Object {
  /**
  		The height is given as a number followed by a unit, or the word `'auto'`.
  		- `N`: N character cells.
  		- `Npx`: N pixels.
  		- `N%`: N percent of the session's width or height.
  		- `auto`: The image's inherent size will be used to determine an appropriate dimension.
  		*/
  val height: js.UndefOr[
    typeDashFestLib.typeDashFestMod.LiteralUnion[ansiDashEscapesLib.ansiDashEscapesLibStrings.auto, scala.Double | java.lang.String]
  ] = js.undefined
  val preserveAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		The width is given as a number followed by a unit, or the word `'auto'`.
  		- `N`: N character cells.
  		- `Npx`: N pixels.
  		- `N%`: N percent of the session's width or height.
  		- `auto`: The image's inherent size will be used to determine an appropriate dimension.
  		*/
  val width: js.UndefOr[
    typeDashFestLib.typeDashFestMod.LiteralUnion[ansiDashEscapesLib.ansiDashEscapesLibStrings.auto, scala.Double | java.lang.String]
  ] = js.undefined
}

object ImageOptions {
  @scala.inline
  def apply(
    height: typeDashFestLib.typeDashFestMod.LiteralUnion[ansiDashEscapesLib.ansiDashEscapesLibStrings.auto, scala.Double | java.lang.String] = null,
    preserveAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    width: typeDashFestLib.typeDashFestMod.LiteralUnion[ansiDashEscapesLib.ansiDashEscapesLibStrings.auto, scala.Double | java.lang.String] = null
  ): ImageOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveAspectRatio)) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
}

