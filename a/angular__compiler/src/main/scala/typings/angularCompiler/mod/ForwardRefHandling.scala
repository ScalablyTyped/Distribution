package typings.angularCompiler.mod

import typings.angularCompiler.angularCompilerInts.`0`
import typings.angularCompiler.angularCompilerInts.`1`
import typings.angularCompiler.angularCompilerInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.angularCompilerInts.`0`
  - typings.angularCompiler.angularCompilerInts.`1`
  - typings.angularCompiler.angularCompilerInts.`2`
*/
trait ForwardRefHandling extends StObject
object ForwardRefHandling {
  
  /** The expression was not wrapped in a `forwardRef()` call in the first place. */
  inline def None: `0` = 0.asInstanceOf[`0`]
  
  /** The expression was wrapped in a `forwardRef()` call but has since been unwrapped. */
  inline def Unwrapped: `2` = 2.asInstanceOf[`2`]
  
  /** The expression is still wrapped in a `forwardRef()` call. */
  inline def Wrapped: `1` = 1.asInstanceOf[`1`]
}
