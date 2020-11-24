package typings.algoliaClientAnalytics.mod

import typings.algoliaClientSearch.mod.SearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-analytics.@algolia/client-analytics.Variant & {  averageClickPosition :number | undefined,   clickCount :number | undefined,   clickThroughRate :number | undefined,   conversionCount :number | undefined,   conversionRate :number | undefined,   noResultCount :number | undefined,   trackedSearchCount :number | undefined,   searchCount :number | undefined,   userCount :number | undefined,   customSearchParameters :@algolia/client-search.@algolia/client-search.SearchOptions | undefined} */
@js.native
trait VariantResponse extends js.Object {
  
  /**
    * Average click position for the variant.
    */
  var averageClickPosition: js.UndefOr[Double] = js.native
  
  /**
    * Distinct click count for the variant.
    */
  var clickCount: js.UndefOr[Double] = js.native
  
  /**
    * Click through rate for the variant.
    */
  var clickThroughRate: js.UndefOr[Double] = js.native
  
  /**
    * Click through rate for the variant.
    */
  var conversionCount: js.UndefOr[Double] = js.native
  
  /**
    * Distinct conversion count for the variant.
    */
  var conversionRate: js.UndefOr[Double] = js.native
  
  /**
    * The search parameters.
    */
  val customSearchParameters: js.UndefOr[SearchOptions] = js.native
  
  /**
    * Description of the variant. Useful when seing the results in the dashboard or via the API.
    */
  val description: js.UndefOr[String] = js.native
  
  /**
    * The index name.
    */
  val index: String = js.native
  
  /**
    * No result count.
    */
  var noResultCount: js.UndefOr[Double] = js.native
  
  /**
    * Search count.
    */
  var searchCount: js.UndefOr[Double] = js.native
  
  /**
    * Tracked search count.
    */
  var trackedSearchCount: js.UndefOr[Double] = js.native
  
  /**
    * Percentage of the traffic that should be going to the variant. The sum of the percentage should be equal to 100.
    */
  val trafficPercentage: Double = js.native
  
  /**
    * User count.
    */
  var userCount: js.UndefOr[Double] = js.native
}
object VariantResponse {
  
  @scala.inline
  def apply(index: String, trafficPercentage: Double): VariantResponse = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], trafficPercentage = trafficPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantResponse]
  }
  
  @scala.inline
  implicit class VariantResponseOps[Self <: VariantResponse] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPercentage(value: Double): Self = this.set("trafficPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageClickPosition(value: Double): Self = this.set("averageClickPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageClickPosition: Self = this.set("averageClickPosition", js.undefined)
    
    @scala.inline
    def setClickCount(value: Double): Self = this.set("clickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickCount: Self = this.set("clickCount", js.undefined)
    
    @scala.inline
    def setClickThroughRate(value: Double): Self = this.set("clickThroughRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughRate: Self = this.set("clickThroughRate", js.undefined)
    
    @scala.inline
    def setConversionCount(value: Double): Self = this.set("conversionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionCount: Self = this.set("conversionCount", js.undefined)
    
    @scala.inline
    def setConversionRate(value: Double): Self = this.set("conversionRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionRate: Self = this.set("conversionRate", js.undefined)
    
    @scala.inline
    def setCustomSearchParameters(value: SearchOptions): Self = this.set("customSearchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSearchParameters: Self = this.set("customSearchParameters", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setNoResultCount(value: Double): Self = this.set("noResultCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResultCount: Self = this.set("noResultCount", js.undefined)
    
    @scala.inline
    def setSearchCount(value: Double): Self = this.set("searchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchCount: Self = this.set("searchCount", js.undefined)
    
    @scala.inline
    def setTrackedSearchCount(value: Double): Self = this.set("trackedSearchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackedSearchCount: Self = this.set("trackedSearchCount", js.undefined)
    
    @scala.inline
    def setUserCount(value: Double): Self = this.set("userCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserCount: Self = this.set("userCount", js.undefined)
  }
}
