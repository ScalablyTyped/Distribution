package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aphroditeLib {
  type BaseCSSProperties = /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify CSS.Properties<number | string> */ js.Any
  type CSSProperties = (Omit[
    BaseCSSProperties, 
    aphroditeLib.aphroditeLibStrings.fontFamily | aphroditeLib.aphroditeLibStrings.transition | aphroditeLib.aphroditeLibStrings.animationName
  ]) with Anon_AnimationName
  type FontFamily = js.Any
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
}
