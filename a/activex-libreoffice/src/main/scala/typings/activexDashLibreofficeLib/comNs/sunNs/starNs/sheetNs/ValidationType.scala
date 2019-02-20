package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationType extends js.Object

/** used to specify which cell contents are treated as valid. */
@JSGlobal("com.sun.star.sheet.ValidationType")
@js.native
object ValidationType extends js.Object {
  /** any cell content is valid; no conditions are used. */
  @js.native
  sealed trait ANY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationType
  
  /** The specified formula determines which contents are valid. */
  @js.native
  sealed trait CUSTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationType
  
  /**
    * specifies an arithmetic series for date values. <p>Cell by cell, the value used to fill the cells is increased
    *
    * by a specified number of days</p>
    * @@see com::sun::star::sheet::FillDateMode  any date value matching the specified condition is valid.
    */
  @js.native
  sealed trait DATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationType
  
  /** any number matching the specified condition is valid. */
  @js.native
  sealed trait DECIMAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationType
  
  /** Only strings from a specified list are valid. */
  @js.native
  sealed trait LIST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationType
  
  /** string is valid if its length matches the specified condition. */
  @js.native
  sealed trait TEXT_LEN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationType
  
  /** any time value matching the specified condition is valid. */
  @js.native
  sealed trait TIME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationType
  
  /** any whole number matching the specified condition is valid. */
  @js.native
  sealed trait WHOLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationType
  
  /* 0 */ val ANY: ANY with scala.Double = js.native
  /* 7 */ val CUSTOM: CUSTOM with scala.Double = js.native
  /* 3 */ val DATE: DATE with scala.Double = js.native
  /* 2 */ val DECIMAL: DECIMAL with scala.Double = js.native
  /* 6 */ val LIST: LIST with scala.Double = js.native
  /* 5 */ val TEXT_LEN: TEXT_LEN with scala.Double = js.native
  /* 4 */ val TIME: TIME with scala.Double = js.native
  /* 1 */ val WHOLE: WHOLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ValidationType with scala.Double
  ] = js.native
}

