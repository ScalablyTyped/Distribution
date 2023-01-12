package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUsagePlanRequest extends StObject {
  
  /**
    * The associated API stages of the usage plan.
    */
  var apiStages: js.UndefOr[ListOfApiStage] = js.undefined
  
  /**
    * The description of the usage plan.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the usage plan.
    */
  var name: String
  
  /**
    * The quota of the usage plan.
    */
  var quota: js.UndefOr[QuotaSettings] = js.undefined
  
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * The throttling limits of the usage plan.
    */
  var throttle: js.UndefOr[ThrottleSettings] = js.undefined
}
object CreateUsagePlanRequest {
  
  inline def apply(name: String): CreateUsagePlanRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUsagePlanRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUsagePlanRequest] (val x: Self) extends AnyVal {
    
    inline def setApiStages(value: ListOfApiStage): Self = StObject.set(x, "apiStages", value.asInstanceOf[js.Any])
    
    inline def setApiStagesUndefined: Self = StObject.set(x, "apiStages", js.undefined)
    
    inline def setApiStagesVarargs(value: ApiStage*): Self = StObject.set(x, "apiStages", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQuota(value: QuotaSettings): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    inline def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setThrottle(value: ThrottleSettings): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
  }
}
