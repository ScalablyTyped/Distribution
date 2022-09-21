package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceParametersConstructor
  extends StObject
     with /**
  * The list of parameters that are needed to determine how the trace analytic will be executed.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html)
  */
Instantiable0[TraceParameters]
     with Instantiable1[/* properties */ TraceParametersProperties, TraceParameters] {
  
  def fromJSON(json: Any): TraceParameters = js.native
}
