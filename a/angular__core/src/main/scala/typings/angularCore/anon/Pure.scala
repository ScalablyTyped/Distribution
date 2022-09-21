package typings.angularCore.anon

import typings.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pure[T] extends StObject {
  
  /** Name of the pipe. Used for matching pipes in template to pipe defs. */
  var name: String
  
  /** Whether the pipe is pure. */
  var pure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the pipe is standalone.
    */
  var standalone: js.UndefOr[Boolean] = js.undefined
  
  /** Pipe class reference. Needed to extract pipe lifecycle hooks. */
  var `type`: Type[T]
}
object Pure {
  
  inline def apply[T](name: String, `type`: Type[T]): Pure[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pure[T]]
  }
  
  extension [Self <: Pure[?], T](x: Self & Pure[T]) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    
    inline def setType(value: Type[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
