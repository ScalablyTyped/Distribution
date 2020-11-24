package typings.angularRoute.mod.angularAugmentingMod.route

import typings.angularRoute.anon.Dictindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see http://docs.angularjs.org/api/ng.$route#current
@js.native
trait ICurrentRoute extends IRoute {
  
  var locals: Dictindex = js.native
  
  var params: js.Any = js.native
}
object ICurrentRoute {
  
  @scala.inline
  def apply(locals: Dictindex, params: js.Any): ICurrentRoute = {
    val __obj = js.Dynamic.literal(locals = locals.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentRoute]
  }
  
  @scala.inline
  implicit class ICurrentRouteOps[Self <: ICurrentRoute] (val x: Self) extends AnyVal {
    
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
    def setLocals(value: Dictindex): Self = this.set("locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
