package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Trace is the core analytic of the utility network, by providing a set of parameters, you can start the trace in one or more features and traverse the network topology satisfying the parameters until the trace stops at end points or when the definition of the trace condition barriers are met.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-trace.html)
  */
@js.native
trait trace extends StObject {
  
  /**
    * The trace function takes a set of parameters, executes the trace analytic on the backend, and returns trace results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-trace.html#trace)
    */
  def trace(url: String, params: TraceParameters): js.Promise[TraceResult] = js.native
  def trace(url: String, params: TraceParameters, requestOptions: Any): js.Promise[TraceResult] = js.native
}
