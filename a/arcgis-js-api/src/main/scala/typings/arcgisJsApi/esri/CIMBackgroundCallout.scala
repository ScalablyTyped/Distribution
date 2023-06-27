package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMBackgroundCallout extends StObject {
  
  /**
  		 * The symbol used to draw the background.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMBackgroundCallout)
  		 */
  var backgroundSymbol: CIMPolygonSymbol
  
  /**
  		 * The callout type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMBackgroundCallout)
  		 */
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMBackgroundCallout
}
object CIMBackgroundCallout {
  
  inline def apply(backgroundSymbol: CIMPolygonSymbol): CIMBackgroundCallout = {
    val __obj = js.Dynamic.literal(backgroundSymbol = backgroundSymbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMBackgroundCallout")
    __obj.asInstanceOf[CIMBackgroundCallout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMBackgroundCallout] (val x: Self) extends AnyVal {
    
    inline def setBackgroundSymbol(value: CIMPolygonSymbol): Self = StObject.set(x, "backgroundSymbol", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMBackgroundCallout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
