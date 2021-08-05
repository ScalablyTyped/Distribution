package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`backward-diagonal`
import typings.arcgisJsApi.arcgisJsApiStrings.`diagonal-cross`
import typings.arcgisJsApi.arcgisJsApiStrings.`forward-diagonal`
import typings.arcgisJsApi.arcgisJsApiStrings.cross
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.arcgisJsApi.arcgisJsApiStrings.style
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StylePattern3DProperties extends StObject {
  
  /**
    * The fill style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-StylePattern3D.html#style)
    */
  var style: js.UndefOr[
    `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical
  ] = js.undefined
  
  /**
    * The pattern type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-StylePattern3D.html#type)
    */
  var `type`: js.UndefOr[style] = js.undefined
}
object StylePattern3DProperties {
  
  inline def apply(): StylePattern3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylePattern3DProperties]
  }
  
  extension [Self <: StylePattern3DProperties](x: Self) {
    
    inline def setStyle(
      value: `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: style): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
