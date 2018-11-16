package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgTurbulenceType extends js.Object

@JSGlobal("MSHTML._svgTurbulenceType")
@js.native
object _svgTurbulenceType extends js.Object {
  @js.native
  sealed trait SVG_TURBULENCE_TYPE_FACTALNOISE
    extends activexDashMshtmlLib.MSHTMLNs._svgTurbulenceType
  
  @js.native
  sealed trait SVG_TURBULENCE_TYPE_TURBULENCE
    extends activexDashMshtmlLib.MSHTMLNs._svgTurbulenceType
  
  @js.native
  sealed trait SVG_TURBULENCE_TYPE_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgTurbulenceType
  
  @js.native
  sealed trait svgTurbulenceType_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgTurbulenceType
  
  /* 1 */ val SVG_TURBULENCE_TYPE_FACTALNOISE: SVG_TURBULENCE_TYPE_FACTALNOISE with scala.Double = js.native
  /* 2 */ val SVG_TURBULENCE_TYPE_TURBULENCE: SVG_TURBULENCE_TYPE_TURBULENCE with scala.Double = js.native
  /* 0 */ val SVG_TURBULENCE_TYPE_UNKNOWN: SVG_TURBULENCE_TYPE_UNKNOWN with scala.Double = js.native
  /* 2147483647 */ val svgTurbulenceType_Max: svgTurbulenceType_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgTurbulenceType with scala.Double] = js.native
}

