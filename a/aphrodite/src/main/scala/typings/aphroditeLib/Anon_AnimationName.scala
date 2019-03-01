package typings
package aphroditeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationName extends js.Object {
  var animationName: js.UndefOr[
    java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ js.Any) | (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ _
    ])
  ] = js.undefined
  var fontFamily: js.UndefOr[FontFamily | js.Array[FontFamily]] = js.undefined
}

object Anon_AnimationName {
  @scala.inline
  def apply(
    animationName: java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ js.Any) | (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ _
    ]) = null,
    fontFamily: FontFamily | js.Array[FontFamily] = null
  ): Anon_AnimationName = {
    val __obj = js.Dynamic.literal()
    if (animationName != null) __obj.updateDynamic("animationName")(animationName.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimationName]
  }
}

