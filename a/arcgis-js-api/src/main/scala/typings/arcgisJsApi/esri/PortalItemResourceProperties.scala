package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalItemResourceProperties extends StObject {
  
  /**
    * Path of the resource relative to `{ITEM}/resources/`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#path)
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) that owns the resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.native
}
object PortalItemResourceProperties {
  
  @scala.inline
  def apply(): PortalItemResourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalItemResourceProperties]
  }
  
  @scala.inline
  implicit class PortalItemResourcePropertiesMutableBuilder[Self <: PortalItemResourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPortalItem(value: PortalItemProperties): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalItemUndefined: Self = StObject.set(x, "portalItem", js.undefined)
  }
}
