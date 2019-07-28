package typings.aphrodite

import typings.aphrodite.aphroditeMod.FontFamily
import typings.aphrodite.aphroditeMod.OpenCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationName extends js.Object {
  var animationName: js.UndefOr[String | OpenCSSProperties | js.Array[OpenCSSProperties]] = js.undefined
  var fontFamily: js.UndefOr[FontFamily | js.Array[FontFamily]] = js.undefined
}

object Anon_AnimationName {
  @scala.inline
  def apply(
    animationName: String | OpenCSSProperties | js.Array[OpenCSSProperties] = null,
    fontFamily: FontFamily | js.Array[FontFamily] = null
  ): Anon_AnimationName = {
    val __obj = js.Dynamic.literal()
    if (animationName != null) __obj.updateDynamic("animationName")(animationName.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimationName]
  }
}

