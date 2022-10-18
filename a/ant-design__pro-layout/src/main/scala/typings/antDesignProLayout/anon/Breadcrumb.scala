package typings.antDesignProLayout.anon

import typings.antDesignProLayout.esTypingsMod.MenuDataItem
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breadcrumb extends StObject {
  
  var breadcrumb: Record[String, MenuDataItem]
  
  var breadcrumbMap: Map[String, MenuDataItem]
  
  var menuData: js.Array[MenuDataItem]
}
object Breadcrumb {
  
  inline def apply(
    breadcrumb: Record[String, MenuDataItem],
    breadcrumbMap: Map[String, MenuDataItem],
    menuData: js.Array[MenuDataItem]
  ): Breadcrumb = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any], breadcrumbMap = breadcrumbMap.asInstanceOf[js.Any], menuData = menuData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breadcrumb]
  }
  
  extension [Self <: Breadcrumb](x: Self) {
    
    inline def setBreadcrumb(value: Record[String, MenuDataItem]): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
    
    inline def setBreadcrumbMap(value: Map[String, MenuDataItem]): Self = StObject.set(x, "breadcrumbMap", value.asInstanceOf[js.Any])
    
    inline def setMenuData(value: js.Array[MenuDataItem]): Self = StObject.set(x, "menuData", value.asInstanceOf[js.Any])
    
    inline def setMenuDataVarargs(value: MenuDataItem*): Self = StObject.set(x, "menuData", js.Array(value*))
  }
}
