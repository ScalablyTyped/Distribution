package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * values used to specify the response for a scripting engine interrupt.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
*/
trait InterruptReason extends js.Object

object InterruptReason {
  /** script stopped at a breakpoint. */
  @scala.inline
  def BreakPoint: `3` = this.cast(3)
  /**
    * script in the engine was cancelled.
    *
    * script execution was cancelled.
    */
  @scala.inline
  def Cancel: `0` = this.cast(0)
  /** script has invalid syntax. */
  @scala.inline
  def CompileError: `2` = this.cast(2)
  /** runtime error occurred during script execution. */
  @scala.inline
  def RuntimeError: `1` = this.cast(1)
  /** script stops because only one scripting engine command was executed. */
  @scala.inline
  def Step: `4` = this.cast(4)
  /** script stops because it leaves a function. */
  @scala.inline
  def StepOut: `6` = this.cast(6)
  /** script stops because one step was executed. */
  @scala.inline
  def StepOver: `5` = this.cast(5)
  /** script stop because one step was executed. */
  @scala.inline
  def StepStatement: `7` = this.cast(7)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

