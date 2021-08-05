package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait configWorkers
  extends StObject
     with Object {
  
  /**
    * The configuration parameters for [the workers framework](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var loaderConfig: js.UndefOr[configWorkersLoaderConfig] = js.undefined
  
  /**
    * The absolute url to the AMD loader used in the worker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var loaderUrl: js.UndefOr[js.Any] = js.undefined
}
object configWorkers {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): configWorkers = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[configWorkers]
  }
  
  extension [Self <: configWorkers](x: Self) {
    
    inline def setLoaderConfig(value: configWorkersLoaderConfig): Self = StObject.set(x, "loaderConfig", value.asInstanceOf[js.Any])
    
    inline def setLoaderConfigUndefined: Self = StObject.set(x, "loaderConfig", js.undefined)
    
    inline def setLoaderUrl(value: js.Any): Self = StObject.set(x, "loaderUrl", value.asInstanceOf[js.Any])
    
    inline def setLoaderUrlUndefined: Self = StObject.set(x, "loaderUrl", js.undefined)
  }
}
