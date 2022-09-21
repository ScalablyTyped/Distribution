package typings.angularCompiler.mod

import typings.angularCompiler.angularCompilerNumbers.`0`
import typings.angularCompiler.angularCompilerNumbers.`1`
import typings.angularCompiler.angularCompilerNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.angularCompilerNumbers.`0`
  - typings.angularCompiler.angularCompilerNumbers.`1`
  - typings.angularCompiler.angularCompilerNumbers.`2`
*/
trait DeclarationListEmitMode extends StObject
object DeclarationListEmitMode {
  
  /**
    * The list of declarations is emitted into the generated code wrapped inside a closure, which
    * is needed when at least one declaration is a forward reference.
    *
    * ```
    * directives: function () { return [MyDir, ForwardDir]; },
    * ```
    */
  inline def Closure: `1` = 1.asInstanceOf[`1`]
  
  /**
    * Similar to `Closure`, with the addition that the list of declarations can contain individual
    * items that are themselves forward references. This is relevant for JIT compilations, as
    * unwrapping the forwardRef cannot be done statically so must be deferred. This mode emits
    * the declaration list using a mapping transform through `resolveForwardRef` to ensure that
    * any forward references within the list are resolved when the outer closure is invoked.
    *
    * Consider the case where the runtime has captured two declarations in two distinct values:
    * ```
    * const dirA = MyDir;
    * const dirB = forwardRef(function() { return ForwardRef; });
    * ```
    *
    * This mode would emit the declarations captured in `dirA` and `dirB` as follows:
    * ```
    * directives: function () { return [dirA, dirB].map(ng.resolveForwardRef); },
    * ```
    */
  inline def ClosureResolved: `2` = 2.asInstanceOf[`2`]
  
  /**
    * The list of declarations is emitted into the generated code as is.
    *
    * ```
    * directives: [MyDir],
    * ```
    */
  inline def Direct: `0` = 0.asInstanceOf[`0`]
}
