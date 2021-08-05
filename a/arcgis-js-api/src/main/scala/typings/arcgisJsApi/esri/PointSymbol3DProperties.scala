package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointSymbol3DProperties
  extends StObject
     with Symbol3DProperties {
  
  /**
    * Settings for adding a callout visualization to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#callout)
    */
  var callout: js.UndefOr[LineCallout3DProperties] = js.undefined
  
  /**
    * Shifts the symbol along the vertical world axis by a given height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var verticalOffset: js.UndefOr[PointSymbol3DVerticalOffsetProperties] = js.undefined
}
object PointSymbol3DProperties {
  
  inline def apply(): PointSymbol3DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointSymbol3DProperties]
  }
  
  extension [Self <: PointSymbol3DProperties](x: Self) {
    
    inline def setCallout(value: LineCallout3DProperties): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
    
    inline def setCalloutUndefined: Self = StObject.set(x, "callout", js.undefined)
    
    inline def setVerticalOffset(value: PointSymbol3DVerticalOffsetProperties): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
  }
}
