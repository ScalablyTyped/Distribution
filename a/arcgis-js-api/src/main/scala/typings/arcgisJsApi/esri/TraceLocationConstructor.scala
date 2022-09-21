package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceLocationConstructor
  extends StObject
     with /**
  * To perform the trace analytic, users can optionally supply a list of locations in forms of globalIds (UUID) and terminals.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html)
  */
Instantiable0[TraceLocation]
     with Instantiable1[/* properties */ TraceLocationProperties, TraceLocation] {
  
  def fromJSON(json: Any): TraceLocation = js.native
}
