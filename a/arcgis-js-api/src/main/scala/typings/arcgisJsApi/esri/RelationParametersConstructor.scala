package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationParametersConstructor
  extends StObject
     with /**
  * Sets the relation and other parameters for the [geometryService.relation()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#relation) operation.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationParameters.html)
  */
Instantiable0[RelationParameters]
     with Instantiable1[/* properties */ RelationParametersProperties, RelationParameters] {
  
  def fromJSON(json: Any): RelationParameters = js.native
}
