package typings
package aphroditeLib.aphroditeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For pseudo selectors and media queries
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof aphrodite.BaseCSSProperties, 'fontFamily' | 'transition' | 'animationName'> ]: aphrodite.BaseCSSProperties[P]}
- Lifted 2 members from Set(aphrodite.CSSProperties) */ trait OpenCSSProperties
  extends /* k */ org.scalablytyped.runtime.StringDictionary[
      (js.UndefOr[
        aphroditeLib.FontFamily | js.Array[aphroditeLib.FontFamily] | java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ js.Any) | (js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ _
        ])
      ]) | aphroditeLib.CSSProperties
    ] {
  var animationName: js.UndefOr[
    java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ js.Any) | (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ _
    ])
  ] = js.undefined
  var fontFamily: js.UndefOr[aphroditeLib.FontFamily | js.Array[aphroditeLib.FontFamily]] = js.undefined
}

object OpenCSSProperties {
  @scala.inline
  def apply(
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[
      (js.UndefOr[
        aphroditeLib.FontFamily | js.Array[aphroditeLib.FontFamily] | java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ js.Any) | (js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ _
        ])
      ]) | aphroditeLib.CSSProperties
    ] = null,
    animationName: java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ js.Any) | (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenCSSProperties */ _
    ]) = null,
    fontFamily: aphroditeLib.FontFamily | js.Array[aphroditeLib.FontFamily] = null
  ): OpenCSSProperties = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationName != null) __obj.updateDynamic("animationName")(animationName.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCSSProperties]
  }
}

