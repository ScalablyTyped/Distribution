package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FactoryName[T] extends js.Object {
  /** Name of the pipe. Used for matching pipes in template to pipe defs. */
  var name: java.lang.String = js.native
  /** Whether the pipe is pure. */
  var pure: js.UndefOr[scala.Boolean] = js.native
  /** Pipe class reference. Needed to extract pipe lifecycle hooks. */
  var `type`: atAngularCoreLib.srcTypeMod.Type[T] = js.native
  def factory(): T = js.native
  /** A factory for creating a pipe instance. */
  def factory(t: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
}

