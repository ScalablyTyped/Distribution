package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import typings.activexLibreoffice.activexLibreofficeInts.`5`
import typings.activexLibreoffice.activexLibreofficeInts.`6`
import typings.activexLibreoffice.activexLibreofficeInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * values used to specify the response for a scripting engine interrupt.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`6`
  - typings.activexLibreoffice.activexLibreofficeInts.`5`
  - typings.activexLibreoffice.activexLibreofficeInts.`7`
*/
trait InterruptReason extends StObject
object InterruptReason {
  
  /** script stopped at a breakpoint. */
  inline def BreakPoint: `3` = 3.asInstanceOf[`3`]
  
  /**
    * script in the engine was cancelled.
    *
    * script execution was cancelled.
    */
  inline def Cancel: `0` = 0.asInstanceOf[`0`]
  
  /** script has invalid syntax. */
  inline def CompileError: `2` = 2.asInstanceOf[`2`]
  
  /** runtime error occurred during script execution. */
  inline def RuntimeError: `1` = 1.asInstanceOf[`1`]
  
  /** script stops because only one scripting engine command was executed. */
  inline def Step: `4` = 4.asInstanceOf[`4`]
  
  /** script stops because it leaves a function. */
  inline def StepOut: `6` = 6.asInstanceOf[`6`]
  
  /** script stops because one step was executed. */
  inline def StepOver: `5` = 5.asInstanceOf[`5`]
  
  /** script stop because one step was executed. */
  inline def StepStatement: `7` = 7.asInstanceOf[`7`]
}
