package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionResultConstructor
  extends StObject
     with /**
  * A trace can optionally return a aggregated function result if the trace configuration asked for it.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-FunctionResult.html)
  */
Instantiable0[FunctionResult]
     with Instantiable1[/* properties */ FunctionResultProperties, FunctionResult] {
  
  def fromJSON(json: Any): FunctionResult = js.native
}
