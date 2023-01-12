package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorldTemplateRequest extends StObject {
  
  /**
    * The name of the template.
    */
  var name: js.UndefOr[TemplateName] = js.undefined
  
  /**
    * The Amazon Resource Name (arn) of the world template to update.
    */
  var template: Arn
  
  /**
    * The world template body.
    */
  var templateBody: js.UndefOr[Json] = js.undefined
  
  /**
    * The location of the world template.
    */
  var templateLocation: js.UndefOr[TemplateLocation] = js.undefined
}
object UpdateWorldTemplateRequest {
  
  inline def apply(template: Arn): UpdateWorldTemplateRequest = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorldTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorldTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: TemplateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateBody(value: Json): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "templateBody", js.undefined)
    
    inline def setTemplateLocation(value: TemplateLocation): Self = StObject.set(x, "templateLocation", value.asInstanceOf[js.Any])
    
    inline def setTemplateLocationUndefined: Self = StObject.set(x, "templateLocation", js.undefined)
  }
}
