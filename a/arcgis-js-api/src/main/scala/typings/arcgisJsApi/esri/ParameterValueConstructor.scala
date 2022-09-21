package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterValueConstructor
  extends StObject
     with /**
  * Represents the output parameters of a [geoprocessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor.html) method and their properties and values.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ParameterValue.html)
  */
Instantiable0[ParameterValue]
     with Instantiable1[/* properties */ ParameterValueProperties, ParameterValue] {
  
  def fromJSON(json: Any): ParameterValue = js.native
}
