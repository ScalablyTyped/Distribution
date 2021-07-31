package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breadcrumb extends StObject {
  
  var breadcrumb: StringDictionary[MenuDataItem]
  
  var breadcrumbMap: Map[String, typings.umijsRouteUtils.typesMod.MenuDataItem]
  
  var menuData: js.Array[typings.umijsRouteUtils.typesMod.MenuDataItem]
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
  implicit class BreadcrumbMutableBuilder[Self <: Breadcrumb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreadcrumb(value: StringDictionary[MenuDataItem]): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadcrumbMap(value: Map[String, typings.umijsRouteUtils.typesMod.MenuDataItem]): Self = StObject.set(x, "breadcrumbMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuData(value: js.Array[typings.umijsRouteUtils.typesMod.MenuDataItem]): Self = StObject.set(x, "menuData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuDataVarargs(value: typings.umijsRouteUtils.typesMod.MenuDataItem*): Self = StObject.set(x, "menuData", js.Array(value :_*))
  }
}
