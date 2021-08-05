package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelSymbol3DVerticalOffsetProperties
  extends StObject
     with Object {
  
  /**
    * The maximum vertical symbol offset in world units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var maxWorldLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum vertical symbol offset in world units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var minWorldLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The vertical symbol offset in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var screenLength: js.UndefOr[Double] = js.undefined
}
object LabelSymbol3DVerticalOffsetProperties {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LabelSymbol3DVerticalOffsetProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LabelSymbol3DVerticalOffsetProperties]
  }
  
  extension [Self <: LabelSymbol3DVerticalOffsetProperties](x: Self) {
    
    inline def setMaxWorldLength(value: Double): Self = StObject.set(x, "maxWorldLength", value.asInstanceOf[js.Any])
    
    inline def setMaxWorldLengthUndefined: Self = StObject.set(x, "maxWorldLength", js.undefined)
    
    inline def setMinWorldLength(value: Double): Self = StObject.set(x, "minWorldLength", value.asInstanceOf[js.Any])
    
    inline def setMinWorldLengthUndefined: Self = StObject.set(x, "minWorldLength", js.undefined)
    
    inline def setScreenLength(value: Double): Self = StObject.set(x, "screenLength", value.asInstanceOf[js.Any])
    
    inline def setScreenLengthUndefined: Self = StObject.set(x, "screenLength", js.undefined)
  }
}
