package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EachAlwaysResult extends StObject {
  
  /**
  		 * The error with which the promise rejected.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
  		 */
  var error: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The promise that has been fulfilled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
  		 */
  var promise: js.Promise[Any]
  
  /**
  		 * The value with which the promise resolved.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
  		 */
  var value: js.UndefOr[Any] = js.undefined
}
object EachAlwaysResult {
  
  inline def apply(promise: js.Promise[Any]): EachAlwaysResult = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachAlwaysResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EachAlwaysResult] (val x: Self) extends AnyVal {
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPromise(value: js.Promise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
