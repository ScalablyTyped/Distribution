package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsagePlan extends StObject {
  
  /**
    * The associated API stages of a usage plan.
    */
  var apiStages: js.UndefOr[ListOfApiStage] = js.undefined
  
  /**
    * The description of a usage plan.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of a UsagePlan resource.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a usage plan.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  var productCode: js.UndefOr[String] = js.undefined
  
  /**
    * The target maximum number of permitted requests per a given unit time interval.
    */
  var quota: js.UndefOr[QuotaSettings] = js.undefined
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * A map containing method level throttling information for API stage in a usage plan.
    */
  var throttle: js.UndefOr[ThrottleSettings] = js.undefined
}
object UsagePlan {
  
  inline def apply(): UsagePlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsagePlan] (val x: Self) extends AnyVal {
    
    inline def setApiStages(value: ListOfApiStage): Self = StObject.set(x, "apiStages", value.asInstanceOf[js.Any])
    
    inline def setApiStagesUndefined: Self = StObject.set(x, "apiStages", js.undefined)
    
    inline def setApiStagesVarargs(value: ApiStage*): Self = StObject.set(x, "apiStages", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProductCode(value: String): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def setQuota(value: QuotaSettings): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    inline def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setThrottle(value: ThrottleSettings): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
  }
}
