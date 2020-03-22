package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵPipeDef[T] extends js.Object {
  /**
    * Factory function used to create a new pipe instance. Will be null initially.
    * Populated when the factory is first requested by pipe instantiation logic.
    */
  var factory: FactoryFn[T] | Null
  /**
    * Pipe name.
    *
    * Used to resolve pipe in templates.
    */
  val name: String
  var onDestroy: js.Function0[Unit] | Null
  /**
    * Whether or not the pipe is pure.
    *
    * Pure pipes result only depends on the pipe input and not on internal
    * state of the pipe.
    */
  val pure: Boolean
  /** Token representing the pipe. */
  var `type`: Type[T]
}

object ɵPipeDef {
  @scala.inline
  def apply[T](
    name: String,
    pure: Boolean,
    `type`: Type[T],
    factory: FactoryFn[T] = null,
    onDestroy: () => Unit = null
  ): ɵPipeDef[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction0(onDestroy))
    __obj.asInstanceOf[ɵPipeDef[T]]
  }
}

