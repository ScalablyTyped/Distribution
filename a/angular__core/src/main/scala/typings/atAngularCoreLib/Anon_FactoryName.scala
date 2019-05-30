package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FactoryName[T] extends js.Object {
  /** A factory for creating a pipe instance. */
  @JSName("factory")
  var factory_Original: atAngularCoreLib.atAngularCoreMod.FactoryFn[T] = js.native
  /** Name of the pipe. Used for matching pipes in template to pipe defs. */
  var name: java.lang.String = js.native
  /** Whether the pipe is pure. */
  var pure: js.UndefOr[scala.Boolean] = js.native
  /** Pipe class reference. Needed to extract pipe lifecycle hooks. */
  var `type`: atAngularCoreLib.atAngularCoreMod.Type[T] = js.native
  /**
    * If no constructor to instantiate is provided, an instance of type T itself is created.
    */
  /** A factory for creating a pipe instance. */
  def factory(): T = js.native
  /**
    * Subclasses without an explicit constructor call through to the factory of their base
    * definition, providing it with their own constructor to instantiate.
    */
  /** A factory for creating a pipe instance. */
  def factory[U /* <: T */](t: atAngularCoreLib.atAngularCoreMod.Type[U]): U = js.native
}

