package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisArrangeOrderType extends js.Object

/** Values specify the arrangement of the axes descriptions. */
@JSGlobal("com.sun.star.chart.ChartAxisArrangeOrderType")
@js.native
object ChartAxisArrangeOrderType extends js.Object {
  /**
    * The descriptions are arranged automatically. <p>If there is enough space to put them side by side, this
    *
    * arrangement is preferred. If the descriptions would overlap
    *
    * when arranged side by side, they are staggered.</p>
    */
  @js.native
  sealed trait AUTO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisArrangeOrderType
  
  /** The descriptions are arranged side by side. */
  @js.native
  sealed trait SIDE_BY_SIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisArrangeOrderType
  
  /** The descriptions are alternately put on two lines with the even values out of the normal line. */
  @js.native
  sealed trait STAGGER_EVEN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisArrangeOrderType
  
  /** The descriptions are alternately put on two lines with the odd values out of the normal line. */
  @js.native
  sealed trait STAGGER_ODD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisArrangeOrderType
  
  /* 0 */ val AUTO: AUTO with scala.Double = js.native
  /* 1 */ val SIDE_BY_SIDE: SIDE_BY_SIDE with scala.Double = js.native
  /* 2 */ val STAGGER_EVEN: STAGGER_EVEN with scala.Double = js.native
  /* 3 */ val STAGGER_ODD: STAGGER_ODD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisArrangeOrderType with scala.Double
  ] = js.native
}

