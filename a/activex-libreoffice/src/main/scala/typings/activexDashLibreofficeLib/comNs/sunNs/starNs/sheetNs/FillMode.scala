package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FillMode extends js.Object

/** used to specify the series type used to fill cells. */
@JSGlobal("com.sun.star.sheet.FillMode")
@js.native
object FillMode extends js.Object {
  /**
    * specifies the use of a user-defined list. <p>The cells are filled using a user-defined series.</p>
    *
    *
    *
    * function is determined automatically. <p>If the values are all numerical, SUM is used, otherwise COUNT.</p>
    */
  @js.native
  sealed trait AUTO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillMode
  
  /**
    * specifies an arithmetic series for date values. <p>Cell by cell, the value used to fill the cells is increased
    *
    * by a specified number of days</p>
    * @@see com::sun::star::sheet::FillDateMode  any date value matching the specified condition is valid.
    */
  @js.native
  sealed trait DATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillMode
  
  /**
    * specifies a geometric series. <p>Cell by cell, the value used to fill the cells is multiplied
    *
    * by a specified value.</p>
    */
  @js.native
  sealed trait GROWTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillMode
  
  /**
    * specifies an arithmetic series. <p>Cell by cell, the value used to fill the cells is increased
    *
    * by an additive value.</p>
    */
  @js.native
  sealed trait LINEAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillMode
  
  /** specifies a constant series. <p>All cells are filled with the same value.</p> */
  @js.native
  sealed trait SIMPLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillMode
  
  /* 4 */ val AUTO: AUTO with scala.Double = js.native
  /* 3 */ val DATE: DATE with scala.Double = js.native
  /* 2 */ val GROWTH: GROWTH with scala.Double = js.native
  /* 1 */ val LINEAR: LINEAR with scala.Double = js.native
  /* 0 */ val SIMPLE: SIMPLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillMode with scala.Double] = js.native
}

