package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgExternalResourcesRequired extends js.Object

@JSGlobal("MSHTML._svgExternalResourcesRequired")
@js.native
object _svgExternalResourcesRequired extends js.Object {
  @js.native
  sealed trait svgExternalResourcesRequiredFalse
    extends activexDashMshtmlLib.MSHTMLNs._svgExternalResourcesRequired
  
  @js.native
  sealed trait svgExternalResourcesRequiredTrue
    extends activexDashMshtmlLib.MSHTMLNs._svgExternalResourcesRequired
  
  @js.native
  sealed trait svgExternalResourcesRequired_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgExternalResourcesRequired
  
  /* 0 */ val svgExternalResourcesRequiredFalse: svgExternalResourcesRequiredFalse with scala.Double = js.native
  /* 1 */ val svgExternalResourcesRequiredTrue: svgExternalResourcesRequiredTrue with scala.Double = js.native
  /* 2147483647 */ val svgExternalResourcesRequired_Max: svgExternalResourcesRequired_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgExternalResourcesRequired with scala.Double] = js.native
}

