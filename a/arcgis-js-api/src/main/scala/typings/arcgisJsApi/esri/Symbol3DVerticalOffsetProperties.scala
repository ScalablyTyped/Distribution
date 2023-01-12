package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Symbol3DVerticalOffsetProperties extends StObject {
  
  /**
    * The maximum vertical symbol offset in world units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-Symbol3DVerticalOffset.html#maxWorldLength)
    */
  var maxWorldLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum vertical symbol offset in world units.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-Symbol3DVerticalOffset.html#minWorldLength)
    */
  var minWorldLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Vertical symbol offset in screen size.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-Symbol3DVerticalOffset.html#screenLength)
    */
  var screenLength: js.UndefOr[Double | String] = js.undefined
}
object Symbol3DVerticalOffsetProperties {
  
  inline def apply(): Symbol3DVerticalOffsetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Symbol3DVerticalOffsetProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Symbol3DVerticalOffsetProperties] (val x: Self) extends AnyVal {
    
    inline def setMaxWorldLength(value: Double): Self = StObject.set(x, "maxWorldLength", value.asInstanceOf[js.Any])
    
    inline def setMaxWorldLengthUndefined: Self = StObject.set(x, "maxWorldLength", js.undefined)
    
    inline def setMinWorldLength(value: Double): Self = StObject.set(x, "minWorldLength", value.asInstanceOf[js.Any])
    
    inline def setMinWorldLengthUndefined: Self = StObject.set(x, "minWorldLength", js.undefined)
    
    inline def setScreenLength(value: Double | String): Self = StObject.set(x, "screenLength", value.asInstanceOf[js.Any])
    
    inline def setScreenLengthUndefined: Self = StObject.set(x, "screenLength", js.undefined)
  }
}
