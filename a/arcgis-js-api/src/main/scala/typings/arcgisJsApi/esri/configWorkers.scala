package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait configWorkers extends StObject {
  
  /**
    * The AMD configuration object that is set in each worker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var loaderConfig: js.UndefOr[configWorkersLoaderConfig] = js.undefined
  
  /**
    * The absolute url to the AMD or SystemJS loader used in the worker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var loaderUrl: js.UndefOr[Any] = js.undefined
  
  /**
    * This is used by the `@arcgis/core` and `arcgis-js-api` NPM packages to control where to load a custom build of the `RemoteClient` from.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var workerPath: js.UndefOr[String] = js.undefined
}
object configWorkers {
  
  inline def apply(): configWorkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[configWorkers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: configWorkers] (val x: Self) extends AnyVal {
    
    inline def setLoaderConfig(value: configWorkersLoaderConfig): Self = StObject.set(x, "loaderConfig", value.asInstanceOf[js.Any])
    
    inline def setLoaderConfigUndefined: Self = StObject.set(x, "loaderConfig", js.undefined)
    
    inline def setLoaderUrl(value: Any): Self = StObject.set(x, "loaderUrl", value.asInstanceOf[js.Any])
    
    inline def setLoaderUrlUndefined: Self = StObject.set(x, "loaderUrl", js.undefined)
    
    inline def setWorkerPath(value: String): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
    
    inline def setWorkerPathUndefined: Self = StObject.set(x, "workerPath", js.undefined)
  }
}
