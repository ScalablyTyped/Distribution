package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`map-layer`
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.DynamicMapLayer & {  type :'map-layer'} */
trait DynamicMapLayertypemaplay extends StObject {
  
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* standard es5 */
  var constructor: js.Function
  
  /**
    * An optional property for specifying the GDB version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var gdbVersion: String
  
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* standard es5 */
  def hasOwnProperty(v: PropertyKey): Boolean
  
  /**
    * The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id) of the service sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var mapLayerId: Double
  
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* standard es5 */
  def propertyIsEnumerable(v: PropertyKey): Boolean
  
  /**
    * This value is always `map-layer` and is inferred when the `mapLayerId` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var `type`: `map-layer`
}
object DynamicMapLayertypemaplay {
  
  inline def apply(
    constructor: js.Function,
    gdbVersion: String,
    hasOwnProperty: PropertyKey => Boolean,
    mapLayerId: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DynamicMapLayertypemaplay = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], gdbVersion = gdbVersion.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mapLayerId = mapLayerId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("map-layer")
    __obj.asInstanceOf[DynamicMapLayertypemaplay]
  }
  
  extension [Self <: DynamicMapLayertypemaplay](x: Self) {
    
    inline def setConstructor(value: js.Function): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setHasOwnProperty(value: PropertyKey => Boolean): Self = StObject.set(x, "hasOwnProperty", js.Any.fromFunction1(value))
    
    inline def setMapLayerId(value: Double): Self = StObject.set(x, "mapLayerId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIsEnumerable(value: PropertyKey => Boolean): Self = StObject.set(x, "propertyIsEnumerable", js.Any.fromFunction1(value))
    
    inline def setType(value: `map-layer`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
