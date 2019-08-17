package typings.aphrodite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aphroditeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.aphrodite.Anon_AnimationName
  import typings.aphrodite.Omit
  import typings.aphrodite.aphroditeStrings.animationName
  import typings.aphrodite.aphroditeStrings.fontFamily
  import typings.aphrodite.aphroditeStrings.transition
  import typings.csstype.csstypeMod.FontFace
  import typings.csstype.csstypeMod.FontFamilyProperty
  import typings.csstype.csstypeMod.Properties

  type BaseCSSProperties = Properties[Double | String]
  type CSSProperties = (Omit[BaseCSSProperties, fontFamily | transition | animationName]) with Anon_AnimationName
  type FontFamily = js.UndefOr[FontFamilyProperty | FontFace]
  type StyleDeclaration = StringDictionary[OpenCSSProperties]
}
