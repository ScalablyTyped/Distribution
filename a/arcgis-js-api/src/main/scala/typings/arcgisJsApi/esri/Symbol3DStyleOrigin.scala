package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Symbol3DStyleOrigin
  extends StObject
     with Object {
  
  /**
    * name of the symbol in the style referenced by styleName or styleUrl.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var name: String
  
  /**
    * a well-known esri-provided style, such as `EsriThematicShapesStyle`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleName: js.UndefOr[String] = js.undefined
  
  /**
    * url to a style definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html#styleOrigin)
    */
  var styleUrl: js.UndefOr[String] = js.undefined
}
object Symbol3DStyleOrigin {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Symbol3DStyleOrigin = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Symbol3DStyleOrigin]
  }
  
  extension [Self <: Symbol3DStyleOrigin](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
    
    inline def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
    
    inline def setStyleUrl(value: String): Self = StObject.set(x, "styleUrl", value.asInstanceOf[js.Any])
    
    inline def setStyleUrlUndefined: Self = StObject.set(x, "styleUrl", js.undefined)
  }
}
