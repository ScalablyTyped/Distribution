package typings.antDesignProLayout.anon

import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadcrumbMap extends StObject {
  
  var breadcrumbMap: js.UndefOr[Map[String, MenuDataItem]] = js.native
  
  var location: js.UndefOr[Location[LocationState] | Pathname] = js.native
}
object BreadcrumbMap {
  
  @scala.inline
  def apply(): BreadcrumbMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbMap]
  }
  
  @scala.inline
  implicit class BreadcrumbMapMutableBuilder[Self <: BreadcrumbMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreadcrumbMap(value: Map[String, MenuDataItem]): Self = StObject.set(x, "breadcrumbMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadcrumbMapUndefined: Self = StObject.set(x, "breadcrumbMap", js.undefined)
    
    @scala.inline
    def setLocation(value: Location[LocationState] | Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
