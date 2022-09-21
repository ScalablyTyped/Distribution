package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAreaParametersConstructor
  extends StObject
     with /**
  * Input parameters for [serviceArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-serviceArea.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html)
  */
Instantiable0[ServiceAreaParameters]
     with Instantiable1[/* properties */ ServiceAreaParametersProperties, ServiceAreaParameters] {
  
  def fromJSON(json: Any): ServiceAreaParameters = js.native
}
