package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InjectDecorator
  extends Instantiable1[/* token */ js.Any, Inject_] {
  /**
    * Parameter decorator on a dependency parameter of a class constructor
    * that specifies a custom provider of the dependency.
    *
    * @usageNotes
    * The following example shows a class constructor that specifies a
    * custom provider of a dependency using the parameter decorator.
    *
    * When `@Inject()` is not present, the injector uses the type annotation of the
    * parameter as the provider.
    *
    * <code-example path="core/di/ts/metadata_spec.ts" region="InjectWithoutDecorator">
    * </code-example>
    *
    * @see ["Dependency Injection Guide"](guide/dependency-injection)
    *
    */
  def apply(token: js.Any): js.Any = js.native
}

