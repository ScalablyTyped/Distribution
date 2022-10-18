package typings.antDesignProLayout.anon

import typings.antDesignProLayout.esTypingsMod.MenuDataItem
import typings.history.mod.Location
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadcrumbMap extends StObject {
  
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.undefined
  
  var location: js.UndefOr[Location | Pathname] = js.undefined
}
object BreadcrumbMap {
  
  inline def apply(): BreadcrumbMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbMap]
  }
  
  extension [Self <: BreadcrumbMap](x: Self) {
    
    inline def setBreadcrumbMap(value: Map[String, MenuDataItem]): Self = StObject.set(x, "breadcrumbMap", value.asInstanceOf[js.Any])
    
    inline def setBreadcrumbMapUndefined: Self = StObject.set(x, "breadcrumbMap", js.undefined)
    
    inline def setLocation(value: Location | Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
