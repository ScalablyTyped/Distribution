package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * values used to specify the response for a scripting engine interrupt.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
*/
trait InterruptReason extends js.Object

object InterruptReason {
  /** script stopped at a breakpoint. */
  @scala.inline
  def BreakPoint: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * script in the engine was cancelled.
    *
    * script execution was cancelled.
    */
  @scala.inline
  def Cancel: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** script has invalid syntax. */
  @scala.inline
  def CompileError: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** runtime error occurred during script execution. */
  @scala.inline
  def RuntimeError: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** script stops because only one scripting engine command was executed. */
  @scala.inline
  def Step: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** script stops because it leaves a function. */
  @scala.inline
  def StepOut: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /** script stops because one step was executed. */
  @scala.inline
  def StepOver: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** script stop because one step was executed. */
  @scala.inline
  def StepStatement: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

