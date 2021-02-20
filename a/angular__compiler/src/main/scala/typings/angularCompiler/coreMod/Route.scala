package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends StObject {
  
  var children: js.UndefOr[js.Array[Route]] = js.native
  
  var loadChildren: js.UndefOr[String | typings.angularCompiler.coreMod.Type | js.Any] = js.native
}
object Route {
  
  @scala.inline
  def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[Route]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: Route*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setLoadChildren(value: String | typings.angularCompiler.coreMod.Type | js.Any): Self = StObject.set(x, "loadChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadChildrenUndefined: Self = StObject.set(x, "loadChildren", js.undefined)
  }
}
