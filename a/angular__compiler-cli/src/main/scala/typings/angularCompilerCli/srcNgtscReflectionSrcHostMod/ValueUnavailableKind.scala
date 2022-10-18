package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.angularCompilerCli.angularCompilerCliInts.`0`
import typings.angularCompilerCli.angularCompilerCliInts.`1`
import typings.angularCompilerCli.angularCompilerCliInts.`2`
import typings.angularCompilerCli.angularCompilerCliInts.`3`
import typings.angularCompilerCli.angularCompilerCliInts.`4`
import typings.angularCompilerCli.angularCompilerCliInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompilerCli.angularCompilerCliInts.`0`
  - typings.angularCompilerCli.angularCompilerCliInts.`1`
  - typings.angularCompilerCli.angularCompilerCliInts.`2`
  - typings.angularCompilerCli.angularCompilerCliInts.`3`
  - typings.angularCompilerCli.angularCompilerCliInts.`4`
  - typings.angularCompilerCli.angularCompilerCliInts.`5`
*/
trait ValueUnavailableKind extends StObject
object ValueUnavailableKind {
  
  /**
    * No type node was available.
    */
  inline def MISSING_TYPE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * The type corresponds with a namespace.
    */
  inline def NAMESPACE: `4` = 4.asInstanceOf[`4`]
  
  /**
    * The type does not have a value declaration, e.g. an interface.
    */
  inline def NO_VALUE_DECLARATION: `1` = 1.asInstanceOf[`1`]
  
  /**
    * The type is imported using a type-only imports, so it is not suitable to be used in a
    * value-position.
    */
  inline def TYPE_ONLY_IMPORT: `2` = 2.asInstanceOf[`2`]
  
  /**
    * The type reference could not be resolved to a declaration.
    */
  inline def UNKNOWN_REFERENCE: `3` = 3.asInstanceOf[`3`]
  
  /**
    * The type is not supported in the compiler, for example union types.
    */
  inline def UNSUPPORTED: `5` = 5.asInstanceOf[`5`]
}
