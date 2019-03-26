package typings
package atAngularCoreLib.srcMetadataDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pipe extends js.Object {
  /**
    * The pipe name to use in template bindings.
    *
    */
  var name: java.lang.String
  /**
    * When true, the pipe is pure, meaning that the
    * `transform()` method is invoked only when its input arguments
    * change. Pipes are pure by default.
    *
    * If the pipe has internal state (that is, the result
    * depends on state other than its arguments), set `pure` to false.
    * In this case, the pipe is invoked on each change-detection cycle,
    * even if the arguments have not changed.
    */
  var pure: js.UndefOr[scala.Boolean] = js.undefined
}

@JSImport("@angular/core/src/metadata/directives", "Pipe")
@js.native
class PipeCls protected () extends Pipe {
  /**
    * See the `Pipe` decorator.
    */
  def this(obj: Pipe) = this()
  /**
    * The pipe name to use in template bindings.
    *
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

object Pipe {
  @scala.inline
  def apply(name: java.lang.String, pure: js.UndefOr[scala.Boolean] = js.undefined): Pipe = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure)
    __obj.asInstanceOf[Pipe]
  }
}

