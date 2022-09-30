package typings.angularCompiler.mod

import typings.angularCompiler.angularCompilerInts.`1`
import typings.angularCompiler.angularCompilerInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Flags passed into template functions to determine which blocks (i.e. creation, update)
  * should be executed.
  *
  * Typically, a template runs both the creation block and the update block on initialization and
  * subsequent runs only execute the update block. However, dynamically created views require that
  * the creation block be executed separately from the update block (for backwards compat).
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.angularCompilerInts.`1`
  - typings.angularCompiler.angularCompilerInts.`2`
*/
trait RenderFlags extends StObject
object RenderFlags {
  
  inline def Create: `1` = 1.asInstanceOf[`1`]
  
  inline def Update: `2` = 2.asInstanceOf[`2`]
}
