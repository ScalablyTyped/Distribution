package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵPipeDef[T] extends js.Object {
  /**
    * Factory function used to create a new pipe instance.
    */
  @JSName("factory")
  var factory_Original: FactoryFn[T] = js.native
  /**
    * Pipe name.
    *
    * Used to resolve pipe in templates.
    */
  val name: java.lang.String = js.native
  var onDestroy: js.Function0[scala.Unit] | scala.Null = js.native
  /**
    * Whether or not the pipe is pure.
    *
    * Pure pipes result only depends on the pipe input and not on internal
    * state of the pipe.
    */
  val pure: scala.Boolean = js.native
  /**
    * If no constructor to instantiate is provided, an instance of type T itself is created.
    */
  /**
    * Factory function used to create a new pipe instance.
    */
  def factory(): T = js.native
  /**
    * Subclasses without an explicit constructor call through to the factory of their base
    * definition, providing it with their own constructor to instantiate.
    */
  /**
    * Factory function used to create a new pipe instance.
    */
  def factory[U /* <: T */](t: Type[U]): U = js.native
}

