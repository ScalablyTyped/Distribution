package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemResourceProperties extends StObject {
  
  /**
    * Path of the resource relative to `{ITEM}/resources/`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#path)
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) that owns the resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
}
object PortalItemResourceProperties {
  
  inline def apply(): PortalItemResourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalItemResourceProperties]
  }
  
  extension [Self <: PortalItemResourceProperties](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPortalItem(value: PortalItemProperties): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
    
    inline def setPortalItemUndefined: Self = StObject.set(x, "portalItem", js.undefined)
  }
}
