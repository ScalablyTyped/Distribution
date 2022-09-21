package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatisticDefinitionConstructor
  extends StObject
     with /**
  * This class defines the parameters for querying a layer or layer view for statistics.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html)
  */
Instantiable0[StatisticDefinition]
     with Instantiable1[/* properties */ StatisticDefinitionProperties, StatisticDefinition] {
  
  def fromJSON(json: Any): StatisticDefinition = js.native
}
