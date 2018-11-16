package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleBidi extends js.Object

@JSGlobal("MSHTML._styleBidi")
@js.native
object _styleBidi extends js.Object {
  @js.native
  sealed trait styleBidiEmbed
    extends activexDashMshtmlLib.MSHTMLNs._styleBidi
  
  @js.native
  sealed trait styleBidiInherit
    extends activexDashMshtmlLib.MSHTMLNs._styleBidi
  
  @js.native
  sealed trait styleBidiNormal
    extends activexDashMshtmlLib.MSHTMLNs._styleBidi
  
  @js.native
  sealed trait styleBidiNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleBidi
  
  @js.native
  sealed trait styleBidiOverride
    extends activexDashMshtmlLib.MSHTMLNs._styleBidi
  
  @js.native
  sealed trait styleBidi_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleBidi
  
  /* 2 */ val styleBidiEmbed: styleBidiEmbed with scala.Double = js.native
  /* 4 */ val styleBidiInherit: styleBidiInherit with scala.Double = js.native
  /* 1 */ val styleBidiNormal: styleBidiNormal with scala.Double = js.native
  /* 0 */ val styleBidiNotSet: styleBidiNotSet with scala.Double = js.native
  /* 3 */ val styleBidiOverride: styleBidiOverride with scala.Double = js.native
  /* 2147483647 */ val styleBidi_Max: styleBidi_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleBidi with scala.Double] = js.native
}

