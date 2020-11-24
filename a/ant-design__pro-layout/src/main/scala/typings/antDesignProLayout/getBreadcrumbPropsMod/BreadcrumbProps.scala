package typings.antDesignProLayout.getBreadcrumbPropsMod

import typings.antDesignProLayout.anon.Href
import typings.antDesignProLayout.anon.Pathname
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.antDesignProLayout.typingsMod.MessageDescriptor
import typings.antd.breadcrumbBreadcrumbMod.Route
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.ReactNode
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadcrumbProps extends js.Object {
  
  var breadcrumbList: js.UndefOr[js.Array[Href]] = js.native
  
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.native
  
  var breadcrumbRender: js.UndefOr[
    js.Function1[/* routers */ js.UndefOr[js.Array[Route]], js.UndefOr[js.Array[Route]]]
  ] = js.native
  
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.native
  
  var home: js.UndefOr[String] = js.native
  
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[String], 
      ReactNode
    ]
  ] = js.native
  
  var location: js.UndefOr[Location[LocationState] | Pathname] = js.native
  
  var menu: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['menu'] */ js.Any
  ] = js.native
}
object BreadcrumbProps {
  
  @scala.inline
  def apply(): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbProps]
  }
  
  @scala.inline
  implicit class BreadcrumbPropsOps[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
    
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
    def setBreadcrumbListVarargs(value: Href*): Self = this.set("breadcrumbList", js.Array(value :_*))
    
    @scala.inline
    def setBreadcrumbList(value: js.Array[Href]): Self = this.set("breadcrumbList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadcrumbList: Self = this.set("breadcrumbList", js.undefined)
    
    @scala.inline
    def setBreadcrumbMap(value: Map[String, MenuDataItem]): Self = this.set("breadcrumbMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadcrumbMap: Self = this.set("breadcrumbMap", js.undefined)
    
    @scala.inline
    def setBreadcrumbRender(value: /* routers */ js.UndefOr[js.Array[Route]] => js.UndefOr[js.Array[Route]]): Self = this.set("breadcrumbRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBreadcrumbRender: Self = this.set("breadcrumbRender", js.undefined)
    
    @scala.inline
    def setFormatMessage(value: /* message */ MessageDescriptor => String): Self = this.set("formatMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatMessage: Self = this.set("formatMessage", js.undefined)
    
    @scala.inline
    def setHome(value: String): Self = this.set("home", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHome: Self = this.set("home", js.undefined)
    
    @scala.inline
    def setItemRender(
      value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode
    ): Self = this.set("itemRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteItemRender: Self = this.set("itemRender", js.undefined)
    
    @scala.inline
    def setLocation(value: Location[LocationState] | Pathname): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMenu(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.ProSettings['menu'] */ js.Any
    ): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
  }
}
