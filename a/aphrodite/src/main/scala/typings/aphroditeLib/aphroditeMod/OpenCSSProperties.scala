package typings
package aphroditeLib.aphroditeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For pseudo selectors and media queries
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof aphrodite.aphrodite.BaseCSSProperties, 'fontFamily' | 'transition' | 'animationName'> ]: aphrodite.aphrodite.BaseCSSProperties[P]} */ trait OpenCSSProperties
  extends aphroditeLib.Anon_AnimationName
     with /* k */ org.scalablytyped.runtime.StringDictionary[
      (/* import warning: ImportType.apply Failed type conversion: aphrodite.aphrodite.CSSProperties[keyof aphrodite.aphrodite.CSSProperties] */ js.Any) | CSSProperties
    ]

object OpenCSSProperties {
  @scala.inline
  def apply(
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[
      (/* import warning: ImportType.apply Failed type conversion: aphrodite.aphrodite.CSSProperties[keyof aphrodite.aphrodite.CSSProperties] */ js.Any) | CSSProperties
    ] = null,
    animationName: java.lang.String | OpenCSSProperties | js.Array[OpenCSSProperties] = null,
    fontFamily: FontFamily | js.Array[FontFamily] = null
  ): OpenCSSProperties = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationName != null) __obj.updateDynamic("animationName")(animationName.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCSSProperties]
  }
}

