package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgAngleType extends js.Object

@JSGlobal("MSHTML._svgAngleType")
@js.native
object _svgAngleType extends js.Object {
  @js.native
  sealed trait SVG_ANGLETYPE_DEG
    extends activexDashMshtmlLib.MSHTMLNs._svgAngleType
  
  @js.native
  sealed trait SVG_ANGLETYPE_GRAD
    extends activexDashMshtmlLib.MSHTMLNs._svgAngleType
  
  @js.native
  sealed trait SVG_ANGLETYPE_RAD
    extends activexDashMshtmlLib.MSHTMLNs._svgAngleType
  
  @js.native
  sealed trait SVG_ANGLETYPE_UNKNOWN
    extends activexDashMshtmlLib.MSHTMLNs._svgAngleType
  
  @js.native
  sealed trait SVG_ANGLETYPE_UNSPECIFIED
    extends activexDashMshtmlLib.MSHTMLNs._svgAngleType
  
  @js.native
  sealed trait svgAngleType_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgAngleType
  
  /* 2 */ val SVG_ANGLETYPE_DEG: SVG_ANGLETYPE_DEG with scala.Double = js.native
  /* 4 */ val SVG_ANGLETYPE_GRAD: SVG_ANGLETYPE_GRAD with scala.Double = js.native
  /* 3 */ val SVG_ANGLETYPE_RAD: SVG_ANGLETYPE_RAD with scala.Double = js.native
  /* 0 */ val SVG_ANGLETYPE_UNKNOWN: SVG_ANGLETYPE_UNKNOWN with scala.Double = js.native
  /* 1 */ val SVG_ANGLETYPE_UNSPECIFIED: SVG_ANGLETYPE_UNSPECIFIED with scala.Double = js.native
  /* 2147483647 */ val svgAngleType_Max: svgAngleType_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgAngleType with scala.Double] = js.native
}

