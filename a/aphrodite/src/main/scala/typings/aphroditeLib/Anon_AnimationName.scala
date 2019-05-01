package typings
package aphroditeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationName extends js.Object {
  var animationName: js.UndefOr[
    java.lang.String | aphroditeLib.aphroditeMod.OpenCSSProperties | js.Array[aphroditeLib.aphroditeMod.OpenCSSProperties]
  ] = js.undefined
  var fontFamily: js.UndefOr[
    aphroditeLib.aphroditeMod.FontFamily | js.Array[aphroditeLib.aphroditeMod.FontFamily]
  ] = js.undefined
}

object Anon_AnimationName {
  @scala.inline
  def apply(
    animationName: java.lang.String | aphroditeLib.aphroditeMod.OpenCSSProperties | js.Array[aphroditeLib.aphroditeMod.OpenCSSProperties] = null,
    fontFamily: aphroditeLib.aphroditeMod.FontFamily | js.Array[aphroditeLib.aphroditeMod.FontFamily] = null
  ): Anon_AnimationName = {
    val __obj = js.Dynamic.literal()
    if (animationName != null) __obj.updateDynamic("animationName")(animationName.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimationName]
  }
}

