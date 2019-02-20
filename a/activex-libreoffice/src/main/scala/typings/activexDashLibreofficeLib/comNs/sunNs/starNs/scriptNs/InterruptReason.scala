package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InterruptReason extends js.Object

/**
  * values used to specify the response for a scripting engine interrupt.
  * @deprecated Deprecated
  */
@JSGlobal("com.sun.star.script.InterruptReason")
@js.native
object InterruptReason extends js.Object {
  /** script stopped at a breakpoint. */
  @js.native
  sealed trait BreakPoint
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.InterruptReason
  
  /**
    * script in the engine was cancelled.
    *
    * script execution was cancelled.
    */
  @js.native
  sealed trait Cancel
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.InterruptReason
  
  /** script has invalid syntax. */
  @js.native
  sealed trait CompileError
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.InterruptReason
  
  /** runtime error occurred during script execution. */
  @js.native
  sealed trait RuntimeError
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.InterruptReason
  
  /** script stops because only one scripting engine command was executed. */
  @js.native
  sealed trait Step
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.InterruptReason
  
  /** script stops because it leaves a function. */
  @js.native
  sealed trait StepOut
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.InterruptReason
  
  /** script stops because one step was executed. */
  @js.native
  sealed trait StepOver
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.InterruptReason
  
  /** script stop because one step was executed. */
  @js.native
  sealed trait StepStatement
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.InterruptReason
  
  /* 3 */ val BreakPoint: BreakPoint with scala.Double = js.native
  /* 0 */ val Cancel: Cancel with scala.Double = js.native
  /* 2 */ val CompileError: CompileError with scala.Double = js.native
  /* 1 */ val RuntimeError: RuntimeError with scala.Double = js.native
  /* 4 */ val Step: Step with scala.Double = js.native
  /* 6 */ val StepOut: StepOut with scala.Double = js.native
  /* 5 */ val StepOver: StepOver with scala.Double = js.native
  /* 7 */ val StepStatement: StepStatement with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.InterruptReason with scala.Double
  ] = js.native
}

