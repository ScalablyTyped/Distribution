package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.graphic.GraphicType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait EMPTY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicTypeNs.Constants
  
  @js.native
  sealed trait PIXEL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicTypeNs.Constants
  
  @js.native
  sealed trait VECTOR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicTypeNs.Constants
  
  /* 0 */ val EMPTY: EMPTY with scala.Double = js.native
  /* 1 */ val PIXEL: PIXEL with scala.Double = js.native
  /* 2 */ val VECTOR: VECTOR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.GraphicTypeNs.Constants with scala.Double
  ] = js.native
}

