package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalDecorator extends Instantiable0[Optional] {
  
  /**
    * Parameter decorator to be used on constructor parameters,
    * which marks the parameter as being an optional dependency.
    * The DI framework provides null if the dependency is not found.
    *
    * Can be used together with other parameter decorators
    * that modify how dependency injection operates.
    *
    * @usageNotes
    *
    * The following code allows the possibility of a null result:
    *
    * <code-example path="core/di/ts/metadata_spec.ts" region="Optional">
    * </code-example>
    *
    * @see ["Dependency Injection Guide"](guide/dependency-injection).
    */
  def apply(): js.Any = js.native
}
