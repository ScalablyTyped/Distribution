package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵPipeDef[T] extends StObject {
  
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
  var `type`: typings.angularCore.mod.Type[T] = js.native
}
object ɵPipeDef {
  
  @scala.inline
  def apply[T](name: String, pure: Boolean, `type`: typings.angularCore.mod.Type[T]): ɵPipeDef[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵPipeDef[T]]
  }
  
  @scala.inline
  implicit class ɵPipeDefMutableBuilder[Self <: ɵPipeDef[_], T] (val x: Self with ɵPipeDef[T]) extends AnyVal {
    
    @scala.inline
    def setFactory(value: FactoryFn[T]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoryNull: Self = StObject.set(x, "factory", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDestroy(value: () => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDestroyNull: Self = StObject.set(x, "onDestroy", null)
    
    @scala.inline
    def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.angularCore.mod.Type[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
