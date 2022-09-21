package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LengthsParametersConstructor
  extends StObject
     with /**
  * Sets the length units and other parameters for the [geometryService.lengths()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#lengths) operation.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LengthsParameters.html)
  */
Instantiable0[LengthsParameters]
     with Instantiable1[/* properties */ LengthsParametersProperties, LengthsParameters] {
  
  def fromJSON(json: Any): LengthsParameters = js.native
}
