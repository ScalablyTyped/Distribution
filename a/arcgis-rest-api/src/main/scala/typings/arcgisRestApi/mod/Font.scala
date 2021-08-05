package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.`line-through`
import typings.arcgisRestApi.arcgisRestApiStrings.bold
import typings.arcgisRestApi.arcgisRestApiStrings.bolder
import typings.arcgisRestApi.arcgisRestApiStrings.italic
import typings.arcgisRestApi.arcgisRestApiStrings.lighter
import typings.arcgisRestApi.arcgisRestApiStrings.none
import typings.arcgisRestApi.arcgisRestApiStrings.normal
import typings.arcgisRestApi.arcgisRestApiStrings.oblique
import typings.arcgisRestApi.arcgisRestApiStrings.underline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  var decoration: js.UndefOr[`line-through` | underline | none] = js.undefined
  
  var family: js.UndefOr[String] = js.undefined
  
  // "<fontFamily>";
  var size: js.UndefOr[Double] = js.undefined
  
  // <fontSize>;
  var style: js.UndefOr[italic | normal | oblique] = js.undefined
  
  var weight: js.UndefOr[bold | bolder | lighter | normal] = js.undefined
}
object Font {
  
  inline def apply(): Font = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Font]
  }
  
  extension [Self <: Font](x: Self) {
    
    inline def setDecoration(value: `line-through` | underline | none): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
    
    inline def setDecorationUndefined: Self = StObject.set(x, "decoration", js.undefined)
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: italic | normal | oblique): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWeight(value: bold | bolder | lighter | normal): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
