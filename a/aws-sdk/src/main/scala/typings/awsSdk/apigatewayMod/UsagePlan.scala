package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsagePlan extends js.Object {
  
  /**
    * The associated API stages of a usage plan.
    */
  var apiStages: js.UndefOr[ListOfApiStage] = js.native
  
  /**
    * The description of a usage plan.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The identifier of a UsagePlan resource.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The name of a usage plan.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  var productCode: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of permitted requests per a given unit time interval.
    */
  var quota: js.UndefOr[QuotaSettings] = js.native
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * The request throttle limits of a usage plan.
    */
  var throttle: js.UndefOr[ThrottleSettings] = js.native
}
object UsagePlan {
  
  @scala.inline
  def apply(): UsagePlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlan]
  }
  
  @scala.inline
  implicit class UsagePlanOps[Self <: UsagePlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiStagesVarargs(value: ApiStage*): Self = this.set("apiStages", js.Array(value :_*))
    
    @scala.inline
    def setApiStages(value: ListOfApiStage): Self = this.set("apiStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiStages: Self = this.set("apiStages", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProductCode(value: String): Self = this.set("productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCode: Self = this.set("productCode", js.undefined)
    
    @scala.inline
    def setQuota(value: QuotaSettings): Self = this.set("quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuota: Self = this.set("quota", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setThrottle(value: ThrottleSettings): Self = this.set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
  }
}
