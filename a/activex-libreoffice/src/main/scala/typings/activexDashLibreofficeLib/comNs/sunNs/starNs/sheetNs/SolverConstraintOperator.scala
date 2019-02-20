package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SolverConstraintOperator extends js.Object

/** is used to specify the type of {@link SolverConstraint} . */
@JSGlobal("com.sun.star.sheet.SolverConstraintOperator")
@js.native
object SolverConstraintOperator extends js.Object {
  @js.native
  sealed trait BINARY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SolverConstraintOperator
  
  /** value has to be equal to the specified value. */
  @js.native
  sealed trait EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SolverConstraintOperator
  
  /**
    * the value has to be greater than or equal to the specified value.
    *
    * value has to be greater than or equal to the specified value.
    */
  @js.native
  sealed trait GREATER_EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SolverConstraintOperator
  
  @js.native
  sealed trait INTEGER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SolverConstraintOperator
  
  /**
    * the value has to be less than or equal to the specified value.
    *
    * value has to be less than or equal to the specified value.
    */
  @js.native
  sealed trait LESS_EQUAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SolverConstraintOperator
  
  /* 4 */ val BINARY: BINARY with scala.Double = js.native
  /* 1 */ val EQUAL: EQUAL with scala.Double = js.native
  /* 2 */ val GREATER_EQUAL: GREATER_EQUAL with scala.Double = js.native
  /* 3 */ val INTEGER: INTEGER with scala.Double = js.native
  /* 0 */ val LESS_EQUAL: LESS_EQUAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SolverConstraintOperator with scala.Double
  ] = js.native
}

