package typings.ansiDashEscapes.ansiDashEscapesMod

import typings.ansiDashEscapes.ansiDashEscapesStrings.auto
import typings.typeDashFest.typeDashFestMod.LiteralUnion
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
  val height: js.UndefOr[LiteralUnion[auto, Double | String]] = js.undefined
  val preserveAspectRatio: js.UndefOr[Boolean] = js.undefined
  /**
  		The width is given as a number followed by a unit, or the word `'auto'`.
  		- `N`: N character cells.
  		- `Npx`: N pixels.
  		- `N%`: N percent of the session's width or height.
  		- `auto`: The image's inherent size will be used to determine an appropriate dimension.
  		*/
  val width: js.UndefOr[LiteralUnion[auto, Double | String]] = js.undefined
}

object ImageOptions {
  @scala.inline
  def apply(
    height: LiteralUnion[auto, Double | String] = null,
    preserveAspectRatio: js.UndefOr[Boolean] = js.undefined,
    width: LiteralUnion[auto, Double | String] = null
  ): ImageOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveAspectRatio)) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
}

