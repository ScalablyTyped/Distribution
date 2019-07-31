package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostDecorator extends Instantiable0[Host] {
  /**
    * Parameter decorator on a view-provider parameter of a class constructor
    * that tells the DI framework to resolve the view by checking injectors of child
    * elements, and stop when reaching the host element of the current component.
    *
    * For an extended example, see
    * ["Dependency Injection Guide"](guide/dependency-injection-in-action#optional).
    *
    * @usageNotes
    *
    * The following shows use with the `@Optional` decorator, and allows for a null result.
    *
    * <code-example path="core/di/ts/metadata_spec.ts" region="Host">
    * </code-example>
    */
  def apply(): js.Any = js.native
}

