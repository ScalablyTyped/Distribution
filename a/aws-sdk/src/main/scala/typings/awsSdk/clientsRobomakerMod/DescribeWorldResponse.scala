package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorldResponse extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the world was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (arn) of the world generation job that generated the world.
    */
  var generationJob: js.UndefOr[Arn] = js.undefined
  
  /**
    * A map that contains tag keys and tag values that are attached to the world.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The world template.
    */
  var template: js.UndefOr[Arn] = js.undefined
  
  /**
    * Returns the JSON formatted string that describes the contents of your world.
    */
  var worldDescriptionBody: js.UndefOr[Json] = js.undefined
}
object DescribeWorldResponse {
  
  inline def apply(): DescribeWorldResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorldResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWorldResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setGenerationJob(value: Arn): Self = StObject.set(x, "generationJob", value.asInstanceOf[js.Any])
    
    inline def setGenerationJobUndefined: Self = StObject.set(x, "generationJob", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setWorldDescriptionBody(value: Json): Self = StObject.set(x, "worldDescriptionBody", value.asInstanceOf[js.Any])
    
    inline def setWorldDescriptionBodyUndefined: Self = StObject.set(x, "worldDescriptionBody", js.undefined)
  }
}
