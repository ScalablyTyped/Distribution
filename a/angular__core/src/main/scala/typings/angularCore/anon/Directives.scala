package typings.angularCore.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directives extends StObject {
  
  var directives: Set[js.Any]
  
  var pipes: Set[js.Any]
}
object Directives {
  
  inline def apply(directives: Set[js.Any], pipes: Set[js.Any]): Directives = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directives]
  }
  
  extension [Self <: Directives](x: Self) {
    
    inline def setDirectives(value: Set[js.Any]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setPipes(value: Set[js.Any]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
  }
}
