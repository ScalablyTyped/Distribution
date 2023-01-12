package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleOriginProperties extends StObject {
  
  /**
    * Name of the symbol in the style referenced by styleName or styleUrl.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-StyleOrigin.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The portal of the style origin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-StyleOrigin.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  
  /**
    * The well-known esri-provided style, such as `EsriThematicShapesStyle`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-StyleOrigin.html#styleName)
    */
  var styleName: js.UndefOr[String] = js.undefined
  
  /**
    * A url to a style definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-StyleOrigin.html#styleUrl)
    */
  var styleUrl: js.UndefOr[String] = js.undefined
}
object StyleOriginProperties {
  
  inline def apply(): StyleOriginProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOriginProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleOriginProperties] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    inline def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
    
    inline def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
    
    inline def setStyleUrl(value: String): Self = StObject.set(x, "styleUrl", value.asInstanceOf[js.Any])
    
    inline def setStyleUrlUndefined: Self = StObject.set(x, "styleUrl", js.undefined)
  }
}
