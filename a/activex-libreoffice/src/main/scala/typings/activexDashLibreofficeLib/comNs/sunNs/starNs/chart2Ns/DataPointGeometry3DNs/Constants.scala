package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataPointGeometry3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.chart2.DataPointGeometry3D.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataPointGeometry3DNs.Constants
  
  @js.native
  sealed trait CUBOID
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataPointGeometry3DNs.Constants
  
  @js.native
  sealed trait CYLINDER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataPointGeometry3DNs.Constants
  
  @js.native
  sealed trait PYRAMID
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataPointGeometry3DNs.Constants
  
  /* 2 */ val CONE: CONE with scala.Double = js.native
  /* 0 */ val CUBOID: CUBOID with scala.Double = js.native
  /* 1 */ val CYLINDER: CYLINDER with scala.Double = js.native
  /* 3 */ val PYRAMID: PYRAMID with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.DataPointGeometry3DNs.Constants with scala.Double
  ] = js.native
}

