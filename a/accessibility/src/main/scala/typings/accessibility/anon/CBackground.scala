package typings.accessibility.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CBackground extends js.Object {
  /** @default '#000000' */
  var cBackground: js.UndefOr[String] = js.undefined
  /** @default '#20ff69' */
  var cBorder: js.UndefOr[String] = js.undefined
  /** @default '12px' */
  var height: js.UndefOr[String] = js.undefined
}

object CBackground {
  @scala.inline
  def apply(cBackground: String = null, cBorder: String = null, height: String = null): CBackground = {
    val __obj = js.Dynamic.literal()
    if (cBackground != null) __obj.updateDynamic("cBackground")(cBackground.asInstanceOf[js.Any])
    if (cBorder != null) __obj.updateDynamic("cBorder")(cBorder.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[CBackground]
  }
}

