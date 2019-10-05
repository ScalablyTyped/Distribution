package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pipe extends js.Object {
  /**
    * The pipe name to use in template bindings.
    * Typically uses [lowerCamelCase](guide/glossary#case-types)
    * because the name cannot contain hyphens.
    */
  var name: String
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
  var pure: js.UndefOr[Boolean] = js.undefined
}

@JSImport("@angular/core", "Pipe")
@js.native
object Pipe extends TopLevel[PipeDecorator]

