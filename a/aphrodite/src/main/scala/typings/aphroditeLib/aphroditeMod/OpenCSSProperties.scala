package typings
package aphroditeLib.aphroditeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For pseudo selectors and media queries
/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick<aphrodite.BaseCSSProperties, std.Exclude<keyof aphrodite.BaseCSSProperties, 'fontFamily' | 'transition' | 'animationName'>>, aphrodite.CSSProperties) */ trait OpenCSSProperties
  extends /* k */ org.scalablytyped.runtime.StringDictionary[
      (js.UndefOr[
        aphroditeLib.FontFamily | js.Array[aphroditeLib.FontFamily] | java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify OpenCSSProperties */ js.Any) | (js.Array[
          /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify OpenCSSProperties */ _
        ])
      ]) | aphroditeLib.CSSProperties
    ] {
  var animationName: js.UndefOr[
    java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify OpenCSSProperties */ js.Any) | (js.Array[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify OpenCSSProperties */ _
    ])
  ] = js.undefined
  var fontFamily: js.UndefOr[aphroditeLib.FontFamily | js.Array[aphroditeLib.FontFamily]] = js.undefined
}

