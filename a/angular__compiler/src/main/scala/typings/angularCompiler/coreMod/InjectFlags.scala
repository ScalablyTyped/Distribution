package typings.angularCompiler.coreMod

import typings.angularCompiler.angularCompilerNumbers.`0`
import typings.angularCompiler.angularCompilerNumbers.`1`
import typings.angularCompiler.angularCompilerNumbers.`2`
import typings.angularCompiler.angularCompilerNumbers.`4`
import typings.angularCompiler.angularCompilerNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.angularCompilerNumbers.`0`
  - typings.angularCompiler.angularCompilerNumbers.`1`
  - typings.angularCompiler.angularCompilerNumbers.`2`
  - typings.angularCompiler.angularCompilerNumbers.`4`
  - typings.angularCompiler.angularCompilerNumbers.`8`
*/
trait InjectFlags extends StObject
object InjectFlags {
  
  inline def Default: `0` = 0.asInstanceOf[`0`]
  
  /**
    * Specifies that an injector should retrieve a dependency from any injector until reaching the
    * host element of the current component. (Only used with Element Injector)
    */
  inline def Host: `1` = 1.asInstanceOf[`1`]
  
  /** Inject `defaultValue` instead if token not found. */
  inline def Optional: `8` = 8.asInstanceOf[`8`]
  
  /** Don't descend into ancestors of the node requesting injection. */
  inline def Self: `2` = 2.asInstanceOf[`2`]
  
  /** Skip the node that is requesting injection. */
  inline def SkipSelf: `4` = 4.asInstanceOf[`4`]
}
