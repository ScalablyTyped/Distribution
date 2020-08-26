package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵPipeDef[T] extends js.Object {
  /**
    * Factory function used to create a new pipe instance. Will be null initially.
    * Populated when the factory is first requested by pipe instantiation logic.
    */
  var factory: FactoryFn[T] | Null = js.native
  /**
    * Pipe name.
    *
    * Used to resolve pipe in templates.
    */
  val name: String = js.native
  var onDestroy: js.Function0[Unit] | Null = js.native
  /**
    * Whether or not the pipe is pure.
    *
    * Pure pipes result only depends on the pipe input and not on internal
    * state of the pipe.
    */
  val pure: Boolean = js.native
  /** Token representing the pipe. */
  var `type`: Type[T] = js.native
}

object ɵPipeDef {
  @scala.inline
  def apply[T](name: String, pure: Boolean, `type`: Type[T]): ɵPipeDef[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵPipeDef[T]]
  }
  @scala.inline
  implicit class ɵPipeDefOps[Self <: ɵPipeDef[_], T] (val x: Self with ɵPipeDef[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPure(value: Boolean): Self = this.set("pure", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Type[T]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFactory(value: FactoryFn[T]): Self = this.set("factory", value.asInstanceOf[js.Any])
    @scala.inline
    def setFactoryNull: Self = this.set("factory", null)
    @scala.inline
    def setOnDestroy(value: () => Unit): Self = this.set("onDestroy", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDestroyNull: Self = this.set("onDestroy", null)
  }
  
}

