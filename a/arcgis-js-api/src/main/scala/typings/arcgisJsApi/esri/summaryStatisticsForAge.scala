package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for generating statistics for the age of features in a layer based on a given start time and end time.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatisticsForAge.html)
  */
@js.native
trait summaryStatisticsForAge extends js.Object {
  
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
  implicit class summaryStatisticsForAgeOps[Self <: summaryStatisticsForAge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSummaryStatisticsForAge(value: summaryStatisticsForAgeSummaryStatisticsForAgeParams => js.Promise[SummaryStatisticsResult]): Self = this.set("summaryStatisticsForAge", js.Any.fromFunction1(value))
  }
}
