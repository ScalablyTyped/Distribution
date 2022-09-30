package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the response for a scripting engine termination.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait FinishReason extends StObject
object FinishReason {
  
  /**
    * script in the engine was cancelled.
    *
    * script execution was cancelled.
    */
  inline def Cancel: `1` = 1.asInstanceOf[`1`]
  
  /** error occurred during script execution or compiling. */
  inline def Error: `2` = 2.asInstanceOf[`2`]
  
  /** script in the engine terminated normally. */
  inline def OK: `0` = 0.asInstanceOf[`0`]
}
