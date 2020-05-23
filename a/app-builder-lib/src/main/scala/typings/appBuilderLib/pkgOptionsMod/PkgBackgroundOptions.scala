package typings.appBuilderLib.pkgOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PkgBackgroundOptions extends js.Object {
  /**
    * Alignment of the background image.
    * Options are: center, left, right, top, bottom, topleft, topright, bottomleft, bottomright
    * @default center
    */
  var alignment: js.UndefOr[BackgroundAlignment | Null] = js.undefined
  /**
    * Path to the image to use as an installer background.
    */
  var file: js.UndefOr[String] = js.undefined
  /**
    * Scaling of the background image.
    * Options are: tofit, none, proportional
    * @default tofit
    */
  var scaling: js.UndefOr[BackgroundScaling | Null] = js.undefined
}

object PkgBackgroundOptions {
  @scala.inline
  def apply(
    alignment: js.UndefOr[Null | BackgroundAlignment] = js.undefined,
    file: String = null,
    scaling: js.UndefOr[Null | BackgroundScaling] = js.undefined
  ): PkgBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignment)) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(scaling)) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[PkgBackgroundOptions]
  }
}

