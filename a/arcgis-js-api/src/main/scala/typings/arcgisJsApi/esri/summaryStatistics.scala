package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for generating attribute statistics in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on values returned from a given field.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html)
  */
@js.native
trait summaryStatistics extends StObject {
  
  /**
    * Returns an object containing various statistics describing a set of values returned from a field (or expression) in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html#summaryStatistics)
    */
  def summaryStatistics(params: summaryStatisticsSummaryStatisticsParams): js.Promise[SummaryStatisticsResult] = js.native
}
object summaryStatistics {
  
  @scala.inline
  def apply(summaryStatistics: summaryStatisticsSummaryStatisticsParams => js.Promise[SummaryStatisticsResult]): summaryStatistics = {
    val __obj = js.Dynamic.literal(summaryStatistics = js.Any.fromFunction1(summaryStatistics))
    __obj.asInstanceOf[summaryStatistics]
  }
  
  @scala.inline
  implicit class summaryStatisticsMutableBuilder[Self <: summaryStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummaryStatistics(value: summaryStatisticsSummaryStatisticsParams => js.Promise[SummaryStatisticsResult]): Self = StObject.set(x, "summaryStatistics", js.Any.fromFunction1(value))
  }
}
