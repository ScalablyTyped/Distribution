package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsagePlan extends StObject {
  
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
  implicit class UsagePlanMutableBuilder[Self <: UsagePlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiStages(value: ListOfApiStage): Self = StObject.set(x, "apiStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiStagesUndefined: Self = StObject.set(x, "apiStages", js.undefined)
    
    @scala.inline
    def setApiStagesVarargs(value: ApiStage*): Self = StObject.set(x, "apiStages", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProductCode(value: String): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    @scala.inline
    def setQuota(value: QuotaSettings): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setThrottle(value: ThrottleSettings): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
  }
}
