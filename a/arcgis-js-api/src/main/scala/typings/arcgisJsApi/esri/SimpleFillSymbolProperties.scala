package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`backward-diagonal`
import typings.arcgisJsApi.arcgisJsApiStrings.`diagonal-cross`
import typings.arcgisJsApi.arcgisJsApiStrings.`forward-diagonal`
import typings.arcgisJsApi.arcgisJsApiStrings.cross
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleFillSymbolProperties
  extends StObject
     with FillSymbolProperties {
  
  /**
    * The fill style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#style)
    */
  var style: js.UndefOr[
    `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical
  ] = js.undefined
}
object SimpleFillSymbolProperties {
  
  inline def apply(): SimpleFillSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleFillSymbolProperties]
  }
  
  extension [Self <: SimpleFillSymbolProperties](x: Self) {
    
    inline def setStyle(
      value: `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
