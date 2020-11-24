package typings.antDesignProLayout.getBreadcrumbPropsMod

import typings.antd.breadcrumbBreadcrumbMod.Route
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<antd.antd/lib/breadcrumb.BreadcrumbProps, std.Extract<keyof antd.antd/lib/breadcrumb.BreadcrumbProps, 'routes' | 'itemRender'>> */
@js.native
trait BreadcrumbListReturn extends js.Object {
  
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[String], 
      ReactNode
    ]
  ] = js.native
  
  var routes: js.UndefOr[js.Array[Route]] = js.native
}
object BreadcrumbListReturn {
  
  @scala.inline
  def apply(): BreadcrumbListReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbListReturn]
  }
  
  @scala.inline
  implicit class BreadcrumbListReturnOps[Self <: BreadcrumbListReturn] (val x: Self) extends AnyVal {
    
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
    def setItemRender(
      value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode
    ): Self = this.set("itemRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteItemRender: Self = this.set("itemRender", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: Route*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[Route]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
  }
}
