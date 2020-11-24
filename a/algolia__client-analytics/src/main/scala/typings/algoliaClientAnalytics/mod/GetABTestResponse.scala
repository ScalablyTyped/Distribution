package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetABTestResponse extends js.Object {
  
  /**
    * The ab test unique identifier.
    */
  var abTestID: Double = js.native
  
  /**
    * The ab test significance based on click data. Should be higher than 0.95 to be considered significant - no matter which variant is winning.
    */
  var clickSignificance: Double = js.native
  
  /**
    *
    * The ab test significance based on conversion data. Should be higher than 0.95 to be considered significant - no matter which variant is winning.
    */
  var conversionSignificance: Double = js.native
  
  /**
    * The ab test created date, if any.
    */
  var createdAt: String = js.native
  
  /**
    * The ab test end date, if any.
    */
  var endAt: String = js.native
  
  /**
    * The ab test name.
    */
  var name: String = js.native
  
  /**
    * The ab test status.
    */
  var status: String = js.native
  
  /**
    * The ab test updated date.
    */
  var updatedAt: String = js.native
  
  /**
    * The ab test list of variants.
    */
  var variants: js.Array[VariantResponse] = js.native
}
object GetABTestResponse {
  
  @scala.inline
  def apply(
    abTestID: Double,
    clickSignificance: Double,
    conversionSignificance: Double,
    createdAt: String,
    endAt: String,
    name: String,
    status: String,
    updatedAt: String,
    variants: js.Array[VariantResponse]
  ): GetABTestResponse = {
    val __obj = js.Dynamic.literal(abTestID = abTestID.asInstanceOf[js.Any], clickSignificance = clickSignificance.asInstanceOf[js.Any], conversionSignificance = conversionSignificance.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], endAt = endAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetABTestResponse]
  }
  
  @scala.inline
  implicit class GetABTestResponseOps[Self <: GetABTestResponse] (val x: Self) extends AnyVal {
    
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
    def setAbTestID(value: Double): Self = this.set("abTestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickSignificance(value: Double): Self = this.set("clickSignificance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionSignificance(value: Double): Self = this.set("conversionSignificance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAt(value: String): Self = this.set("endAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsVarargs(value: VariantResponse*): Self = this.set("variants", js.Array(value :_*))
    
    @scala.inline
    def setVariants(value: js.Array[VariantResponse]): Self = this.set("variants", value.asInstanceOf[js.Any])
  }
}
