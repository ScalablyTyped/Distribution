package typings.aphrodite.aphroditeMod

import org.scalablytyped.runtime.StringDictionary
import typings.aphrodite.Anon_AnimationName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For pseudo selectors and media queries
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof aphrodite.aphrodite.BaseCSSProperties, 'fontFamily' | 'transition' | 'animationName'> ]: aphrodite.aphrodite.BaseCSSProperties[P]} */ trait OpenCSSProperties
  extends Anon_AnimationName
     with /* k */ StringDictionary[
      (/* import warning: ImportType.apply Failed type conversion: aphrodite.aphrodite.CSSProperties[keyof aphrodite.aphrodite.CSSProperties] */ js.Any) | CSSProperties
    ]

object OpenCSSProperties {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[
      (/* import warning: ImportType.apply Failed type conversion: aphrodite.aphrodite.CSSProperties[keyof aphrodite.aphrodite.CSSProperties] */ js.Any) | CSSProperties
    ] = null,
    animationName: String | OpenCSSProperties | js.Array[OpenCSSProperties] = null,
    fontFamily: FontFamily | js.Array[FontFamily] = null
  ): OpenCSSProperties = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationName != null) __obj.updateDynamic("animationName")(animationName.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCSSProperties]
  }
}

