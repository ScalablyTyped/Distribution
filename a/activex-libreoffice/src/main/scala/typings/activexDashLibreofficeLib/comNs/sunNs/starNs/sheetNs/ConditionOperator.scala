package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionOperator extends js.Object

/** is used to specify the type of {@link XSheetCondition} . */
@JSGlobal("com.sun.star.sheet.ConditionOperator")
@js.native
object ConditionOperator extends js.Object {
  /** the value has to be between the two specified values. */
  @js.native
  sealed trait BETWEEN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionOperator
  
  /** value has to be equal to the specified value. */
  @js.native
  sealed trait EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionOperator
  
  /** the specified formula has to give a non-zero result. */
  @js.native
  sealed trait FORMULA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionOperator
  
  /**
    * the value has to be greater than the specified value.
    *
    * value has to be greater than the specified value.
    */
  @js.native
  sealed trait GREATER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionOperator
  
  /**
    * the value has to be greater than or equal to the specified value.
    *
    * value has to be greater than or equal to the specified value.
    */
  @js.native
  sealed trait GREATER_EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionOperator
  
  /**
    * the value has to be less than the specified value.
    *
    * value has to be less than the specified value.
    */
  @js.native
  sealed trait LESS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionOperator
  
  /**
    * the value has to be less than or equal to the specified value.
    *
    * value has to be less than or equal to the specified value.
    */
  @js.native
  sealed trait LESS_EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionOperator
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionOperator
  
  /** the value has to be outside of the two specified values. */
  @js.native
  sealed trait NOT_BETWEEN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionOperator
  
  /**
    * the value must not be equal to the specified value.
    *
    * value must not be equal to the specified value.
    */
  @js.native
  sealed trait NOT_EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionOperator
  
  /* 7 */ val BETWEEN: BETWEEN with scala.Double = js.native
  /* 1 */ val EQUAL: EQUAL with scala.Double = js.native
  /* 9 */ val FORMULA: FORMULA with scala.Double = js.native
  /* 3 */ val GREATER: GREATER with scala.Double = js.native
  /* 4 */ val GREATER_EQUAL: GREATER_EQUAL with scala.Double = js.native
  /* 5 */ val LESS: LESS with scala.Double = js.native
  /* 6 */ val LESS_EQUAL: LESS_EQUAL with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 8 */ val NOT_BETWEEN: NOT_BETWEEN with scala.Double = js.native
  /* 2 */ val NOT_EQUAL: NOT_EQUAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ConditionOperator with scala.Double
  ] = js.native
}

