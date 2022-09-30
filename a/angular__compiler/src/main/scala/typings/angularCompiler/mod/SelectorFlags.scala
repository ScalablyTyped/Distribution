package typings.angularCompiler.mod

import typings.angularCompiler.angularCompilerInts.`1`
import typings.angularCompiler.angularCompilerInts.`2`
import typings.angularCompiler.angularCompilerInts.`4`
import typings.angularCompiler.angularCompilerInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Flags used to generate R3-style CSS Selectors. They are pasted from
  * core/src/render3/projection.ts because they cannot be referenced directly.
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.angularCompilerInts.`1`
  - typings.angularCompiler.angularCompilerInts.`2`
  - typings.angularCompiler.angularCompilerInts.`4`
  - typings.angularCompiler.angularCompilerInts.`8`
*/
trait SelectorFlags extends StObject
object SelectorFlags {
  
  /** Mode for matching attributes */
  inline def ATTRIBUTE: `2` = 2.asInstanceOf[`2`]
  
  /** Mode for matching class names */
  inline def CLASS: `8` = 8.asInstanceOf[`8`]
  
  /** Mode for matching tag names */
  inline def ELEMENT: `4` = 4.asInstanceOf[`4`]
  
  /** Indicates this is the beginning of a new negative selector */
  inline def NOT: `1` = 1.asInstanceOf[`1`]
}
