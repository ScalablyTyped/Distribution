package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breadcrumb extends js.Object {
  
  var breadcrumb: StringDictionary[MenuDataItem] = js.native
  
  var breadcrumbMap: Map[String, typings.umijsRouteUtils.typesMod.MenuDataItem] = js.native
  
  var menuData: js.Array[typings.umijsRouteUtils.typesMod.MenuDataItem] = js.native
}
object Breadcrumb {
  
  @scala.inline
  def apply(
    breadcrumb: StringDictionary[MenuDataItem],
    breadcrumbMap: Map[String, typings.umijsRouteUtils.typesMod.MenuDataItem],
    menuData: js.Array[typings.umijsRouteUtils.typesMod.MenuDataItem]
  ): Breadcrumb = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any], breadcrumbMap = breadcrumbMap.asInstanceOf[js.Any], menuData = menuData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breadcrumb]
  }
  
  @scala.inline
  implicit class BreadcrumbOps[Self <: Breadcrumb] (val x: Self) extends AnyVal {
    
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
    def setBreadcrumb(value: StringDictionary[MenuDataItem]): Self = this.set("breadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadcrumbMap(value: Map[String, typings.umijsRouteUtils.typesMod.MenuDataItem]): Self = this.set("breadcrumbMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuDataVarargs(value: typings.umijsRouteUtils.typesMod.MenuDataItem*): Self = this.set("menuData", js.Array(value :_*))
    
    @scala.inline
    def setMenuData(value: js.Array[typings.umijsRouteUtils.typesMod.MenuDataItem]): Self = this.set("menuData", value.asInstanceOf[js.Any])
  }
}
