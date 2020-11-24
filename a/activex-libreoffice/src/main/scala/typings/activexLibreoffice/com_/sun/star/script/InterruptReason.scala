package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * values used to specify the response for a scripting engine interrupt.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
*/
trait InterruptReason extends js.Object
object InterruptReason {
  
  /** script stopped at a breakpoint. */
  @scala.inline
  def BreakPoint: `3` = 3.asInstanceOf[`3`]
  
  /**
    * script in the engine was cancelled.
    *
    * script execution was cancelled.
    */
  @scala.inline
  def Cancel: `0` = 0.asInstanceOf[`0`]
  
  /** script has invalid syntax. */
  @scala.inline
  def CompileError: `2` = 2.asInstanceOf[`2`]
  
  /** runtime error occurred during script execution. */
  @scala.inline
  def RuntimeError: `1` = 1.asInstanceOf[`1`]
  
  /** script stops because only one scripting engine command was executed. */
  @scala.inline
  def Step: `4` = 4.asInstanceOf[`4`]
  
  /** script stops because it leaves a function. */
  @scala.inline
  def StepOut: `6` = 6.asInstanceOf[`6`]
  
  /** script stops because one step was executed. */
  @scala.inline
  def StepOver: `5` = 5.asInstanceOf[`5`]
  
  /** script stop because one step was executed. */
  @scala.inline
  def StepStatement: `7` = 7.asInstanceOf[`7`]
}
