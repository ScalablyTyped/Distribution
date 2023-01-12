package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorldTemplateBodyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world generator job.
    */
  var generationJob: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (arn) of the world template.
    */
  var template: js.UndefOr[Arn] = js.undefined
}
object GetWorldTemplateBodyRequest {
  
  inline def apply(): GetWorldTemplateBodyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorldTemplateBodyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorldTemplateBodyRequest] (val x: Self) extends AnyVal {
    
    inline def setGenerationJob(value: Arn): Self = StObject.set(x, "generationJob", value.asInstanceOf[js.Any])
    
    inline def setGenerationJobUndefined: Self = StObject.set(x, "generationJob", js.undefined)
    
    inline def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
