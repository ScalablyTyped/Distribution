package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _svgMarkerOrientAttribute extends js.Object

@JSGlobal("MSHTML._svgMarkerOrientAttribute")
@js.native
object _svgMarkerOrientAttribute extends js.Object {
  @js.native
  sealed trait svgMarkerOrientAttributeAuto
    extends activexDashMshtmlLib.MSHTMLNs._svgMarkerOrientAttribute
  
  @js.native
  sealed trait svgMarkerOrientAttribute_Max
    extends activexDashMshtmlLib.MSHTMLNs._svgMarkerOrientAttribute
  
  /* 0 */ val svgMarkerOrientAttributeAuto: svgMarkerOrientAttributeAuto with scala.Double = js.native
  /* 2147483647 */ val svgMarkerOrientAttribute_Max: svgMarkerOrientAttribute_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._svgMarkerOrientAttribute with scala.Double] = js.native
}

