package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeneralFunction extends js.Object

/** used to specify a function to be calculated from values. */
@JSGlobal("com.sun.star.sheet.GeneralFunction")
@js.native
object GeneralFunction extends js.Object {
  /**
    * specifies the use of a user-defined list. <p>The cells are filled using a user-defined series.</p>
    *
    *
    *
    * function is determined automatically. <p>If the values are all numerical, SUM is used, otherwise COUNT.</p>
    */
  @js.native
  sealed trait AUTO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /** average of all numerical values is calculated. */
  @js.native
  sealed trait AVERAGE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /** all values, including non-numerical values, are counted. */
  @js.native
  sealed trait COUNT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /** numerical values are counted. */
  @js.native
  sealed trait COUNTNUMS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /** maximum value of all numerical values is calculated. */
  @js.native
  sealed trait MAX
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /** minimum value of all numerical values is calculated. */
  @js.native
  sealed trait MIN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /**
    * no cells are moved.
    *
    * no condition is specified.
    *
    * nothing is imported.
    *
    * nothing is calculated.
    *
    * new values are used without changes.
    *
    * sheet is not linked.
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /** product of all numerical values is calculated. */
  @js.native
  sealed trait PRODUCT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /** standard deviation is calculated based on a sample. */
  @js.native
  sealed trait STDEV
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /** standard deviation is calculated based on the entire population. */
  @js.native
  sealed trait STDEVP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /** sum of all numerical values is calculated. */
  @js.native
  sealed trait SUM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /** variance is calculated based on a sample. */
  @js.native
  sealed trait VAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /** variance is calculated based on the entire population. */
  @js.native
  sealed trait VARP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction
  
  /* 1 */ val AUTO: AUTO with scala.Double = js.native
  /* 4 */ val AVERAGE: AVERAGE with scala.Double = js.native
  /* 3 */ val COUNT: COUNT with scala.Double = js.native
  /* 8 */ val COUNTNUMS: COUNTNUMS with scala.Double = js.native
  /* 5 */ val MAX: MAX with scala.Double = js.native
  /* 6 */ val MIN: MIN with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 7 */ val PRODUCT: PRODUCT with scala.Double = js.native
  /* 9 */ val STDEV: STDEV with scala.Double = js.native
  /* 10 */ val STDEVP: STDEVP with scala.Double = js.native
  /* 2 */ val SUM: SUM with scala.Double = js.native
  /* 11 */ val VAR: VAR with scala.Double = js.native
  /* 12 */ val VARP: VARP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.GeneralFunction with scala.Double
  ] = js.native
}

