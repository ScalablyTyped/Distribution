package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.elevation
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationDimension
  extends StObject
     with Object {
  
  /**
    * Name of dimensional axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#ElevationDimension)
    */
  var name: elevation
}
object ElevationDimension {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ElevationDimension = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = "elevation", propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ElevationDimension]
  }
  
  extension [Self <: ElevationDimension](x: Self) {
    
    inline def setName(value: elevation): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
