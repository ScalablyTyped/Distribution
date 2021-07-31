package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoprocessorWaitForJobCompletionOptions
  extends StObject
     with Object {
  
  /**
    * The time in millisecond between remote job status requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#waitForJobCompletion)
    */
  var interval: js.UndefOr[js.Any] = js.undefined
  
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable asynchronous job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#waitForJobCompletion)
    */
  var signal: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Callback function that is called at the specified interval.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#waitForJobCompletion)
    */
  var statusCallback: js.UndefOr[js.Any] = js.undefined
}
object GeoprocessorWaitForJobCompletionOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GeoprocessorWaitForJobCompletionOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GeoprocessorWaitForJobCompletionOptions]
  }
  
  @scala.inline
  implicit class GeoprocessorWaitForJobCompletionOptionsMutableBuilder[Self <: GeoprocessorWaitForJobCompletionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: js.Any): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setSignal(value: js.Any): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setStatusCallback(value: js.Any): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
  }
}
