package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for generating statistics for the age of features in a layer based on a given start time and end time.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html)
  */
@js.native
trait summaryStatisticsForAge extends StObject {
  
  /**
    * Returns an object containing various statistics describing an age value (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html#summaryStatisticsForAge)
    */
  def summaryStatisticsForAge(params: summaryStatisticsForAgeSummaryStatisticsForAgeParams): js.Promise[SummaryStatisticsResult] = js.native
}
object summaryStatisticsForAge {
  
  @scala.inline
  def apply(
    summaryStatisticsForAge: summaryStatisticsForAgeSummaryStatisticsForAgeParams => js.Promise[SummaryStatisticsResult]
  ): summaryStatisticsForAge = {
    val __obj = js.Dynamic.literal(summaryStatisticsForAge = js.Any.fromFunction1(summaryStatisticsForAge))
    __obj.asInstanceOf[summaryStatisticsForAge]
  }
  
  @scala.inline
  implicit class summaryStatisticsForAgeMutableBuilder[Self <: summaryStatisticsForAge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummaryStatisticsForAge(value: summaryStatisticsForAgeSummaryStatisticsForAgeParams => js.Promise[SummaryStatisticsResult]): Self = StObject.set(x, "summaryStatisticsForAge", js.Any.fromFunction1(value))
  }
}
