package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionalDecorator
  extends org.scalablytyped.runtime.Instantiable0[Optional] {
  /**
    * Parameter decorator to be used on constructor parameters,
    * which marks the parameter as being an optional dependency.
    * The DI framework provides null if the dependency is not found.
    *
    * Can be used together with other parameter decorators
    * that modify how dependency injection operates.
    *
    * Learn more in the ["Dependency Injection Guide"](guide/dependency-injection).
    *
    * @usageNotes
    *
    * The following code allows the possibility of a null result:
    *
    * <code-example path="core/di/ts/metadata_spec.ts" region="Optional"
    *  linenums="false"></code-example>
    *
    */
  def apply(): js.Any = js.native
}

