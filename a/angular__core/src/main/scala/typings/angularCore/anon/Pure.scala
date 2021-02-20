package typings.angularCore.anon

import typings.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pure[T] extends StObject {
  
  /** Name of the pipe. Used for matching pipes in template to pipe defs. */
  var name: String = js.native
  
  /** Whether the pipe is pure. */
  var pure: js.UndefOr[Boolean] = js.native
  
  /** Pipe class reference. Needed to extract pipe lifecycle hooks. */
  var `type`: Type[T] = js.native
}
object Pure {
  
  @scala.inline
  def apply[T](name: String, `type`: Type[T]): Pure[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pure[T]]
  }
  
  @scala.inline
  implicit class PureMutableBuilder[Self <: Pure[_], T] (val x: Self with Pure[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    @scala.inline
    def setType(value: Type[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
