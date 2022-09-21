package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrimExtendParametersConstructor
  extends StObject
     with /**
  * Used to set the parameters for the [geometryService.trimExtend](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#trimExtend) operation.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TrimExtendParameters.html)
  */
Instantiable0[TrimExtendParameters]
     with Instantiable1[/* properties */ TrimExtendParametersProperties, TrimExtendParameters] {
  
  def fromJSON(json: Any): TrimExtendParameters = js.native
}
