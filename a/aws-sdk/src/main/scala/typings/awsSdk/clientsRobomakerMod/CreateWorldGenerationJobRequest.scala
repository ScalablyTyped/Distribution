package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorldGenerationJobRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * A map that contains tag keys and tag values that are attached to the world generator job.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Amazon Resource Name (arn) of the world template describing the worlds you want to create.
    */
  var template: Arn
  
  /**
    * Information about the world count.
    */
  var worldCount: WorldCount
  
  /**
    * A map that contains tag keys and tag values that are attached to the generated worlds.
    */
  var worldTags: js.UndefOr[TagMap] = js.undefined
}
object CreateWorldGenerationJobRequest {
  
  inline def apply(template: Arn, worldCount: WorldCount): CreateWorldGenerationJobRequest = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any], worldCount = worldCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorldGenerationJobRequest]
  }
  
  extension [Self <: CreateWorldGenerationJobRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setWorldCount(value: WorldCount): Self = StObject.set(x, "worldCount", value.asInstanceOf[js.Any])
    
    inline def setWorldTags(value: TagMap): Self = StObject.set(x, "worldTags", value.asInstanceOf[js.Any])
    
    inline def setWorldTagsUndefined: Self = StObject.set(x, "worldTags", js.undefined)
  }
}
