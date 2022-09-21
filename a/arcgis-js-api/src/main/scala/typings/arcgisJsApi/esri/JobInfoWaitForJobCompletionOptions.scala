package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobInfoWaitForJobCompletionOptions
  extends StObject
     with Object {
  
  /**
    * The time in millisecond between remote job status requests.
    *
    * @default 1000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#waitForJobCompletion)
    */
  var interval: js.UndefOr[Any] = js.undefined
  
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable asynchronous job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#waitForJobCompletion)
    */
  var signal: js.UndefOr[Any] = js.undefined
  
  /**
    * Callback function that is called at the specified interval.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#waitForJobCompletion)
    */
  var statusCallback: js.UndefOr[Any] = js.undefined
}
object JobInfoWaitForJobCompletionOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): JobInfoWaitForJobCompletionOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[JobInfoWaitForJobCompletionOptions]
  }
  
  extension [Self <: JobInfoWaitForJobCompletionOptions](x: Self) {
    
    inline def setInterval(value: Any): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setSignal(value: Any): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStatusCallback(value: Any): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
  }
}
