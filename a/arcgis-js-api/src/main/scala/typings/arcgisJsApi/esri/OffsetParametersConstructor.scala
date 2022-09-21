package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetParametersConstructor
  extends StObject
     with /**
  * Sets the offset distance, type and other parameters for the [geometryService.offset](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#offset) operation.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html)
  */
Instantiable0[OffsetParameters]
     with Instantiable1[/* properties */ OffsetParametersProperties, OffsetParameters] {
  
  def fromJSON(json: Any): OffsetParameters = js.native
}
