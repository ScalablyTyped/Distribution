package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleFontVariant extends js.Object

@JSGlobal("MSHTML._styleFontVariant")
@js.native
object _styleFontVariant extends js.Object {
  @js.native
  sealed trait styleFontVariantNormal
    extends activexDashMshtmlLib.MSHTMLNs._styleFontVariant
  
  @js.native
  sealed trait styleFontVariantNotSet
    extends activexDashMshtmlLib.MSHTMLNs._styleFontVariant
  
  @js.native
  sealed trait styleFontVariantSmallCaps
    extends activexDashMshtmlLib.MSHTMLNs._styleFontVariant
  
  @js.native
  sealed trait styleFontVariant_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleFontVariant
  
  /* 2 */ val styleFontVariantNormal: styleFontVariantNormal with scala.Double = js.native
  /* 0 */ val styleFontVariantNotSet: styleFontVariantNotSet with scala.Double = js.native
  /* 1 */ val styleFontVariantSmallCaps: styleFontVariantSmallCaps with scala.Double = js.native
  /* 2147483647 */ val styleFontVariant_Max: styleFontVariant_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleFontVariant with scala.Double] = js.native
}

