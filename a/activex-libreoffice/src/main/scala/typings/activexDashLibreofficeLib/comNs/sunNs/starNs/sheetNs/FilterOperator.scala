package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterOperator extends js.Object

/** specifies the type of a single condition in a filter descriptor. */
@JSGlobal("com.sun.star.sheet.FilterOperator")
@js.native
object FilterOperator extends js.Object {
  /** selects a specified percentage of entries with the lowest values. */
  @js.native
  sealed trait BOTTOM_PERCENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /** selects a specified number of entries with the lowest values. */
  @js.native
  sealed trait BOTTOM_VALUES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /** selects empty entries. */
  @js.native
  sealed trait EMPTY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /** value has to be equal to the specified value. */
  @js.native
  sealed trait EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /**
    * the value has to be greater than the specified value.
    *
    * value has to be greater than the specified value.
    */
  @js.native
  sealed trait GREATER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /**
    * the value has to be greater than or equal to the specified value.
    *
    * value has to be greater than or equal to the specified value.
    */
  @js.native
  sealed trait GREATER_EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /**
    * the value has to be less than the specified value.
    *
    * value has to be less than the specified value.
    */
  @js.native
  sealed trait LESS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /**
    * the value has to be less than or equal to the specified value.
    *
    * value has to be less than or equal to the specified value.
    */
  @js.native
  sealed trait LESS_EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /** selects non-empty entries. */
  @js.native
  sealed trait NOT_EMPTY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /**
    * the value must not be equal to the specified value.
    *
    * value must not be equal to the specified value.
    */
  @js.native
  sealed trait NOT_EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /** selects a specified percentage of entries with the greatest values. */
  @js.native
  sealed trait TOP_PERCENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /** selects a specified number of entries with the greatest values. */
  @js.native
  sealed trait TOP_VALUES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator
  
  /* 11 */ val BOTTOM_PERCENT: BOTTOM_PERCENT with scala.Double = js.native
  /* 10 */ val BOTTOM_VALUES: BOTTOM_VALUES with scala.Double = js.native
  /* 0 */ val EMPTY: EMPTY with scala.Double = js.native
  /* 2 */ val EQUAL: EQUAL with scala.Double = js.native
  /* 4 */ val GREATER: GREATER with scala.Double = js.native
  /* 5 */ val GREATER_EQUAL: GREATER_EQUAL with scala.Double = js.native
  /* 6 */ val LESS: LESS with scala.Double = js.native
  /* 7 */ val LESS_EQUAL: LESS_EQUAL with scala.Double = js.native
  /* 1 */ val NOT_EMPTY: NOT_EMPTY with scala.Double = js.native
  /* 3 */ val NOT_EQUAL: NOT_EQUAL with scala.Double = js.native
  /* 9 */ val TOP_PERCENT: TOP_PERCENT with scala.Double = js.native
  /* 8 */ val TOP_VALUES: TOP_VALUES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FilterOperator with scala.Double
  ] = js.native
}

