package typings.angularCore.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directives extends StObject {
  
  var directives: Set[Any]
  
  var pipes: Set[Any]
}
object Directives {
  
  inline def apply(directives: Set[Any], pipes: Set[Any]): Directives = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directives]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Directives] (val x: Self) extends AnyVal {
    
    inline def setDirectives(value: Set[Any]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setPipes(value: Set[Any]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
  }
}
