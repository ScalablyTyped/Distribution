package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceResultConstructor
  extends StObject
     with /**
  * This class defines the collection of results returned from the trace function.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html)
  */
Instantiable0[TraceResult]
     with Instantiable1[/* properties */ TraceResultProperties, TraceResult] {
  
  def fromJSON(json: Any): TraceResult = js.native
}
