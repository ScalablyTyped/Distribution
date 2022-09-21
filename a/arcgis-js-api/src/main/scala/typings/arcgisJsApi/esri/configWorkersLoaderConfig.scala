package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait configWorkersLoaderConfig
  extends StObject
     with Object {
  
  /**
    * The AMD loader loads all code relative to the baseUrl.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Determines if the specified feature capabilities are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var has: js.UndefOr[Any] = js.undefined
  
  /**
    * Map paths in module identifiers to different paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var map: js.UndefOr[Any] = js.undefined
  
  /**
    * An array of objects which provide the package name and its location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var packages: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Map of module id fragments to file paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var paths: js.UndefOr[Any] = js.undefined
}
object configWorkersLoaderConfig {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): configWorkersLoaderConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[configWorkersLoaderConfig]
  }
  
  extension [Self <: configWorkersLoaderConfig](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setHas(value: Any): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
    
    inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
    
    inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPackages(value: js.Array[Any]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: Any*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setPaths(value: Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
  }
}
