package typings.angularCore.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directives extends StObject {
  
  var directives: Set[_] = js.native
  
  var pipes: Set[_] = js.native
}
object Directives {
  
  @scala.inline
  def apply(directives: Set[_], pipes: Set[_]): Directives = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directives]
  }
  
  @scala.inline
  implicit class DirectivesMutableBuilder[Self <: Directives] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectives(value: Set[_]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipes(value: Set[_]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
  }
}
