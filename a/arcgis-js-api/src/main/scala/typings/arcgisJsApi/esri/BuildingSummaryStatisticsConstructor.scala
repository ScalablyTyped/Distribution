package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingSummaryStatisticsConstructor
  extends StObject
     with /**
  * Contains statistics about the fields in all sublayers of a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html)
  */
Instantiable0[BuildingSummaryStatistics]
     with Instantiable1[/* properties */ BuildingSummaryStatisticsProperties, BuildingSummaryStatistics] {
  
  def fromJSON(json: Any): BuildingSummaryStatistics = js.native
}
