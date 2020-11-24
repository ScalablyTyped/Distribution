package typings.antDesignProLayout.anon

import typings.antDesignProLayout.typingsMod.MenuDataItem
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadcrumbMap extends js.Object {
  
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
  implicit class BreadcrumbMapOps[Self <: BreadcrumbMap] (val x: Self) extends AnyVal {
    
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
    def setBreadcrumbMap(value: Map[String, MenuDataItem]): Self = this.set("breadcrumbMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadcrumbMap: Self = this.set("breadcrumbMap", js.undefined)
    
    @scala.inline
    def setLocation(value: Location[LocationState] | Pathname): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
