package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUsagePlanRequest extends StObject {
  
  /**
    * The associated API stages of the usage plan.
    */
  var apiStages: js.UndefOr[ListOfApiStage] = js.native
  
  /**
    * The description of the usage plan.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Required] The name of the usage plan.
    */
  var name: String = js.native
  
  /**
    * The quota of the usage plan.
    */
  var quota: js.UndefOr[QuotaSettings] = js.native
  
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * The throttling limits of the usage plan.
    */
  var throttle: js.UndefOr[ThrottleSettings] = js.native
}
object CreateUsagePlanRequest {
  
  @scala.inline
  def apply(name: String): CreateUsagePlanRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUsagePlanRequest]
  }
  
  @scala.inline
  implicit class CreateUsagePlanRequestMutableBuilder[Self <: CreateUsagePlanRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
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
