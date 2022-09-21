package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneralizeParametersConstructor
  extends StObject
     with /**
  * Sets the geometries, maximum deviation and units for the [generalize](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#generalize) operation.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-GeneralizeParameters.html)
  */
Instantiable0[GeneralizeParameters]
     with Instantiable1[/* properties */ GeneralizeParametersProperties, GeneralizeParameters] {
  
  def fromJSON(json: Any): GeneralizeParameters = js.native
}
