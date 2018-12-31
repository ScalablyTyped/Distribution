package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type[T] extends js.Object {
  /** A factory for creating a pipe instance. */
  var factory: js.Function1[/* t */ atAngularCoreLib.srcTypeMod.Type[T] | scala.Null, T]
  /** Name of the pipe. Used for matching pipes in template to pipe defs. */
  var name: java.lang.String
  /** Whether the pipe is pure. */
  var pure: js.UndefOr[scala.Boolean] = js.undefined
  /** Pipe class reference. Needed to extract pipe lifecycle hooks. */
  var `type`: atAngularCoreLib.srcTypeMod.Type[T]
}

