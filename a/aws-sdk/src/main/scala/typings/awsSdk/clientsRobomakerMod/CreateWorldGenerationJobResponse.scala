package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorldGenerationJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the world generator job.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the world generator job was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The failure code of the world generator job if it failed:  InternalServiceError  Internal service error.  LimitExceeded  The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed.   ResourceNotFound  The specified resource could not be found.   RequestThrottled  The request was throttled.  InvalidInput  An input parameter in the request is not valid.  
    */
  var failureCode: js.UndefOr[WorldGenerationJobErrorCode] = js.undefined
  
  /**
    * The status of the world generator job.  Pending  The world generator job request is pending.  Running  The world generator job is running.   Completed  The world generator job completed.   Failed  The world generator job failed. See failureCode for more information.   PartialFailed  Some worlds did not generate.  Canceled  The world generator job was cancelled.  Canceling  The world generator job is being cancelled.  
    */
  var status: js.UndefOr[WorldGenerationJobStatus] = js.undefined
  
  /**
    * A map that contains tag keys and tag values that are attached to the world generator job.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Amazon Resource Name (arn) of the world template.
    */
  var template: js.UndefOr[Arn] = js.undefined
  
  /**
    * Information about the world count. 
    */
  var worldCount: js.UndefOr[WorldCount] = js.undefined
  
  /**
    * A map that contains tag keys and tag values that are attached to the generated worlds.
    */
  var worldTags: js.UndefOr[TagMap] = js.undefined
}
object CreateWorldGenerationJobResponse {
  
  inline def apply(): CreateWorldGenerationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorldGenerationJobResponse]
  }
  
  extension [Self <: CreateWorldGenerationJobResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setFailureCode(value: WorldGenerationJobErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setStatus(value: WorldGenerationJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setWorldCount(value: WorldCount): Self = StObject.set(x, "worldCount", value.asInstanceOf[js.Any])
    
    inline def setWorldCountUndefined: Self = StObject.set(x, "worldCount", js.undefined)
    
    inline def setWorldTags(value: TagMap): Self = StObject.set(x, "worldTags", value.asInstanceOf[js.Any])
    
    inline def setWorldTagsUndefined: Self = StObject.set(x, "worldTags", js.undefined)
  }
}
