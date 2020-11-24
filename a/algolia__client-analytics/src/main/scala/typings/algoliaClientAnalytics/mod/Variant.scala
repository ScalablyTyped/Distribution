package typings.algoliaClientAnalytics.mod

import typings.algoliaClientSearch.mod.SearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variant extends js.Object {
  
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
    * Percentage of the traffic that should be going to the variant. The sum of the percentage should be equal to 100.
    */
  val trafficPercentage: Double = js.native
}
object Variant {
  
  @scala.inline
  def apply(index: String, trafficPercentage: Double): Variant = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], trafficPercentage = trafficPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variant]
  }
  
  @scala.inline
  implicit class VariantOps[Self <: Variant] (val x: Self) extends AnyVal {
    
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
    def setCustomSearchParameters(value: SearchOptions): Self = this.set("customSearchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSearchParameters: Self = this.set("customSearchParameters", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
