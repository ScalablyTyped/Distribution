package typings.angularCompiler.lazyRoutesMod

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyRoute extends js.Object {
  var module: StaticSymbol = js.native
  var referencedModule: StaticSymbol = js.native
  var route: String = js.native
}

object LazyRoute {
  @scala.inline
  def apply(module: StaticSymbol, referencedModule: StaticSymbol, route: String): LazyRoute = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], referencedModule = referencedModule.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyRoute]
  }
  @scala.inline
  implicit class LazyRouteOps[Self <: LazyRoute] (val x: Self) extends AnyVal {
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
    def setModule(value: StaticSymbol): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencedModule(value: StaticSymbol): Self = this.set("referencedModule", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

