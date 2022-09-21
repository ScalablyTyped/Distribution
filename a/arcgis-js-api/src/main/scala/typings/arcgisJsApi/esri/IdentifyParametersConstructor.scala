package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentifyParametersConstructor
  extends StObject
     with /**
  * Input parameters for the [identify](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-identify.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html)
  */
Instantiable0[IdentifyParameters]
     with Instantiable1[/* properties */ IdentifyParametersProperties, IdentifyParameters] {
  
  def fromJSON(json: Any): IdentifyParameters = js.native
}
