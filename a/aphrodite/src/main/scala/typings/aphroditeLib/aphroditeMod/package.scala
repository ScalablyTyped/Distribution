package typings
package aphroditeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aphroditeMod {
  type BaseCSSProperties = csstypeLib.csstypeMod.Properties[scala.Double | java.lang.String]
  type CSSProperties = (aphroditeLib.Omit[
    BaseCSSProperties, 
    aphroditeLib.aphroditeLibStrings.fontFamily | aphroditeLib.aphroditeLibStrings.transition | aphroditeLib.aphroditeLibStrings.animationName
  ]) with aphroditeLib.Anon_AnimationName
  type FontFamily = js.UndefOr[csstypeLib.csstypeMod.FontFamilyProperty | csstypeLib.csstypeMod.FontFace]
  type StyleDeclaration = org.scalablytyped.runtime.StringDictionary[OpenCSSProperties]
}
