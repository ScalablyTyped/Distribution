package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExperimentRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: ClientToken
  
  /**
    * The ID of the experiment template.
    */
  var experimentTemplateId: ExperimentTemplateId
  
  /**
    * The tags to apply to the experiment.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object StartExperimentRequest {
  
  inline def apply(clientToken: ClientToken, experimentTemplateId: ExperimentTemplateId): StartExperimentRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], experimentTemplateId = experimentTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExperimentRequest]
  }
  
  extension [Self <: StartExperimentRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setExperimentTemplateId(value: ExperimentTemplateId): Self = StObject.set(x, "experimentTemplateId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
