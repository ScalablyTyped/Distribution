package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferParametersConstructor
  extends StObject
     with /**
  * Sets the distances, units, and other parameters for the [buffer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#buffer) method on the [geometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BufferParameters.html)
  */
Instantiable0[BufferParameters]
     with Instantiable1[/* properties */ BufferParametersProperties, BufferParameters] {
  
  def fromJSON(json: Any): BufferParameters = js.native
}
