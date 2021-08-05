package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`map-layer`
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicMapLayer
  extends StObject
     with Object {
  
  /**
    * An optional property for specifying the GDB version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var gdbVersion: String
  
  /**
    * The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id) of the service sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var mapLayerId: Double
  
  /**
    * This value is always `map-layer` and is inferred when the `mapLayerId` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var `type`: `map-layer`
}
object DynamicMapLayer {
  
  inline def apply(
    constructor: js.Function,
    gdbVersion: String,
    hasOwnProperty: PropertyKey => Boolean,
    mapLayerId: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DynamicMapLayer = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], gdbVersion = gdbVersion.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mapLayerId = mapLayerId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("map-layer")
    __obj.asInstanceOf[DynamicMapLayer]
  }
  
  extension [Self <: DynamicMapLayer](x: Self) {
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setMapLayerId(value: Double): Self = StObject.set(x, "mapLayerId", value.asInstanceOf[js.Any])
    
    inline def setType(value: `map-layer`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
