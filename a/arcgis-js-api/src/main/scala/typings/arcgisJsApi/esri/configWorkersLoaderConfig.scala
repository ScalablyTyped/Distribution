package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait configWorkersLoaderConfig extends Object {
  
  /**
    * The AMD loader loads all code relative to the baseUrl.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var baseUrl: js.UndefOr[String] = js.native
  
  /**
    * Determines if the specified feature capabilities are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var has: js.UndefOr[js.Any] = js.native
  
  /**
    * Map paths in module identifiers to different paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var map: js.UndefOr[js.Any] = js.native
  
  /**
    * An array of objects which provide the package name and its location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var packages: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Map of module id fragments to file paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var paths: js.UndefOr[js.Any] = js.native
}
object configWorkersLoaderConfig {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): configWorkersLoaderConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[configWorkersLoaderConfig]
  }
  
  @scala.inline
  implicit class configWorkersLoaderConfigMutableBuilder[Self <: configWorkersLoaderConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setHas(value: js.Any): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
    
    @scala.inline
    def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setPackages(value: js.Array[_]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: js.Any*): Self = StObject.set(x, "packages", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
  }
}
